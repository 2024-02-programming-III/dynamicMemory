package test;
import java.util.List;

import co.edu.uptc.utils.dynamic.SimpleListV2;

public class DemoSimpleList {

  private List<Integer> list;

  public  void testArrayList(int[] data) {
    loadDataArrayList(data);
    
  };

  public  void loadDataArrayList(int[] data) {
    list = new SimpleListV2<Integer>();
    for (int i = 0; i < 300000; i++) {
      list.add(data[i]);
    }
  }


  public List<Integer> getList(){
    return list;
  }

    
}
