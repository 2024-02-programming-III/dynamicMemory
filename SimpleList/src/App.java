import java.util.List;

import co.edu.uptc.models.aplications.LoadRandomNumbers;
import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {

  public static void main(String[] args) throws Exception {

    LoadRandomNumbers lrn = new LoadRandomNumbers();
    List<Integer> randomNumbers = lrn.generateRandomNumbers(300_000, 0, 10_000);

    DemoArrayList da = new DemoArrayList();
    da.testArrayList(randomNumbers);
    RealCal ra = new RealCal();
    ra.run(da.getList(), "ArrayList");

    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList(randomNumbers);
    ra.run(ds.getList(), "SimpleList");
  }
}
