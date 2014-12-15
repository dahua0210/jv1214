import java.util.*;
import static java.lang.System.out;
public class StringTest{
	public static void main(String[] args){
		String s = new String("java.lang Class String");
		String s1 = new String("abcdedfghijk");
		String s2 = new String("0123456789");
		System.out.println(s1.indexOf("d"));
		System.out.println("s1.toUpperCase()"+s1.toUpperCase());
		System.out.println("s.toLowerCase()"+s.toLowerCase());
		System.out.println("s.substring()"+s.substring(2,6));
		System.out.println("s.substring()"+s.substring(2));
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		//追加字符串
		sb.insert(0,"hello");
		//插入"hello"
		sb.replace(5,6,",");
		System.out.println(sb);
		
		System.out.println("Math.toDegrees(1.57):"+Math.toDegrees(1.57));
		System.out.println("Math.toRadians(90)"+Math.toRadians(90));
		//将角度转换为弧度
		System.out.println("Math.floor(-1.5)"+Math.floor(-1.5));
		//返回小于目标的最大整数
		System.out.println("Math.ceil(1.2)"+Math.ceil(1.2));
		//返回大于目标数的最小的整数
		System.out.println("Math.round(3.3)"+Math.round(3.3));
		//四舍五入取整
		System.out.println("Math.pow(3,2)"+Math.pow(3,2));
		//计算乘方
		System.out.println("Math.max(3,8)"+Math.max(3,8));
		//计算最大值;
		System.out.println("Math.randon"+Math.random());
		//产生一个0-1之间的随机数
		Random rand = new Random();
		System.out.println("rand.nextDouble():"+rand.nextDouble());
		Date d = new Date();
		Date d1 = new Date(System.currentTimeMillis()+100);
		System.out.println(d1);
		System.out.println(d.compareTo(d1));
		System.out.println(d.before(d1));
		//Calendar类是一个抽象类,所以不能使用构造器来创建Calendar对象,
		/*Calendar c = Calendar.getInstance();
		//取出年
		System.out.println(c.get(YEAR));
		//取出月份
		System.out.println(c.get(MONTH));
		//取出ri
		System.out.println(c.get(DATE));*/
		

	}


}