package ec.com.picoplaca.code;

import java.text.ParseException;

public interface Validator {


	//Method to get week day
	public int getWeekDay(String weekDate) throws ParseException;
	
	//Method to get Last char of license plate
	public char getLicensePlate(String licensePlate);
	
	
	//Method to Validate circulation days
	public boolean validateDay(char letter,int numDay);
	
	
	// Method to validate circulation hours
	public boolean validateHour(String hours) throws ParseException;
}
