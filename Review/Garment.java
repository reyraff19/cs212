package Review;

public abstract class Garment {
    private String color;

    public Garment(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String getSize();
}