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
		String[] mons = {"1月","2月","3月","4月","5月","6月","7月","8月","9月","10月",
				"11月","12月"};
		String[] weekS={"星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
		int index=c.get(Calendar.MONTH);
		int index2=c.get(Calendar.DAY_OF_WEEK);
		
		
		
		System.out.println(c.get(Calendar.YEAR)+"年"+mons[index]+c.get(Calendar.DAY_OF_MONTH)+
				"日"+weekS[index2]);
		sop(weekS[index2]);
	}
	
	public static void sop (Object obj){
		System.out.println(obj);
		
	}
	
	
	
}
