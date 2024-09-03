package test;

import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import co.edu.uptc.models.aplications.Summable;

public class RealCal<T> {
    
   
    public void run(List<Summable> list, String title) {
        Calculator<Summable> cal = new Calculator<>(list);
        System.out.println("");
        System.out.println("----------"+ title+"-----");
        int result = 0;
    
        long startTime = System.nanoTime();
    
        cal.sumData();
        result = cal.getResult();
    
        double endTime = System.nanoTime();
        double delayTime = endTime - startTime;
        
        System.out.println("Nano: "+delayTime);
        System.out.println("Mili: "+(delayTime/1_000_000));
        System.out.println("seg: "+(delayTime/1_000_000_000));
        System.out.println("result: "+result);

    }

}
