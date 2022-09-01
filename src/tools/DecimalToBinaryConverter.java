package tools;

import java.util.Collections;
import java.util.Scanner;

import misc.ExceptionScanner;

public class DecimalToBinaryConverter implements ITool {
	Scanner sc = new Scanner(System.in);
	ExceptionScanner es = new ExceptionScanner();
	
	private long decimalBaseNumber;
	private String binaryBaseNumber;
	private long modulo;
	
	public DecimalToBinaryConverter() {
		super();
	}

    
	public DecimalToBinaryConverter(long decimalBaseNumber, String binaryBaseNumber, long modulo) {
		super();
		this.decimalBaseNumber = decimalBaseNumber;
		this.binaryBaseNumber = binaryBaseNumber;
		this.modulo = modulo;
	}
	

	public long getModulo() {
		return modulo;
	}

	public void setModulo(long modulo) {
		this.modulo = modulo;
	}


	public long getDecimalBaseNumber() {
		return decimalBaseNumber;
	}

	public void setDecimalBaseNumber(long decimalBaseNumber) {
		this.decimalBaseNumber = decimalBaseNumber;
	}

	
	
	
	public String getBinaryBaseNumber() {
		return binaryBaseNumber;
	}


	public void setBinaryBaseNumber(String binaryBaseNumber) {
		this.binaryBaseNumber = binaryBaseNumber;
	}

    @Override
	public void Function() {
    	
    	
    	System.out.println("_________________________________________________\n");
		System.out.println("===Convertidor de base decimal a base binaria===");
		System.out.println("_________________________________________________\n");	
		
		System.out.print("Ingrese el número a convertir: \n");
		setDecimalBaseNumber(es.validNumberLong());
		
		setBinaryBaseNumber(Long.toBinaryString(getDecimalBaseNumber()));
		
		}


	@Override
	public void showResult() {
	System.out.printf("EL numero %d base 10 convertido a base 2 es igual a: %s", getDecimalBaseNumber(), getBinaryBaseNumber());
			
		
		
	}
		
}
	
	
	
	


