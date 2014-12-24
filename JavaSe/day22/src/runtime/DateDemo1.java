package runtime;
import java.util.*;
import java.text.*;
import javax.xml.crypto.Data;
public class DateDemo1 {

	
	public static void main(String[] args) {
		
			Date d =new Date();
			//System.out.println(d);//希望打印有点格式
			 //将模式封装到SimpleDateFormat中
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日星期E hh:mm:ss");
		//调用format方法让模式指定Date对象
			 String time = sdf.format(d);
			 System.out.println("time="+time);
	}

}
 