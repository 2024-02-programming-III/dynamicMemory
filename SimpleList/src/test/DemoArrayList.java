package test;
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

  private List<Integer> list;

  public  void testArrayList(int[] data) {
    loadDataArrayList(data);

  };

  public  void loadDataArrayList(int[] data) {
    
    list = new ArrayList<Integer>();
    for (int i = 0; i < 300000; i++) {
      list.add(data[i]);
    }
  }

  public List<Integer> getList(){
    return list;
  }
    
}
