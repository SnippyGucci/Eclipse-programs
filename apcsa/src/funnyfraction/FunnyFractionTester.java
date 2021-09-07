package funnyfraction;

public class FunnyFractionTester {

	public static void main(String[] args) {
		FunnyFraction f1 = new FunnyFraction (3, 4);
		FunnyFraction f2 = new FunnyFraction (5, 6);
		
		FunnyFraction sum = f1.funnyAdd(f2);
		FunnyFraction subtract = f1.funnySubtract(f2);
		FunnyFraction mult = f1.funnyMult(f2);
		FunnyFraction divide = f1.funnyDivide(f2);
		
		System.out.println(sum);
		System.out.println(subtract);
		System.out.println(mult);
		System.out.println(divide);

	}

}
