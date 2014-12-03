import java.util.Date;

public class InputTest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		/*System.out.println("What is your name?");
		String name = in.next();
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("Hello,"+name+".Next year,you will be"+(age+1));*/
		
		/*double x = 10000.0 / 3.0;
		System.out.println("%8.2f",x);*/
		/*if(in.hasNextInt()){
			int num = in.nextInt();
			System.out.println(num);
			}
		else{
			
			System.out.println("请输入正确的数字");
			}*/
			/*Date date = new Date();
			System.out.println("%tc",date());*/
			int yourSales = 7000;
			int target = 6500;
			String performance;
			
			if(yourSales >=target){
				
				performance = "Satisfactory";
				double bonus = 100 + 0.01*(yourSales-target);
				System.out.priintln("performance: "+performance+"bonus="+bonus);
			}
			else{
				performance = "Unsatisfactory";
				double bonus = 0;
				System.out.priintln("performance: "+performance+"bonus="+bonus);
				break;
		
		
	
	
	}
	



}