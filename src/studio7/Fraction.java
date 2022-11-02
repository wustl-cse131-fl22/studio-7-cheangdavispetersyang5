package studio7;

public class Fraction {

private int numerator;
private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	public String printFraction() {
		return (getNumerator() + " / " + getDenominator());
	}
	public Fraction addfract(Fraction twofract) {
		if (twofract.getDenominator() == getDenominator()) {
			int addedNumerator = twofract.getNumerator() + getNumerator();
			Fraction addEDfract = new Fraction (addedNumerator, getDenominator());
			return addEDfract;
		}
	}
	
	public static void main(String[] args) {
		Fraction newfract = new Fraction (1, 2);
		System.out.println(newfract.printFraction());
		Fraction twofract = new Fraction (4, 12);
		System.out.println(twofract.printFraction());
	}

}
