package runtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	
	public static void main(String[] args) {
		/*Date date = new Date();
		 
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy");
		String year = sdf.format(date);
		
		System.out.println(year);*/
		Calendar c = Calendar.getInstance();
		String[] mons = {"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��",
				"11��","12��"};
		String[] weekS={"������","����һ","���ڶ�","������","������","������","������",};
		int index=c.get(Calendar.MONTH);
		int index2=c.get(Calendar.DAY_OF_WEEK);
		
		
		
		System.out.println(c.get(Calendar.YEAR)+"��"+mons[index]+c.get(Calendar.DAY_OF_MONTH)+
				"��"+weekS[index2]);
		sop(weekS[index2]);
	}
	
	public static void sop (Object obj){
		System.out.println(obj);
		
	}
	
	
	
}
