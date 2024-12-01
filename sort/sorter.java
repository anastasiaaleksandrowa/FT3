package sort;

import model.Person;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Sortable {

    @Override
    public void sortByName(List<Person> people) {
        Collections.sort(people);
    }

    @Override
    public void sortByBirthDate(List<Person> people) {
        Collections.sort(people, Comparator.comparing(Person::getBirthDate));
    }
}