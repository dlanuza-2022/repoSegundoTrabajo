package tools;

import java.util.Scanner;

import misc.ExceptionScanner;

public class FactorialCalculator implements ITool  {
	Scanner sc = new Scanner(System.in);
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
		ExceptionScanner es = new ExceptionScanner();
		
		System.out.println("==Calcular factorial==");
		
		
		setNumber(es.validNumberLong());
		
		
		long temp = 1;
		
		for(int i = 1; i <= number; i++) {
			
			temp = temp * i;
		}
		
		
		setResult(temp);
		
	}

	@Override
	public void showResult() {
		System.out.printf("El falctorial de %d es: %d", getNumber(), getResult());
		
	}
	
	
	

}
