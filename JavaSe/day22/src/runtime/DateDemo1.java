package runtime;
import java.util.*;
import java.text.*;
import javax.xml.crypto.Data;
public class DateDemo1 {

	
	public static void main(String[] args) {
		
			Date d =new Date();
			//System.out.println(d);//ϣ����ӡ�е��ʽ
			 //��ģʽ��װ��SimpleDateFormat��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd������E hh:mm:ss");
		//����format������ģʽָ��Date����
			 String time = sdf.format(d);
			 System.out.println("time="+time);
	}

}
 