package tools;

import java.util.Scanner;

public class PrimeNumerIdentifier implements ITool {
	Scanner sc = new Scanner(System.in);
	private long number;
	private boolean isPrime;

	
	public PrimeNumerIdentifier() {
		super();
	}

	public PrimeNumerIdentifier(long number, boolean isPrime) {
		super();
		this.number = number;
		this.isPrime = isPrime;
	}

	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public boolean getisPrime() {
		return isPrime;
	}

	public void setisPrime(boolean isOdd) {
		this.isPrime = isOdd;
	}
	
	


	@Override
	public void Function() {
		System.out.println("_____________________________________\n");
		System.out.println("===Identificador de numeros primos===");
		System.out.println("_____________________________________\n");
		
		System.out.print("Ingrese el numero a evaluar: ");
		setNumber(sc.nextLong());
		
		int counter = 0;
		
		for(int i = 1; i <= number; i ++) {
			if(getNumber() % i ==0) {
				counter = counter + 1;
			}	
		}
		
		if(counter == 2) {
			setisPrime(true);
			
		}
	}


	
	@Override
	public void showResult() {
		if(getisPrime() == true) {
			
			System.out.printf("\nEl número %d es un número primo.", getNumber());
		}else if(getisPrime() == false){
			System.out.printf("\nEl número %d no es un número primo.", getNumber());
			
		}
		
		
	}
	
	
	

}
