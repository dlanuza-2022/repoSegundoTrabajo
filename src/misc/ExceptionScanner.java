package misc;

import java.util.Scanner;

public class ExceptionScanner {
	private Scanner sc;
	
	public ExceptionScanner() {
		sc = new Scanner(System.in);
		
	}
	
	public double validNumberDouble() {
		double output;
		
		do {
			System.out.println("Indique el valor: ");
			output = sc.nextInt();
			if(output==0 || output<0) {
				System.out.println("El número no puede ser cero o menor que cero.");
			}
		}while(output == 0 || output < 0);
		
		return output;	
		
	}
	
	public long validNumberLong() {
		long output;
		
		do {
			System.out.println("Indique el valor: ");
			output = sc.nextInt();
			if(output==0 || output<0) {
				System.out.println("El número no puede ser cero o menor que cero.");
			}
		}while(output == 0 || output < 0);
		
		return output;	
		
	}
	

}
