package funnyfraction;

public class FunnyFraction {

	public int numerator; 
	public int denominator; 
	int newNum, newDenom; 

	public FunnyFraction() {

		numerator=0;
		denominator=1;
	}
	
	public FunnyFraction(int num, int denom) {
		numerator=num;
		if(denom == 0) 
			denominator = 1;
		else 
			denominator = denom;

	}

	public FunnyFraction funnyAdd(FunnyFraction frac) {
		newNum=this.numerator+frac.numerator+this.denominator+frac.denominator;
		newDenom =(this.numerator+frac.numerator)*(this.denominator+frac.denominator);
		if(newDenom==0)
		newDenom=-1;
		FunnyFraction newFraction = new FunnyFraction(newNum,newDenom);
		return newFraction;

	}

	public FunnyFraction funnySubtract(FunnyFraction frac) {
		newNum=frac.denominator-this.denominator-frac.numerator-this.numerator;
		newDenom =(frac.denominator-this.denominator)*(frac.numerator-this.numerator);
		if(newDenom==0)
		newDenom=-1;
		FunnyFraction newFraction = new FunnyFraction(newNum,newDenom);
		return newFraction;
	
	}

	public FunnyFraction funnyMult(FunnyFraction frac) {
		newNum=(int) Math.sqrt(Math.pow(this.numerator-frac.numerator,2)+this.denominator);
		newDenom =(int) (Math.pow(this.denominator-frac.denominator,2)-frac.numerator);
		if(newDenom==0)
		newDenom=-1;
		FunnyFraction newFraction = new FunnyFraction(newNum,newDenom);
		return newFraction;
	
	}

	public FunnyFraction funnyDivide(FunnyFraction frac) {
		newNum=this.numerator*frac.denominator;
		newDenom =this.denominator*frac.numerator;
		if(newDenom==0)
		newDenom=-1;
		FunnyFraction newFraction = new FunnyFraction(newNum,newDenom);
		return newFraction;
	
	} 

	public int getNumerator() {

		return numerator;
	}
	
	public int getDenominator() {
		return denominator;

	}
	
	public String toString() {
		return numerator+"/"+denominator;


	}

}