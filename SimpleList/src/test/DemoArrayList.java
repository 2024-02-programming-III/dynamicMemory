package test;
import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.aplications.Summable;
import co.edu.uptc.models.aplications.SummableInt;

public class DemoArrayList <T extends Summable>{


    private List<Summable> list =new ArrayList<Summable>();

  public  void addDataArrayList(int number) {
    list.add(new SummableInt(number));
  }
    public List<Summable> getList(){
        return list;
    }
    
}
