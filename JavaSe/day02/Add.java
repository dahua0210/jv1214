import java.util.*;
public class Add{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = 0;
		System.out.println(++a);
		int b = 0;
		System.out.println(b++);
		int c = 6;
		System.out.println(--c);
		int d = 6;
		d +=2;
		d *=5;
		System.out.println(d--);
		System.out.println("请输入你的成绩");
		int score = in.nextInt();
		int x = -100;
		String type = score <60?"不及格":"及格";
		int flag = x>0?1:(x==0?0:-1);
		System.out.println("type= "+type);
		System.out.println("flag= "+flag);
		String expletive = "Expletive";
		String Pg13 = "deleted";
		String message =  expletive + Pg13;
		System.out.println("message ="+message);
		int age = 13;
		String rating = "pg"+ age;
		System.out.println("rating ="+rating);
		String greeting = HELLO;
		String greeting1 = hello;
			if("HELLO".equal(greeting1)){
			System.out.println("真确");
			}
			else{
			System.out.println("错误");	
		
			}
	
		
		
	}

}