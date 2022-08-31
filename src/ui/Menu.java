package ui;

import java.util.Scanner;

public class Menu implements IMenu {
	Scanner sc = new Scanner(System.in);

	
	
	
	
    //Este metodo muestra el menu en sí.
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
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				RandomNumberAndSum2NumbersMenu rmors2n = new RandomNumberAndSum2NumbersMenu();
				rmors2n.show();
				break;
			case 7:
				TemperatureConverterMenu tcm = new TemperatureConverterMenu();
				tcm.show();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("opción inválida.");
				break;
			
			}
		}while(op != 8);
		
		
		
		
		
	}
	
	
    //Mostrar las opciones del menu principal, complementa el método show();
	@Override
	public void displayOptions() {
		System.out.println("===Menú de funciones===");
		System.out.println("1. Calcular la velocidad de un objeto con MRU.");
		System.out.println("2. Calcular la altura máxima de un proyectil con trayectoria parabólica.");
		System.out.println("3. Identificar si un numero es primo o no.");
		System.out.println("4. Calcular el factorial de un numero.");
		System.out.println("5. Generar un número aleatorio o sumar 2 numeros.");
		System.out.println("6. Convertidor de un número decimal a binario.");
		System.out.println("7. Convertidor de temperatura.");
		System.out.println("8. Salir.");
	}
	
	
	
	
	
	

}
