package pojo;

public class Chart {
    private String value;
    private String name;

    public Chart(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
