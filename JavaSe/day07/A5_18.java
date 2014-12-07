import java.util.*;
public class A5_18{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入学生的人数");
		int renshu = in.nextInt();
		System.out.println("请输入课程的数目");
		int courseNum = in.nextInt();//存储课程的数目
		String[] name = new String[renshu];//存储学生的姓名
		String[] course= new String[courseNum];//声明一个String数组课程名称
		int[][] number= new int[renshu][courseNum];
		int[] sum = new int[renshu];
		int[] avg = new int[renshu];
		String[] str= new String[renshu];
		/*
		*用来循环录入存储课程的名称
		*/
		
		for(int i=0;i<course.length;i++){
			System.out.println("请定义第"+(i+1)+"课程的名字");
			course[i] = in.next();//输入课程的名称
		}
		//用来录入学生各科成绩
		
		
		for(int i=0;i < renshu;i++){
			int S = 0;
			System.out.println("请输入学生的姓名");
			name[i] = in.next();//存储学生的姓名
			String str11 = "";
			for(int j = 0;j<courseNum;j++){
			System.out.println("请输入学生"+name[i]+course[j]+"成绩");	
			 number[i][j]  =in.nextInt();//用来存储特定学生的特定成绩
			S+=number[i][j];
			str11+=number[i][j]+"\t";
			}
			sum[i]=S;//求出此同学的总分存入总分数组
			avg[i]=S/courseNum;//求出此同学的平均分存入平均分数组
			str[i]=name[i]+"\t"+str11+sum[i]+"\t"+avg[i];
			
		}
		for(int i = 0;i<sum.length-1;i++){
			for(int j=0;j<sum.length-1;j++){
				if(sum[j]<sum[j+1]){
				int t1 = sum[j];  String t2 = str[j];
				sum[j]= sum[j+1]; str[j]= str[j+1];
				sum[j+1]= t1;     str[j+1]= t2;
				}
			}
		}
		
	System.out.print("学生");
	for(int i= 0;i<course.length;i++){
	System.out.print("\t"+course[i]);
	}
	System.out.println("\t总分\t平均分\t排行榜");
	System.out.println();//换行
	for(int i= 0;i<renshu;i++){
		 System.out.println(str[i]+"\t第"+(i+1)+"名");//换行
	
	 }
	}
}

