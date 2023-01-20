package Review;

public class Slacks extends Garment {
    private int waist;
    private int inseam;

    public Slacks(String color, int waist, int inseam) {
        super(color);
        this.waist = waist;
        this.inseam = inseam;
    }

    @Override
    public String getSize() {
        return "Waist: " + waist + ", Inseam: " + inseam;
    }
}