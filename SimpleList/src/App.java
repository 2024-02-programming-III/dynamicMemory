import co.edu.uptc.models.SumNums;
import co.edu.uptc.models.dynamic.SimpleList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        test();
    }
    private static void test(){
        App main = new App();
        List<Integer> nodeList = new SimpleList<>();
        List<Integer> arrayList = new ArrayList<>();
        main.fillLists(nodeList, arrayList);
        long nodeListTime = main.measureSumTime(nodeList);
        long arrayListTime = main.measureSumTime(arrayList);
        System.out.println("Time taken to sum SimpleList: " + nodeListTime + " nano seconds");
        System.out.println("Time taken to sum ArrayList: " + arrayListTime + " nano seconds");
    }
    private void fillLists(List<Integer> list, List<Integer> list2){
        for (int i = 0; i < 100000; i++) {
            int random = (int) (Math.random()*10000);
            list.add(random);
            list2.add(random);
        }
    }
    private long measureSumTime(List<Integer> list) {
        SumNums sumNums = new SumNums();
        System.out.println("Sum: " + sumNums.sumLists(list));
        long startTime = System.nanoTime();
        sumNums.sumLists(list);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

}

