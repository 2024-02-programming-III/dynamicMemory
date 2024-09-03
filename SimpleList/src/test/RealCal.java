package test;

import java.util.List;
import co.edu.uptc.models.aplications.Calculator;
import co.edu.uptc.models.aplications.IntegerConverter;

public class RealCal {

    public void run(List<Integer> list, String title) {
        Calculator<Integer> cal = new Calculator<>(list, new IntegerConverter());
        System.out.println("");
        System.out.println("----------" + title + "----------");
        int result = 0;

        long startTime = System.nanoTime();

        cal.sumData();
        result = cal.getResult();

        long endTime = System.nanoTime();
        long delayTime = endTime - startTime;

        System.out.println("Nano: " + delayTime);
        System.out.println("Mili: " + (delayTime / 1_000_000.0));
        System.out.println("Seg: " + (delayTime / 1_000_000_000.0));
        System.out.println("Resultado: " + result);
    }
}
