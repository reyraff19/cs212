package Recursion;

public class Matryoshka {
    private Matryoshka innerDoll;

    public Matryoshka(Matryoshka innerDoll) {
        this.innerDoll = innerDoll;
    }

    public Matryoshka getInnerDoll() {
        return innerDoll;
    }

    // Counts all dolls inside this doll(including this doll).
    public int countDolls() {
        if (innerDoll == null) {
            return 1;
        }
        return 1 + innerDoll.countDolls();

    }

    public static void main(String[] args) {
        Matryoshka one = new Matryoshka(null);
        Matryoshka two = new Matryoshka(one);
        Matryoshka three = new Matryoshka(two);
        System.out.println(one.getInnerDoll());
        System.out.println(three.getInnerDoll().getInnerDoll().getInnerDoll());
        System.out.println(three.countDolls());
    }
}