package co.edu.uptc.models.aplications;

public class SummableInt extends Summable{
    private Integer value = 0;

    public SummableInt(Integer value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }
}
