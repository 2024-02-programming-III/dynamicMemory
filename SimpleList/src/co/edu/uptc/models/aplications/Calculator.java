package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator <T> {

    private List<T> list=null;
    private int result=0;

    public Calculator(List<T> list){
        this.list = list;
    }

    public void sumData(){
        for (int i = 0; i < list.size(); i++) {
        T aux = list.get(i);
        if(aux instanceof Integer){
            result = result + (int)aux;
        }
        }  
    }

    public int getResult(){
        return result;
    }

}
