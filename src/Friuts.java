public class Friuts  {
    private String color;
    private String weight;
    private String vitamin;

    public Friuts(String color, String weight,String vitamin) {
        this.color = color;
        this.weight = weight;
        this.vitamin=vitamin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Friuts{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", vitamin='" + vitamin + '\'' +
                '}';
    }
}
