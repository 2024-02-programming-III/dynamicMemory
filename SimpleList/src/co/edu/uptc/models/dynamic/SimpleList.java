package co.edu.uptc.models.dynamic;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SimpleList<T> implements List<T> {
  Node<T> header;

  // TODO: falta addionar mas de un elemento y que lo adiciona a la lista
  public void addv2(T value) {
    Node<T> node = new Node<T>();
    node.setInfo(value);
    node.setNext(null);
    header = node;
  }

  // TODO: falta refactorizar
  public void addv1(T value) {
    Node<T> newNode = new Node<T>();
    newNode.setInfo(value);
    newNode.setNext(null);
    if (header == null) {
      header = newNode;
    } else {
      Node<T> last = header;
      while (last.getNext() != null) {
        last = last.getNext();
      }
      last.setNext(newNode);
    }

  }

  public void showList() {
    Node<T> aux = header;
    while (aux != null) {
      System.out.println(aux.getInfo());
      aux = aux.getNext();
    }

  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
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
  public Iterator iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public Object[] toArray() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toArray'");
  }

  @Override
  public Object[] toArray(Object[] a) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toArray'");
  }

  @Override
  public boolean add(Object e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
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
  public T get(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public Object set(int index, Object element) {
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

  @Override
  public ListIterator listIterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
  }

  @Override
  public ListIterator listIterator(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subList'");
  }
}
