import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {

  public static void main(String[] args) throws Exception {

    DemoArrayList da = new DemoArrayList();
    da.testArrayList();
    RealCal ra = new RealCal();
    ra.run(da.getList(), "ArrayList");

    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList();
    ra.run(ds.getList(), "SimpleList");
  }
}
