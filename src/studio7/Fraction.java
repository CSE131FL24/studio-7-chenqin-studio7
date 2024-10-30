package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void simplify(){
		
		int gcd = gcd(this.numerator, this.denominator);
		int new_num = this.numerator/gcd; // Simplified numerator
		int new_den = this.denominator/gcd; // Simplified denominator
		
		this.numerator = new_num;
		this.denominator = new_den;
	}
	
	private int gcd(int p, int q) { // Helper method for the simplify

		if (q == 0) {
			return p;
		} else {
			return gcd(q, p%q);
		}
		
	}
	
	public void addition(Fraction f2) {
		int newNum = this.numerator + f2.numerator;
		int newDen = gcd(this.denominator, f2.denominator);
		
		Fraction toReturn = new Fraction(newNum, newDen);
		toReturn.simplify();
		
		System.out.println(toReturn);
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
		
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 4);
		Fraction f2 = new Fraction(3, 4);
		f1.addition(f2);
		
		f1.simplify();
		
		System.out.println(f1);
	}
}
