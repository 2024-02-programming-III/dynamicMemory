public class RandomNumbers {

    private int[] numbersRandom;

    public RandomNumbers(int size) {
        numbersRandom = new int[size];
        generateRandomNumbers();
    }

    private void generateRandomNumbers() {
        for (int i = 0; i < numbersRandom.length; i++) {
            numbersRandom[i] = (int) (Math.random() * 10000);
        }
    }

    public int[] getNumbersRandom(){
        return numbersRandom;
    }
}
