package ec.com.picoplaca.test;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ec.com.picoplaca.code.Data;
import ec.com.picoplaca.code.Implementator;
import ec.com.picoplaca.code.PicoPlaca;



public class TestValidator {
	
	private Implementator implementator;
	private PicoPlaca picoPlaca;
	private boolean v= true;
	@Before
	public void setUp() throws Exception {
		implementator=new Implementator();
		picoPlaca=new PicoPlaca();
	}

	@Test
	public void testWeekDay() {
		try {
			Assert.assertEquals(2, implementator.getWeekDay("27/03/2017"));
		} catch (ParseException e) {
			System.out.println("Sorry but we encounter a problem");
		}
		
	}
	@Test
	public void testLicensePlate(){
		Assert.assertEquals('6',implementator.getLicensePlate("pde456"));
	}
	
	@Test
	public void validateDay(){
		Assert.assertEquals(v,implementator.validateDay('0', 6));
	}
	
	@Test
	public void validateHours(){
		try {
			Assert.assertNotEquals(v,implementator.validateHour("9:29"));
		} catch (Exception e) {
			System.out.println("Sorry but we encounter a problem");
		}
	}
	
	//License plate format 3 letters 4 numbers no spaces
	
	// Week day format dd/mm/yyy
					
	// time format 24 h string hh:mm
			
	@Test
	public void valitAbleToDrive(){
		Assert.assertNotEquals("Able To Drive",picoPlaca.restrinction(new Data("phe785","03/04/2017","17:30")));
	}
	
	@Test
	//License plate format 3 letters 4 numbers no spaces
	
	// Week day format dd/mm/yyy
					
	// time format 24 h string hh:mm
			
	
	public void valitNotAbleToDrive(){
		Assert.assertNotEquals("Able To Not Drive",picoPlaca.restrinction(new Data("phe781","27/03/2017","17:30")));
	}

}
