package tools;

import java.util.Scanner;

import misc.ExceptionScanner;

public class HmaxParabolicTrayectoryCalculator implements UtilOperator, ITool {
	Scanner sc = new Scanner(System.in);
	
	private double maxHeight;
	private double initialSpeed;
	private double inclinationAngleDegrees;
	private double inclinationAngleRadians;
	private String speedType;
	private String heightType;
	
	public HmaxParabolicTrayectoryCalculator() {
		super();
	}

	public HmaxParabolicTrayectoryCalculator(double maxHeight, double initialSpeed, double inclinationAngleDegrees, String speedType, double inclinationAngleRadians, String heightType) {
		super();
		this.maxHeight = maxHeight;
		this.initialSpeed = initialSpeed;
		this.inclinationAngleDegrees = inclinationAngleDegrees;
		this.speedType = speedType;
		this.inclinationAngleRadians = inclinationAngleRadians;
		this.heightType = heightType;
	}

	public double getMaxHeight() {
		return maxHeight;
	}
	public void setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
	}
	public double getInitialSpeed() {
		return initialSpeed;
	}
	public void setInitialSpeed(double initialSpeed) {
		this.initialSpeed = initialSpeed;
	}
	public String getSpeedType() {
		return speedType;
	}
	public void setSpeedType(String speedType) {
		this.speedType = speedType;
	}
	
	
	 public double getInclinationAngleDegrees() {
		return inclinationAngleDegrees;
	}

	public void setInclinationAngleDegrees(double inclinationAngleDegrees) {
		this.inclinationAngleDegrees = inclinationAngleDegrees;
	}

	public double getInclinationAngleRadians() {
		return inclinationAngleRadians;
	}

	public void setInclinationAngleRadians(double inclinationAngleRadians) {
		this.inclinationAngleRadians = inclinationAngleRadians;
	}
	
	public String getHeightType() {
		return heightType;
	}

	public void setHeightType(String heightType) {
		this.heightType = heightType;
	}

	
	public void selectSpeedType() {
	        short op = 0;
			
			do {
				System.out.println("\nSeleccione la medida de la velocidad que utilizará.");
				System.out.println("1. m/s.");
				System.out.println("2. k/h.");
				op = sc.nextShort();
				
				switch(op) {
				case 1:
					setSpeedType("m/s"); 
					setHeightType("m");
					break;
				case 2:
					setSpeedType("k/m"); 
					setHeightType("km");
					break;
				default:
					System.out.println("Opción inválida.");
					break;
					
				}
				
			}while(op != 1 && op !=2) ; 
			
			
		}
	

	@Override
	public void Function() {
		ExceptionScanner es = new ExceptionScanner();
		
		System.out.println("===Calculador de altura máxima en un movimiento parabolico===");
		
		System.out.print("Velocidad inicial: ");
		selectSpeedType();
		setInitialSpeed(es.validNumberDouble());
		
		System.out.print("Ingrese el ángulo de inclinación en grados: \n");
		setInclinationAngleDegrees(es.validNumberDouble());
		setInclinationAngleRadians(Math.toRadians(getInclinationAngleDegrees()));
		this.maxHeight = (Math.pow(getInitialSpeed(), 2) * Math.pow(getInclinationAngleRadians(), 2))/(2*gravity);
		
	}

	@Override
	public void showResult() {
		System.out.printf("La altura máxima es de: %f%s", getMaxHeight(), getHeightType());
		
	}
	
	

}
