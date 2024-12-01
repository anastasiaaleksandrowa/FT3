package model;

import java.io.Serializable;
import java.util.*;

public class FamilyTree implements Serializable, Iterable<Person> {
    private static final long serialVersionUID = 1L;
    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    public void addPerson(Person person) {
        this.people.put(person.getName(), person);
    }

    public Person findPerson(String name) {
        return this.people.get(name);
    }

    public List<Person> getChildrenOf(String personName) {
        Person person = findPerson(personName);
        if (person != null) {
            return person.getChildren();
        } else {
            return null;
        }
    }

    @Override
    public Iterator<Person> iterator() {
        return people.values().iterator();
    }

    public Object getPeople() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPeople'");
    }
}