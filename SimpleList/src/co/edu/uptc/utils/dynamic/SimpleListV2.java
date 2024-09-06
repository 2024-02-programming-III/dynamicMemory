package co.edu.uptc.utils.dynamic;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class SimpleListV2<T> implements List<T> {
  public Node<T> header;
  public Node<T> last;
  public int size = 0;
  private Node<T> lastget = null;

  public SimpleListV2() {
    header = null;
    last = null;
  }

  @Override
  public boolean add(T e) {
    Node<T> newNode = new Node<T>();
    newNode.setInfo(e);
    newNode.setNext(null);
    size++;
    if (header == null) {
      header = newNode;
      last = header;
    } else {
      last.setNext(newNode);
      last = newNode;
    }
    return true;
  }

  public void showList() {
    Node aux = header;
    while (aux != null) {
      System.out.println(aux.getInfo());
      aux = aux.getNext();
    }

  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public T get(int index) {
    if (lastget == null) {
      lastget = header;
    } else {
      if (lastget.getNext() != null)
        lastget = lastget.getNext();
      else
        return null;
    }

    return lastget.getInfo();
  }

  public T findMax(Comparator<? super T> comparator) {
    if (header == null) {
      return null;
    }

    Node<T> current = header;
    T maxElement = current.getInfo();

    while (current != null) {
      if (comparator.compare(current.getInfo(), maxElement) > 0) {
        maxElement = current.getInfo();
      }
      current = current.getNext();
    }

    return maxElement;
  }

  public T findMinor(Comparator<? super T> comparator) {
    if (header == null) {
      return null;
    }

    Node<T> current = header;
    T maxElement = current.getInfo();

    while (current != null) {
      if (comparator.compare(current.getInfo(), maxElement) < 0) {
        maxElement = current.getInfo();
      }
      current = current.getNext();
    }

    return maxElement;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
  }

  @Override
  public boolean contains(Object o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private Node<T> current = header;

      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public T next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        T data = current.getInfo();
        current = current.getNext();
        return data;
      }
    };
  }

  @Override
  public Object[] toArray() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toArray'");
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object[] toArray(Object[] a) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toArray'");
  }

  @Override
  public boolean remove(Object o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean containsAll(Collection c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
  }

  @Override
  public boolean addAll(Collection c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addAll'");
  }

  @Override
  public boolean addAll(int index, Collection c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addAll'");
  }

  @Override
  public boolean removeAll(Collection c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
  }

  @Override
  public boolean retainAll(Collection c) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public T set(int index, Object element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'set'");
  }

  @Override
  public void add(int index, Object element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public T remove(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int indexOf(Object o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
  }

  @Override
  public int lastIndexOf(Object o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
  }

  @SuppressWarnings("unchecked")
  @Override
  public ListIterator listIterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
  }

  @SuppressWarnings("unchecked")
  @Override
  public ListIterator listIterator(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
  }

  @SuppressWarnings("unchecked")
  @Override
  public List subList(int fromIndex, int toIndex) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subList'");
  }

}
