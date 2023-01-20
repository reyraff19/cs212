package Review;

public class TShirt extends Garment {

    private String size;

    public TShirt(String color, String size) {
        super(color);
        this.size = size;
    }

    @Override
    public String getSize() {
        return size;
    }

}