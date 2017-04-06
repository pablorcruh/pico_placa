package ec.com.picoplaca.code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Implementator implements Validator {
	
	/**
	 *	@param  weekDate
	 *  @return dayOfWeek
	 */
	
	public int getWeekDay(String weekDate) throws ParseException {
		SimpleDateFormat dayFormat = new SimpleDateFormat( "dd/MM/yyyy");
		Date date = dayFormat.parse(weekDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
		
	}
	/**
	 * @param licensePlate
	 * @return letter
	 */
	
	public char getLicensePlate(String licensePlate) {
		char letter=licensePlate.charAt(licensePlate.length()-1);
		return letter;
		
	}

	
	/**
	 * @param letter,numDay
	 * @return boolean
	 */
	
	public boolean validateDay(char letter, int numDay) {
		switch (numDay) {
		case 2:
			if(letter == '1' || letter == '2')
				return true;
			break;
		case 3:
			if(letter == '3' || letter == '4')
				return true;
			break;
		case 4:
			if(letter == '5' || letter == '6')
				return true;
			break;
		case 5:
			if(letter == '7' || letter == '8')
				return true;
			break;
		case 6:
			if(letter == '9' || letter == '0')
				return true;
			break;
		}
		return false;
	}

	
	
	/**
	 * @param hours
	 * @return drive
	 */
	public boolean validateHour(String hours) throws ParseException  {
		boolean drive=false;
		String[] parts = hours.split(":");
		String hour = parts[0]; 
		String minute = parts[1]; 
		int h=Integer.parseInt(hour);
		int m=Integer.parseInt(minute);
		if(7<=h && h<=9){
			if(h==9){
				if(m>=30){
					drive=true;
				}else{
					drive=false;
				}
			}else{
				drive=true;
			}
		}else if(16<=h && h<=19){
			if(h==19){
				if(m>=30){
					drive=true;
				}else{
					drive=false;
				}
			}else{
				drive=true;
			}
		}else
		{
			drive=false;
		}
		return drive;
	}

}
