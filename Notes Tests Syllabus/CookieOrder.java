import java.util.*;

public class CookieOrder {
    private String variety;
    private int numBoxes;

    public CookieOrder(String variety, int numBoxes) {

        this.variety = variety;
        this.numBoxes = numBoxes;

    }

    public String getVariety() {
        return variety;
    }

    public int getNumBoxes() {
        return numBoxes;
    }

    public String toString(String variety, int numBoxes){
        return "The order is " + variety + "and there are " + numBoxes + ".\n";
    }
}