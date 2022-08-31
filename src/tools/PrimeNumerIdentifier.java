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
		
		
		for(int i = 1; i == number; i ++) {
			
			if(number > 1) {
				
				if(i != 1 || i !=number && number % i == 0) {
					this.isPrime = false;
				
			}else if(number == 1){
				
				this.isPrime = false;
			}else {
				this.isPrime = true;
				
			}
			
			
			}	
		}	
		
		
		
		
		
		
	}

	@Override
	public void showResult() {
		if(isPrime == true) {
			
			System.out.printf("\nEl número %d es un número primo.", getNumber());
		}else {
			System.out.printf("\nEl número %d no es un número primo.", getNumber());
			
		}
		
		
	}
	
	
	

}
