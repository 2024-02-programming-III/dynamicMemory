package test;

import java.util.List;

import co.edu.uptc.models.aplications.LoadRandomNumbers;

public class LoadNumbersTest {

    public List<Integer> loadNumbers() {
        LoadRandomNumbers lrn = new LoadRandomNumbers();
        List<Integer> randomNumbers = lrn.generateRandomNumbers(300_000, 0, 10_000);
        return randomNumbers;
    }

}
