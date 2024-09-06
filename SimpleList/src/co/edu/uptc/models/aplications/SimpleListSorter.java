package co.edu.uptc.models.aplications;

import java.util.Comparator;

import co.edu.uptc.utils.dynamic.Node;
import co.edu.uptc.utils.dynamic.SimpleListV2;

public class SimpleListSorter<T> {

    public void sort(SimpleListV2<T> list, Comparator<T> comparator) {
        if (list.size() < 2) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node<T> current = list.header;

            while (current != null && current.getNext() != null) {
                Node<T> next = current.getNext();

                if (comparator.compare(current.getInfo(), next.getInfo()) > 0) {
                    T temp = current.getInfo();
                    current.setInfo(next.getInfo());
                    next.setInfo(temp);

                    swapped = true;
                }

                current = current.getNext();
            }
        } while (swapped);
    }
}
