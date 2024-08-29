import java.util.ArrayList;
import java.util.List;

public class App {

  static List<Integer> list;
  public static void main(String[] args) throws Exception {
    RandomNumbers rn = new RandomNumbers(100000);
     DemoArrayList da = new DemoArrayList();
     da.testArrayList(rn.getNumbersRandom());

    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList(rn.getNumbersRandom());

  }

  
}
