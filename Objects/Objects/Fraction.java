package Objects;

public class Fraction {		// Class that holds exact value of the fraction
	
	private boolean positive;
	private int num;
	private int den;
	
	public Fraction(boolean isPositive, int numerator, int denominator) {
		positive = isPositive;		// Since positive is different from isPositive, there is no need for (this.)
		num = numerator;
		den = denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd = gcd(num, den);
		num /= gcd;
		den /= gcd;
	}
	
	public static int gcd(int a, int b) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		while(big % small != 0) {
			int remainder = big % small;
			big = small;
			small = remainder;
		}
		return small;
	}
	
	public String toString() {		// Accessed for when there is a System.out.println()
		String out = "";
		if(!positive) {
			out = "-";
		}
		return out + num + "/" + den;
	}
	
	public double asDecimal() {
		double decimal = (double) num / den;
		if(!positive) {
			decimal *= -1;
		}
		return decimal;
	}
	
	public String asMixedNumber() {
		String out = "";
		if(!positive) {
			out = "-";
		}
		return out + num / den + " " + num % den + "/" + den;
	}
	
	public Fraction times(Fraction otherFraction) {
		boolean pos = positive == otherFraction.positive;
		int numerator = num * otherFraction.num;
		int denominator = den * otherFraction.den;
		return new Fraction(pos, numerator, denominator);
	}

}
