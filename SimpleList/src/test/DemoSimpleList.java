package test;

import java.util.List;

public class DemoSimpleList {

  private List<Integer> list;

  public void testArrayList(List<Integer> randomList) {
    loadDataArrayList(randomList);
  };

  public void loadDataArrayList(List<Integer> randomList) {
    list = randomList;
  }

  public List<Integer> getList() {
    return list;
  }
}
