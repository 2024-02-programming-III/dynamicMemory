package test;

import java.util.List;

import co.edu.uptc.utils.dynamic.SimpleListV2;

public class DemoArrayList {

  private List<Integer> list;

  public void testArrayList(List<Integer> numbers) {
    this.list = numbers;
    loadDataArrayList(list);

  }

  public void loadDataArrayList(List<Integer> numbers) {

    numbers = new SimpleListV2<Integer>();
    for (int i = 0; i < 300000; i++) {
      numbers.add(i);
    }
  }

  public List<Integer> getList() {
    return list;
  }

}
