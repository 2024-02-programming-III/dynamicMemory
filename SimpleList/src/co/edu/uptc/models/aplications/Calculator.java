package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator <T extends Summable>{
    private List<T> list=null;
    private int result=0;

public Calculator(List<T> list){
    this.list = list;
}

    public void sumData(){
    for (int i = 0; i < list.size(); i++) {
        int aux = list.get(i).intValue();
        result = result + aux;
      }
        
    }

    public int getResult(){
        return result;
    }

    
}
