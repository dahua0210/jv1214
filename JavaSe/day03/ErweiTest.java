import java.util.*;
public class ErweiTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String [] name = {"a","b","c"};//存储学生的名字
		int[][] grade={{50,40,70},{70,50,90,},{88,12,47},};//存储各科学生的成绩学生的成绩
		System.out.println("输入要查询的学生名字");
		String chioce = in.next();
		for(int i = 0;i < 3;i++){
			if(name[i] .equals(chioce)){
			System.out.println("学生:"+name[i]+"的成绩如下:");
			System.out.println("C语言:"+grade[i][0]+"高数:"+grade[i][1]+
			"英语:"+grade[i][2]);
			
			
			}
		}
		System.out.println("输入要查询不及格的科目的序号");
		System.out.println("1程序设计,2.高数3.英语");
		int ch = in.nextInt();
		int time=0;
		for(int i = 0;i<3;i++){
		if(grade[i][ch-1]<60){
			time++;
		System.out.println("该科目:"+i+"挂的次数"+time);
		
		}
		}
		
		
	}
}