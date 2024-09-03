import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {

  public static void main(String[] args) throws Exception {

    List<Integer> numbers = generateRandomNumbers(300_000);

    DemoArrayList da = new DemoArrayList();
    da.testArrayList(numbers);
    RealCal<Integer> ra = new RealCal<>();
    ra.run(da.getList(), "ArrayLIst");

    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList(numbers);
    ra.run(ds.getList(), "simpleLIst");

    testView(da, ds);

  }

  private static List<Integer> generateRandomNumbers(int size) {
    Random random = new Random();
    List<Integer> numbers = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      numbers.add(1 + random.nextInt(10000));
    }
    return numbers;
  }

  private static void testView(DemoArrayList da, DemoSimpleList ds) {
      System.out.println("primeros 10 numeros del arrayList:" + da.getList().subList(0, Math.min(10, da.getList().size())));
      System.out.println("primeros 10 numeros del arrayList:" + ds.getList().subList(0, Math.min(10, da.getList().size())));
    
  }

}
