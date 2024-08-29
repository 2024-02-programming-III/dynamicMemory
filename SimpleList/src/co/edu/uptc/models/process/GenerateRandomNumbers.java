package co.edu.uptc.models.process;

import java.util.Random;

public class GenerateRandomNumbers {

    private int[] randomNumbers;

    public int[] generateRandomNumbers() {
        randomNumbers = new int[10_000];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(10_000);
            randomNumbers[i] = randomNumber;
        }
        return randomNumbers;
    }
}
