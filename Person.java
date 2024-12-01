

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person implements Serializable, Comparable<Person> {
    private static final long serialVersionUID = 1L;
    private String name;
    private Date birthDate; // Добавлено поле для даты рождения
    private List<Person> children;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

    public List<Person> getChildren() {
        return this.children;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return this.birthDate; // Геттер для даты рождения
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name); // Сравнение по имени
    }
}