package tools;

public class SumTwoNumbers implements ITool {
	
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
		this.result = a + b;
		
	}

	@Override
	public void showResult() {
		System.out.printf("\nEl resultad de la suma de %d más %d es igual a: %d", getA(), getB(), getResult());
		
	}

}
