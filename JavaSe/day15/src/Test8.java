import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		try{
			a = sc.nextInt();
			b = sc.nextInt();
			c = a%b;
			System.out.println("������:"+c);
		}
		catch(Exception e){
			System.out.println("��������");
		}
		System.out.println("����˳��������");
	}
}
