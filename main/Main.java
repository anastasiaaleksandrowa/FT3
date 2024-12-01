package main;

import model.Person;
import model.FamilyTree;
import file.FileHandler;
import file.FileHandlerImpl;
import sort.Sorter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            // Создаем людей
            Person alice = new Person("Alice", sdf.parse("01/01/1990"));
            Person bob = new Person("Bob", sdf.parse("05/06/1985"));
            Person charlie = new Person("Charlie", sdf.parse("03/03/1995"));

            // Структура семьи
            alice.addChild(bob);
            alice.addChild(charlie);

            // Создаем генеалогическое древо
            FamilyTree familyTree = new FamilyTree();
            familyTree.addPerson(alice);
            familyTree.addPerson(bob);
            familyTree.addPerson(charlie);

            // Запись в файл
            FileHandler fileHandler = new FileHandlerImpl();
            fileHandler.writeToFile(familyTree, "family_tree.dat");

            // Чтение из файла
            FamilyTree loadedFamilyTree = fileHandler.readFromFile("family_tree.dat");

            // Сортировка списка людей
            Sorter sorter = new Sorter();
            List<Person> peopleList = new ArrayList<>(loadedFamilyTree.getPeople().values());
            sorter.sortByName(peopleList); // Сортировка по имени

            // Выводим отсортированный список по имени
            System.out.println("Список людей, отсортированный по имени:");
            for (Person person : peopleList) {
                System.out.println(person.getName() + " - " + person.getBirthDate());
            }

            sorter.sortByBirthDate(peopleList); // Сортировка по дате рождения

            // Выводим отсортированный список по дате рождения
            System.out.println("\nСписок людей, отсортированный по дате рождения:");
            for (Person person : peopleList) {
                System.out.println(person.getName() + " - " + person.getBirthDate());
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}