import co.edu.uptc.models.aplications.Person;
import co.edu.uptc.models.aplications.PersonComparator;
import co.edu.uptc.models.aplications.SimpleListSorter;
import co.edu.uptc.utils.dynamic.SimpleListV2;
import test.LoadPersonsTest;

public class App {

  public static void main(String[] args) throws Exception {

    SimpleListV2<Person> persons = new SimpleListV2<Person>();
    persons = new LoadPersonsTest().LoadPersons();

    SimpleListSorter<Person> sorter = new SimpleListSorter<>();

    PersonComparator as = new PersonComparator();

    sorter.sort(persons, as.compareName);
    System.out.println("Lista ordenada por Nombre:");
    persons.showList();

    System.out.println();

    sorter.sort(persons, as.compareLastName);
    System.out.println("Lista ordenada por apellido:");
    persons.showList();

    System.out.println();

    sorter.sort(persons, as.compareAge);
    System.out.println("Lista ordenada por edad:");
    persons.showList();

  }
}
