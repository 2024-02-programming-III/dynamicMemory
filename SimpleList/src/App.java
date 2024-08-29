import java.util.ArrayList;
import java.util.List;

public class App {

  static int[] list;
  public static void main(String[] args) throws Exception {
    GenerateRandom gr = new GenerateRandom();
    list=gr.GenerateRandomNumbers(10, 1, 10);

     DemoArrayList da = new DemoArrayList();
     da.testArrayList(list);

    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList(list);
  }

  
}
