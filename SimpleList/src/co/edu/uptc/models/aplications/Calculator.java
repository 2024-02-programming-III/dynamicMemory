package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator<T> {
    private List<T> list;
    private int result = 0;
    private DataConverter<T> converter;

    public Calculator(List<T> list, DataConverter<T> converter) {
        this.list = list;
        this.converter = converter;
    }

    public void sumData() {
        for (T item : list) {
            int aux = converter.convert(item);
            result = result + aux;
        }
    }

    public int getResult() {
        return result;
    }
}
