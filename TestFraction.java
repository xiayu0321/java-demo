package 作业;

class Fraction {
	private int denominator;
	private int numerator;
	
	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}
	
	public Fraction(){
		this.denominator = 1;
		this.numerator = 0;
	}
	
	public Fraction(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}
	public Fraction(int denominator,int numerator) {
		if(denominator != 0 ){
			this.denominator = denominator;
		}else {
			denominator = 1;
		}
		this.numerator = numerator;
	}
	public static Fraction product(Fraction one,Fraction anotherFraction) {
		Fraction pro = new Fraction();
		pro.denominator = one.denominator *anotherFraction.denominator;
		pro.numerator = one.numerator * anotherFraction.numerator;
		return pro;
	}
}

public class TestFraction {
	public static void main(String[] args) {
		Fraction one = new Fraction(3,2);
		Fraction two = new Fraction(1,3);
		System.out.println("乘积为："+ Fraction.product(one, two).getNumerator()/Fraction.product(one, two).getDenominator());
	}
}
