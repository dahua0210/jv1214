import java.util.Scanner;

public class L2_2 {
	public static void main(String[] args) throws Exception{
		A aa = new A();
		try {
			aa.a();
		} catch (Exception e) {
			System.out.println("��������");
		}
			System.out.println("˳��������..");
	}

}
class A{
	void a () 
	{
		int a,b,c;
		Scanner s = new Scanner(System.in) ;
		System.out.println("������a������");
		a = s.nextInt();
		System.out.println("������b������");
		b = s.nextInt();
		c = a%b;
		System.out.println("������:"+c);
	}
}





