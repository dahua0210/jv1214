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
			System.out.println("余数是:"+c);
		}
		catch(Exception e){
			System.out.println("输入有误");
		}
		System.out.println("程序顺利进行中");
	}
}
