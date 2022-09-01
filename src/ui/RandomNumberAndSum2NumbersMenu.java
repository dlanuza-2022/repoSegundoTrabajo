package ui;

import java.util.Scanner;

import App.FunctionExecutator;

public class RandomNumberAndSum2NumbersMenu implements IMenu {
	Scanner sc = new Scanner(System.in);

	@Override
	public void show() {
		short op = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				FunctionExecutator.generateRandomNumber();
				break;
			case 2:
				FunctionExecutator.sumTwoNumbers();
				break;
			case 3:
				Menu m = new Menu();
				m.show();
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			}
			
			
		}while(op != 3);
		
	}

	@Override
	public void displayOptions() {
        System.out.println("=====Seleccione la función que desea implementar=====");
		
		System.out.println("\n1. Generar un número aleatorio.");
		System.out.println("2. Sumar dos números.");
		System.out.println("3. Volver al menu principal.");
	
	}
	
	

}
