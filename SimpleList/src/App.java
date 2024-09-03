
import co.edu.uptc.models.aplications.NumbersRandom;
import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {

  public static void main(String[] args) throws Exception {

    NumbersRandom numbersRandom = new NumbersRandom();
    
    DemoArrayList da = new DemoArrayList();
    da.testArrayList(numbersRandom.getNumbers());

    RealCal<Integer> ra = new RealCal<>();
    ra.run(da.getList(),"ArrayLIst");
    
    DemoSimpleList ds = new DemoSimpleList();
    ds.testArrayList(numbersRandom.getNumbers());
    
    ra.run(ds.getList(),"simpleLIst");

  }

  
}
