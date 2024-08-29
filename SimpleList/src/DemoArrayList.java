import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

  private List<Integer> list;

  public void testArrayList(List<Integer> randomNumbers) {
    loadDataArrayList(randomNumbers);
    sumDataArrayList();
  }

  public void loadDataArrayList(List<Integer> randomNumbers) {
    list = new ArrayList<>();
    for (int i = 0; i < randomNumbers.size(); i++) {
      list.add(randomNumbers.get(i));
    }
  }

  public void sumDataArrayList() {
    int result = 0;
    System.out.println("");
    System.out.println("----------ArrayList----------");
    long startTime = System.nanoTime();
    for (int i = 0; i < list.size(); i++) {
      result = result + list.get(i);
    }
    double endTime = System.nanoTime();
    double delayTime = endTime - startTime;

    System.out.println("Nano: " + delayTime);
    System.out.println("Mili: " + (delayTime / 1_000_000));
    System.out.println("seg: " + (delayTime / 1_000_000_000));
    System.out.println("result: " + result);
  }
}
