import java.util.List;

import test.DemoArrayList;
import test.DemoSimpleList;
import test.LoadNumbersTest;
import test.RealCal;

public class App {

  public static void main(String[] args) throws Exception {

    LoadNumbersTest lnt = new LoadNumbersTest();
    List<Integer> randomNumbers = lnt.loadNumbers();

    DemoArrayList da = new DemoArrayList();
    da.testArrayList(randomNumbers);
    RealCal ra = new RealCal();
    ra.run(da.getList(), "ArrayList");

    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList(randomNumbers);
    ra.run(ds.getList(), "SimpleList");
  }
}
