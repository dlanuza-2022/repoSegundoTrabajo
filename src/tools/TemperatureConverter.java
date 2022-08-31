package tools;

public class TemperatureConverter implements ITool {
	
	private double inputTemperature;
	private double outputTemperature;
	private String outputType;
	
	
	public TemperatureConverter() {
		super();
	}
	
	
	

	public TemperatureConverter(double inputTemperature, double outputTemperature, String outputType) {
		super();
		this.inputTemperature = inputTemperature;
		this.outputTemperature = outputTemperature;
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
		
		this.outputTemperature = (inputTemperature * 1.8) + 32;
		this.outputType = "°F";
		
	}
	
    public void FarenheitToCelcius() {
    	
    	this.outputTemperature = (inputTemperature - 32) / 1.8;
    	this.outputType = "°C";
    	
	}
    
    public void CelciusToKelvin() {
    	
	    this.outputTemperature = inputTemperature + 273.15;
	    this.outputType = "°K";
	
    }
    
    public void KelvinToCelcius() {
    	
    	this.outputTemperature = inputTemperature - 273.15;
		this.outputType = "°C";
		
	}
    
    public void FarenheitToKelvin() {
    	
    	this.outputTemperature = (inputTemperature - 32) / (1.8 + 273.15);
    	this.outputType = "°K";
		
		
	}

    public void KelvinToFarenheit() {
    	
    	this.outputTemperature = (inputTemperature * 1.8) - 459.67;
    	this.outputType = "°F";
	
    }




	@Override
	public void Function() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void showResult() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	

}
