package ec.com.picoplaca.code;

public class Data {
	private String licensePlate;
	private String weekDay;
	private String time;
	
	public Data(){
		
	}
	
	public Data(String licensePlate, String weekDay, String time) {
		super();
		this.licensePlate = licensePlate;
		this.weekDay = weekDay;
		this.time = time;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
