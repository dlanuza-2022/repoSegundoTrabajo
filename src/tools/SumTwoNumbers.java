package tools;

import java.util.Scanner;

public class SumTwoNumbers implements ITool {
	Scanner sc = new Scanner(System.in);
	private double a, b, result;

	public SumTwoNumbers() {
		super();
	}

	public SumTwoNumbers(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	@Override
	public void Function() {
		System.out.println("==Sumar dos números==");
		System.out.print("Ingrese el primer número: ");
		setA(sc.nextDouble());
		
		System.out.print("Ingrese el segundo número: ");
		setB(sc.nextDouble());
		
		this.result = a + b;
		
	}

	@Override
	public void showResult() {
		System.out.printf("\nEl resultad de la suma de %f más %f es igual a: %f", getA(), getB(), getResult());
		
	}

}
