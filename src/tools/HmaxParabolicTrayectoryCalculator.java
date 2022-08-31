package tools;

import java.util.Scanner;

public class HmaxParabolicTrayectoryCalculator implements UtilOperator, ITool {
	Scanner sc = new Scanner(System.in);
	
	private double maxHeight;
	private double initialSpeed;
	private double inclinationAngle;
	
	public HmaxParabolicTrayectoryCalculator() {
		super();
	}

	public HmaxParabolicTrayectoryCalculator(double maxHeight, double initialSpeed, double inclinationAngle) {
		super();
		this.maxHeight = maxHeight;
		this.initialSpeed = initialSpeed;
		this.inclinationAngle = inclinationAngle;
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
	public double getInclinationAngle() {
		return inclinationAngle;
	}
	public void setInclinationAngle(double inclinationAngle) {
		this.inclinationAngle = inclinationAngle;
	}
	
	
	

	@Override
	public void Function() {
		System.out.println("===Calculador de altura máxima en un movimiento parabolico===");
		
		System.out.print("Velocidad inicial: ");
		setInitialSpeed(sc.nextDouble());
		System.out.print("Ángulo de inclinación: ");
		setInclinationAngle(sc.nextDouble());
		
		this.maxHeight = (Math.pow(getInitialSpeed(), 2) * Math.sin(getInclinationAngle())) / 2 * gravity;
		
	}

	@Override
	public void showResult() {
		System.out.printf("La altura máxima es de: %d", getMaxHeight());
		
	}
	
	

}
