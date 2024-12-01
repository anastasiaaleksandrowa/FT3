package sort;

import model.Person;
import java.util.Comparator;
import java.util.List;

public interface Sortable {
    void sortByName(List<Person> people);
    void sortByBirthDate(List<Person> people);
}