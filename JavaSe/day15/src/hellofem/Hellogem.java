package hellofem;
import java.util.Scanner;


public class Hellogem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入课程代号(1至3之间的数字)");
		Scanner in = new Scanner(System.in);
		int courseCode = in.nextInt();//从键盘输入整数
		switch(courseCode){
		case 1:
			System.out.println("C编程");
			break;
		case 2:
			System.out.println("Java编程");
			break;
		case 3:
			System.out.println("SQl基础");
			break;
		}
	}
}
//异常类:描述程序中出现的不正常的情况
//异常判断,异常处理分离
