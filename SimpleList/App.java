
import co.edu.uptc.models.aplications.Summable;
import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {

 
  public static void main(String[] args) throws Exception {

    
    DemoArrayList<Summable> da = new DemoArrayList<Summable>();
    DemoSimpleList<Summable> ds = new DemoSimpleList<Summable>();

    for (int i = 0; i < 10; i++) {
      int number = (int) (Math.random() * ((10000 - 1) + 1)) + 1;
      da.addDataArrayList(number);
      ds.addDataArrayList(number);
    }

    RealCal<Integer> ra = new RealCal<>();
    ra.run(da.getList(),"ArrayLIst");
    ra.run(ds.getList(),"simpleLIst");
    
 

    
  




  }

  
}
