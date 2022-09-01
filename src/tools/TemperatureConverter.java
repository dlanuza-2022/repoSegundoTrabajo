package tools;

import java.util.Scanner;

public class TemperatureConverter implements ITool {
	Scanner sc = new Scanner(System.in);
	
	private double inputTemperature;
	private double outputTemperature;
	private String outputType;
	private String inputType;
	
	public TemperatureConverter() {
		super();
	}
	
	
	

	public TemperatureConverter(double inputTemperature, double outputTemperature, String outputType, String inputType) {
		super();
		this.inputTemperature = inputTemperature;
		this.outputTemperature = outputTemperature;
		this.outputType = outputType;
		this.inputType = inputType;
	}



	
    public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public String getOutputType() {
		return outputType;
	}

	public void setType(String outputType) {
		this.outputType = outputType;
	}

	public double getInputTemperature() {
		return inputTemperature;
	}

	public void setInputTemperature(double inputTemperature) {
		this.inputTemperature = inputTemperature;
	}

	public double getOutputTemperature() {
		return outputTemperature;
	}

	public void setOutputTemperature(double outputTemperature) {
		this.outputTemperature = outputTemperature;
	}
	
	
	
	
	
	

	public void CelciusToFarenheit() {
		this.inputType = "°C";
		
		this.outputTemperature = (inputTemperature * 1.8) + 32;
		this.outputType = "°F";
		
	}
	
    public void FarenheitToCelcius() {
    	this.inputType = "°F";
    	
    	this.outputTemperature = (inputTemperature - 32) / 1.8;
    	this.outputType = "°C";
    	
	}
    
    public void CelciusToKelvin() {
    	this.inputType = "°C";
    	
	    this.outputTemperature = inputTemperature + 273.15;
	    this.outputType = "°K";
	
    }
    
    public void KelvinToCelcius() {
    	this.inputType = "°K";
    	
    	this.outputTemperature = inputTemperature - 273.15;
		this.outputType = "°C";
		
	}
    
    public void FarenheitToKelvin() {
    	this.inputType = "°F";
    	
    	this.outputTemperature = (inputTemperature - 32) / (1.8 + 273.15);
    	this.outputType = "°K";
		
		
	}

    public void KelvinToFarenheit() {
    	this.inputType = "°K";
    	
    	this.outputTemperature = (inputTemperature * 1.8) - 459.67;
    	this.outputType = "°F";
	
    }




	@Override
	public void Function() {
		System.out.print("Ingrese el valor de la temperatura a convertir: ");
		setInputTemperature(sc.nextDouble());
	}




	@Override
	public void showResult() {
		
		System.out.printf("%f%s es igual a: %f%s ", getInputTemperature(), getInputType(), getOutputTemperature(), getOutputType());
		
	}
	

	
	
	
	

}
