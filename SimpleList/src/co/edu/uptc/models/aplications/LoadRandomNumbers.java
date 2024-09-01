package co.edu.uptc.models.aplications;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadRandomNumbers {

    public List<Integer> generateRandomNumbers(int size, int min, int max) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers.add(random.nextInt(max - min + 1) + min);
        }
        return randomNumbers;
    }
}
