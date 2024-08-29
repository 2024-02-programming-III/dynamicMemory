import java.util.List;
import co.edu.uptc.models.dynamic.SimpleListV2;

public class DemoSimpleListV2 {

  private List<Integer> list;

  public void testArrayList(List<Integer> randomNumbers) {
    loadDataArrayList(randomNumbers);
    sumDataArrayList();
  }

  public void loadDataArrayList(List<Integer> randomNumbers) {
    list = new SimpleListV2<>();
    for (int i = 0; i < randomNumbers.size(); i++) {
      list.add(randomNumbers.get(i));
    }
  }

  public void sumDataArrayList() {
    System.out.println("");
    System.out.println("----------SimpleList----------");
    int result = 0;
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
