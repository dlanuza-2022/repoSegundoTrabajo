package ui;

import java.util.Scanner;

import tools.TemperatureConverter;

public class TemperatureConverterMenu implements IMenu {
	Scanner sc = new Scanner(System.in);
	

	
	public void show() {
		short op = 0;
		TemperatureConverter tc = new TemperatureConverter();
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				tc.Function();
				tc.CelciusToFarenheit();
				tc.showResult();
				break;
			case 2:
				tc.Function();
				tc.FarenheitToCelcius();
				tc.showResult();
				break;
			case 3:
				tc.Function();
				tc.CelciusToKelvin();
				tc.showResult();
				break;
			case 4:
				tc.Function();
				tc.KelvinToCelcius();
				tc.showResult();
				break;
			case 5:
				tc.Function();
				tc.FarenheitToKelvin();
				tc.showResult();
				break;
			case 6:
			    tc.Function();
			    tc.KelvinToFarenheit();
			    tc.showResult();
				break;
			case 7:
				Menu m = new Menu();
				m.show();
				break;
			default:
				System.out.println("opción inválida.");
				break;
			}
		
		}while(op != 7);
		
		
		
	}

	
	public void displayOptions() {
		System.out.println("=====Convertidor de temperatura=====");
		
		System.out.println("\n1. Convertir de °Celcius a °Farenheit.");
		System.out.println("2. Convertir de °Farenheit a °Celcius.");
		System.out.println("3. Convertir de °Celcius a °Kelvin.");
		System.out.println("4. Convertidor de °Kelvin a °Celsius.");
		System.out.println("5. Convertidor de °Farenheit a °Kelvin.");
		System.out.println("6. Convertidor de °Kelvin a °Farenheit.");
		System.out.println("7. Volver al menu principal.");
		
	}
	
	
	
	

}
