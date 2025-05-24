package MKT;
import java.util.Date;

public class Assg85 {
	
	void date(Date d){
		String format = d.toString();
		String date = format.substring(8, 10);
		System.out.println(date);
		
		String month = format.substring(4, 7);
		System.out.println(month);
	
		String year = format.substring(format.length()-4);
		System.out.println(year);
		
		String format1 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format1);
	}
public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(d1.getTime()+1000*60*60*24*4);
		Date d3 = new Date(d1.getTime()-1000*60*60*24*4);
		

		
		Assg85 s = new Assg85();
		System.out.println("Current date");
		s.date(d1);
		System.out.println("Past date");
		s.date(d3);
		System.out.println("Future date");
		s.date(d2);
		

	}

}
