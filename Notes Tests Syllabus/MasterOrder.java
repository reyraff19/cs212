import java.util.*;

public class MasterOrder {
    private List<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getNumBoxes();
        }
        return sum;
    }

    public int removeVariety(String cookieVar) {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                sum += orders.get(i).getNumBoxes();
                orders.remove(i);
                i--;
            }
        }
        return sum;
    }
}