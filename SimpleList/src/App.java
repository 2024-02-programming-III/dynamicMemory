import co.edu.uptc.utils.dynamic.SimpleList;
import test.TestList;
import test.RealCal;

import java.util.ArrayList;

public class App {

 
    public static void main(String[] args)  {
        TestList test = new TestList();
        test.testArrayList(new ArrayList<>(), new SimpleList<>());
        RealCal<Integer> realCal = new RealCal<>();
        realCal.run(test.getList1(), "SimpleList");
        realCal.run(test.getList2(), "ArrayList");



  }


  
}
