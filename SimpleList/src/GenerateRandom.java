
public class GenerateRandom {

    public int[] GenerateRandomNumbers(int size,int min,int max) {

        int[] ramdomNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            ramdomNumbers[i]=(int)(Math.random()*(max+1-min))+min;
        }

        return ramdomNumbers;
    }
}
