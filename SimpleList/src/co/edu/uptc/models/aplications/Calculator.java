package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator {
    private List<Integer> list = null;
    private int result = 0;

    public Calculator(List<Integer> list) {
        this.list = list;
    }

    public void sumData() {
        for (int i = 0; i < list.size(); i++) {
            int aux = list.get(i);
            result += aux;
        }
    }

    public int getResult() {
        return result;
    }
}
