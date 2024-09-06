package co.edu.uptc.models.aplications;

import java.util.Comparator;

public class PersonComparator {

    public Comparator<Person> compareName = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public Comparator<Person> compareLastName = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    };

    public Comparator<Person> compareAge = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    };

}
