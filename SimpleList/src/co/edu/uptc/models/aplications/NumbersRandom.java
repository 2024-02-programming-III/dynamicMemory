package co.edu.uptc.models.aplications;

public class NumbersRandom {
    
    private int[] numbers;

    public NumbersRandom(){
        numbers = new int[300000];
        generateNumbers();
    }

    private void generateNumbers(){
        for (int i=0; i<numbers.length; i++){
            numbers[i]= (int) (Math.random()*10000);
        }
    }

    public int[] getNumbers(){
        return numbers;
    }

}
