package test;
import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import co.edu.uptc.models.aplications.Summable;
import co.edu.uptc.models.aplications.SummableInt;
import co.edu.uptc.utils.dynamic.SimpleListV2;

public class DemoSimpleList <T extends Summable>{

    private List<Summable> list= new SimpleListV2<Summable>();

  public  void addDataArrayList(int number) {
    list.add(new SummableInt(number));
  }


  public List<Summable> getList(){
    return list;
  }

    
}