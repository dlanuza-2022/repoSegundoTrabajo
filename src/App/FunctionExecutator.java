package App;

import tools.MRUSpeedCalculator;
import tools.DecimalToBinaryConverter;
import tools.FactorialCalculator;
import tools.GenerateRandomNumber;
import tools.HmaxParabolicTrayectoryCalculator;
import tools.PrimeNumerIdentifier;
import tools.SumTwoNumbers;
import tools.TemperatureConverter;


public class FunctionExecutator {
	
	public static void calculateSpeedMRU() {
		MRUSpeedCalculator tool = new MRUSpeedCalculator();
		tool.Function();
		tool.showResult();
	}
	
	
	public static void convertDecimalToBinary() {
		DecimalToBinaryConverter tool = new DecimalToBinaryConverter();
		tool.Function();
		tool.showResult();
	}
	
	public static void calculateFactorial() {
		FactorialCalculator tool = new FactorialCalculator();
		tool.Function();
		tool.showResult();
		
	}
	
	public static void calculateHmax() {
		HmaxParabolicTrayectoryCalculator tool = new HmaxParabolicTrayectoryCalculator();
		tool.Function();
		tool.showResult();
		
	}
	
	public static void identifyPrimeNymber() {
		
		PrimeNumerIdentifier tool = new PrimeNumerIdentifier();
		tool.Function();
		tool.showResult();
		
	}
	
    public static void sumTwoNumbers() {
		
		SumTwoNumbers tool = new SumTwoNumbers();
		tool.Function();
		tool.showResult();
		
	}
	
    public static void generateRandomNumber() {
	
	    GenerateRandomNumber tool = new GenerateRandomNumber();
     	tool.Function();
	    tool.showResult();
	
}

	


}
