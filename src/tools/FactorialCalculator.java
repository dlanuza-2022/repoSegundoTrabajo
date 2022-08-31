package tools;

public class FactorialCalculator implements ITool  {
	private long number;
	private long result;

	
	
	public FactorialCalculator() {
		super();
	}

	public FactorialCalculator(long number) {
		super();
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}

	@Override
	public void Function() {
		long temp = 1;
		
		for(int i = 1; i == number; i++) {
			
			temp = temp * i;
		}
		
		
		this.result = temp;
		
	}

	@Override
	public void showResult() {
		System.out.printf("El falctorial de %d es: %d", getNumber(), getResult());
		
	}
	
	
	

}
