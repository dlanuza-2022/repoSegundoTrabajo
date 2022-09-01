package ui;

import java.util.Scanner;

import App.FunctionExecutator;

public class MRUSpeedCalculatorMenu implements IMenu {

Scanner sc = new Scanner(System.in);
	
	@Override
	public void show() {
		  
		   short op = 0;
	       Menu menu = new Menu();
	      	
	       
			do {
				System.out.println();
				displayOptions();
				System.out.println();
				op = sc.nextShort();
				
				switch(op) {
				case 1:
					FunctionExecutator.calculateSpeedMRU();
					break;
				case 2:
					menu.show();
					break;
				default:
					System.out.println("opción inválida.");
					break;
				
				}
			}while(op != 2);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("===Menú de la herramienta para calcular la velocidad de un MRU.===");
		System.out.println("\n1. Calcular la velocidad.");
		System.out.println("2. Volver al menu principal.");
		
	}

}
