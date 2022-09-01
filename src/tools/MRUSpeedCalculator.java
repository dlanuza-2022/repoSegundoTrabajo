package tools;

import java.util.Scanner;

import misc.ExceptionScanner;

public class MRUSpeedCalculator implements ITool {
	Scanner sc = new Scanner(System.in);
	
	private double distance;
	private String distanceType;
	
	private double time;
	private String timeType;
	
	private double speed;
	private String speedType;
	
	public MRUSpeedCalculator() {
		super();
	}

	public MRUSpeedCalculator(double distance, String distanceType, double time, String timeType, double speed,
			String speedType) {
		super();
		this.distance = distance;
		this.distanceType = distanceType;
		this.time = time;
		this.timeType = timeType;
		this.speed = speed;
		this.speedType = speedType;
	}

	public double getDistance() {
		return distance;
	}
	
	

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getDistanceType() {
		return distanceType;
	}

	public void setDistanceType(String distanceType) {
		this.distanceType = distanceType;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSpeedType() {
		return speedType;
	}

	public void setSpeedType(String speedType) {
		this.speedType = speedType;
	}
	

	
	public void selectDistanceType() {
		short op = 0;
		
		do {
			System.out.println("\nSeleccione la medida de distancia que utilizará.");
			System.out.println("1. Metros.");
			System.out.println("2. Kilometros.\n");
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				setDistanceType("m"); 
				break;
			case 2:
				setDistanceType("km");  
				break;
			default:
				System.out.println("Opción inválida.");
				break;
				
			}
			
		}while(op != 1 && op !=2) ; 
		
	}

    public void selectTimeType() {
        short op = 0;
		
		do {
			System.out.println("\nSeleccione la medida de tiempo que utilizará.");
			System.out.println("1. Segundos.");
			System.out.println("2. Horas.");
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				setTimeType("s"); 
				break;
			case 2:
				setTimeType("h"); 
				break;
			default:
				System.out.println("Opción inválida.");
				break;
				
			}
			
		}while(op != 1 && op !=2) ; 
		
		
	}

    public void selectSpeedType() {
    	this.speedType = distanceType + "/" + timeType;
	}
    
    
    public void speedCalculator() {
    	this.speed = distance/time;
    	
    }

	@Override
	public void Function() {
		ExceptionScanner es = new ExceptionScanner();
		
		System.out.println("____________________________________\n");
		System.out.println("===Calculador de velocidad en MRU===");
		System.out.println("____________________________________\n");
		
		System.out.println("==Distancia==");
		selectDistanceType();
		
		System.out.print("Ingrese el valor de la distancia: ");
		setDistance(es.validNumberDouble());
		
		System.out.println("==Tiempo==");
		selectTimeType();
		System.out.print("Ingrese el valor del tiempo: ");
		setTime(es.validNumberDouble());
		
		speedCalculator();
		
		
	}

	@Override
	public void showResult() {
		System.out.printf("El valor de la velocidad es de: %f1"
				+ "%s%s%s ", getSpeed(), getDistanceType(), "/", getTimeType());
		
	}
	

	
	

}
