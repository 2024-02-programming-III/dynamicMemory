import java.util.ArrayList;

import co.edu.uptc.models.dynamic.DemoList;
import co.edu.uptc.models.dynamic.SimpleListV2;
import co.edu.uptc.models.generic.GenericNode;
import co.edu.uptc.models.staticModel.VectorOnly;

public class Appold {
    public static void main(String[] args) throws Exception {

        testgeneric();

        // testmemory();
        // testDynamic();
        // testStaticModel();
    }

    public static void testgeneric() {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("one");
        al.add("two");

        GenericNode<String> generic = new GenericNode<String>();
        // generic.add("hola ");

        DemoList<Object> dl = new DemoList<Object>();
        dl.setData(generic);

    }

    public static void testDynamic() {
        long startTime = System.nanoTime();

        SimpleListV2<Integer> sl = new SimpleListV2<Integer>();
        for (int i = 0; i < 1_000_950_000; i++) {
            sl.add(i);
        }

        // sl.showList();

        long endTime = System.nanoTime();

        long durationNano = endTime - startTime;
        System.out.println();
        System.out.println("---- dynamic");
        System.out.println("Duration time: " + durationNano + " NanoSecond");
        System.out.println("Duration time: " + (durationNano / 1_000_000.0) + "  MilliSecond");
        System.out.println("Duration time: " + (durationNano / 1_000_000_000.0) + "  Seconds");

    }

    public static void testStaticModel() {
        VectorOnly vo = new VectorOnly();
        vo.fullData();
    }

    public static void testmemory() {
        long heapSize = Runtime.getRuntime().totalMemory();
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        long heapFreeSize = Runtime.getRuntime().freeMemory();

        System.out.println("Heap Size: " + heapSize / (1024 * 1024) + " MB");
        System.out.println("Max Heap Size: " + heapMaxSize / (1024 * 1024) + " MB");
        System.out.println("Free Heap Size: " + heapFreeSize / (1024 * 1024) + " MB");
    }

}
