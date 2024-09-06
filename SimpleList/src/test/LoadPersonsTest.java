package test;

import co.edu.uptc.models.aplications.Person;
import co.edu.uptc.utils.dynamic.SimpleListV2;

public class LoadPersonsTest {
    public SimpleListV2<Person> LoadPersons() {
        Person person1 = new Person("Oscar", "Roa", 19);
        Person person2 = new Person("Sergio", "Lara", 18);
        Person person3 = new Person("Selene", "Daza", 18);
        Person person4 = new Person("David", "Aguilar", 20);
        Person person5 = new Person("Sara", "Roa", 12);

        SimpleListV2<Person> persons = new SimpleListV2<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        return persons;
    }
}
