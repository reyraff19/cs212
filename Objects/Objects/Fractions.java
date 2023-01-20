package Objects;

public class Fractions {

	public static void main(String[] args) {
		System.out.println(Fraction.gcd(10, 7));
		System.out.println(Fraction.gcd(21, 49));
		
		Fraction a = new Fraction(true, 5, 10);
		System.out.println(a);
		System.out.println(a.asDecimal());
		
		Fraction b = new Fraction(false, 15, 6);
		System.out.println(b);
		System.out.println(b.asMixedNumber());
		
		Fraction c = a.times(b);
		System.out.println(c);
		System.out.println(c.asDecimal());
		System.out.println(c.asMixedNumber());
	}
	
}
