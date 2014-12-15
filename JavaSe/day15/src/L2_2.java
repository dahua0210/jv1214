import java.util.Scanner;

public class L2_2 {
	public static void main(String[] args) throws Exception{
		A aa = new A();
		try {
			aa.a();
		} catch (Exception e) {
			System.out.println("输入有误");
		}
			System.out.println("顺利进行中..");
	}

}
class A{
	void a () 
	{
		int a,b,c;
		Scanner s = new Scanner(System.in) ;
		System.out.println("请输入a的数字");
		a = s.nextInt();
		System.out.println("请输入b的数字");
		b = s.nextInt();
		c = a%b;
		System.out.println("余数是:"+c);
	}
}





