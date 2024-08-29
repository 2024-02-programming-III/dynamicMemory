import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.process.GenerateRandomNumbers;

public class App {

  static List<Integer> list;
  public static void main(String[] args) throws Exception {
    GenerateRandomNumbers generator = new GenerateRandomNumbers();
    int[] numbers = generator.generateRandomNumbers();
     DemoArrayList da = new DemoArrayList(numbers);
     da.testArrayList();

    DemoSimpleList ds = new DemoSimpleList(numbers);
    ds.testArrayList();

  }

  
}
