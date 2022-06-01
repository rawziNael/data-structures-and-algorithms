package graph;

public class Vertex{

    private String value;
    private int weight;

    public Vertex(String value) {
        this.value = value;
    }

    public Vertex(String value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                ", weight=" + weight +
                '}';
    }
}
