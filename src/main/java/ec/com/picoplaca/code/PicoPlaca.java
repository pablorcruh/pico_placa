package ec.com.picoplaca.code;

public class PicoPlaca {
	
	
	public String restrinction(Data data) {
		String result="";
		try {
			Implementator implementator=new Implementator();
			char n=implementator.getLicensePlate(data.getLicensePlate());
			int w=implementator.getWeekDay(data.getWeekDay());
			boolean day=implementator.validateDay(n, w);
			boolean h=implementator.validateHour(data.getTime());
			if(day){
				if(!h){
					result="Able to Drive";
				}else{
					result="Not Able to Drive";
				}
			}else{
				result="Able to Drive";
			}
		} catch (Exception e) {
			System.out.println("Sorry, we encounter an error");
		}
		return result;	
	}
}
