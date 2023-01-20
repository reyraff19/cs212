package Review;

public class Clothing {
    public static void main(String[] args) {
        TShirt shirt = new TShirt("White", "Large");
        // Garment shirt = new TShirt("White", "Large"); // Polymorphism since Garment
        // is the super class of TShirt, therefore able to make an object TShirt using
        // Garment.
        System.out.println(shirt.getColor()); // Inherits the getColor method from Garment in the TShirt class, using
                                              // super(color).
        System.out.println(shirt.getSize()); // Since shirt is a TShirt object, at run time it will refer to the
                                             // getSize() in TShirt and return.

        Garment pants = new Slacks("Beige", 32, 32);
        System.out.println(pants.getColor());
        System.out.println(pants.getSize());

    }
}