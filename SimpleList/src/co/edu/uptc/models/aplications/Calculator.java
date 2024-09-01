package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator {
    private List<Integer> list = null;
    private int result = 0;

    public Calculator(List<Integer> list) {
        this.list = list;
    }

    public void sumData() {
        result = 0;
        for (int number : list) {
            result += number;
        }
    }

    public int getResult() {
        return result;
    }
}
