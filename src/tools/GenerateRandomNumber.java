package tools;

import java.util.Scanner;

public class GenerateRandomNumber implements ITool {
	Scanner sc = new Scanner(System.in);
	private int maxNumber;
	private int minNumber;
	private int randomNumber;
	
	public GenerateRandomNumber() {
		super();
	}

	public GenerateRandomNumber(int maxNumber, int minNumber, int randomNumber) {
		super();
		this.maxNumber = maxNumber;
		this.minNumber = minNumber;
		this.randomNumber = randomNumber;
	}

	
	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public int getMinNumber() {
		return minNumber;
	}

	public void setMinNumber(int minNumber) {
		this.minNumber = minNumber;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	
	
	public void generateRandomNumberFrom0To100() {
		
		this.randomNumber = (int) Math.floor(Math.random()*((100 - 0 + 1) + 0 ));
	}

	@Override
	public void Function() {
		System.out.println("===Generador de numero aleatorio===");
		
		System.out.print("Número mínimo: ");
		setMinNumber(sc.nextInt());
		
		System.out.print("Número máximo: ");
		setMaxNumber(sc.nextInt());
		
		this.randomNumber = (int) Math.floor(Math.random()*((getMaxNumber() - getMinNumber() + 1) + getMinNumber() ));
		
	}

	@Override
	public void showResult() {
		System.out.printf("El número aleatorio es: %d", getRandomNumber());
		
	}

}
