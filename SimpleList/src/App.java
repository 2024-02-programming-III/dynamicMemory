import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    static List<Integer> list;

    public static void main(String[] args) throws Exception {
        List<Integer> randomNumbers = generateRandomNumbers(100000, 1, 10000);

        DemoArrayList da = new DemoArrayList();
        da.testArrayList(randomNumbers);

        DemoSimpleListV2 ds = new DemoSimpleListV2();
        ds.testArrayList(randomNumbers);
    }

    private static List<Integer> generateRandomNumbers(int size, int min, int max) {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(rand.nextInt((max - min) + 1) + min);
        }
        return numbers;
    }
}
