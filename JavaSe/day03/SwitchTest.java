import java.util.Scanner;
public class SwitchTest{
	public static void main(String args[]){
		System.out.println("����ϲ��������");
		Scanner in = new Scanner(System.in);
		String car = in.next();//��ȡ�ĵ��� nextInt() nextLine();
		
		switch(car){
			case "Benz":
			System.out.println("Benz");
			break;
			case "tesila":
			System.out.println("tesila");
			break;
			case "Ford":
			System.out.println("Ford");
			break;
			default :
			System.out.println("others Car");
			break;
			
		}
		in.close();
	}



}