import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.dynamic.SimpleListV2;
import co.edu.uptc.models.process.GenerateRandomNumbers;

public class DemoArrayList {

  private List<Integer> list;
  private int[] numbers;
  private List<Integer> randomList;

  public DemoArrayList(int[] numbers) {
    this.numbers = numbers;
  }

  public void testArrayList() {
    // loadDataArrayList();

    loadRandomNumbers();
    sumDataArrayList();
  };

  public void loadRandomNumbers() {
    randomList = new SimpleListV2<Integer>();
    for (int i = 0; i < numbers.length; i++) {
      randomList.add(numbers[i]);
    }
  }

  public void loadDataArrayList() {

    list = new ArrayList<Integer>();
    for (int i = 0; i < 100000; i++) {
      list.add(i);
    }
  }

  public void sumDataArrayList() {
    int result = 0;
    System.out.println("");
    System.out.println("----------array List-----");
    long startTime = System.nanoTime();
    for (int i = 0; i < randomList.size(); i++) {
      // result = result + list.get(i);
      result = result + randomList.get(i);
    }
    double endTime = System.nanoTime();
    double delayTime = endTime - startTime;

    System.out.println("Nano: " + delayTime);
    System.out.println("Mili: " + (delayTime / 1_000_000));
    System.out.println("seg: " + (delayTime / 1_000_000_000));
    System.out.println("result: " + result);
  }

}
