import java.util.Scanner;

public class Admin{//管理学生一个类
	
	Scanner in = new Scanner(System.in);
	String msg = "\t编号\t姓名\t年龄\tjava\tC#\thtml\tsql\t总分\t平均分";
	public void print(Student[] arr){
		System.out.println(msg);
			for(int i=0;i<arr.length;i++){
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
		}
	}
	public boolean exist(int on,Student stu){//判断学生是否存在
		if(stu!=null){
			if(stu.getOn()==on){
			return true;
			}
			return false;
		}
			return false;
	}
	public void create(String name,int age,Student[] arr){//添加学生的方法
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		this.setIndex(arr);
		int i= this.setIndex(arr);
		stu.setOn(i);
		if(i == 9999){
			System.out.println("学生人数已到最大");
		}else{
		arr[i] = stu;
		}
		this.print(arr);
	}
	//arr[i] ==学生个体
	public void select(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
				System.out.println(msg);
				System.out.println(arr[i]);
				return;//与break相比return结束了方法
			}
		}
		System.out.println("查找无此学生");
	}
	public int setIndex(Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]== null){
				return i;
			}
		}
		return 9999;
	}
	public void update(int on,String name,int age,Student[] arr){
		for(int i =0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
				arr[i].setName(name);
				arr[i].setAge(age);
				System.out.println("更新学生成功");
				return;
			}
		}
		System.out.println("查无此学生");
	}
	
	public void delete(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
				arr[i]= null;
				this.print(arr);
				System.out.println("删除学生成功");
				return;
			}
		}
		System.out.println("找不到你所要删除的学生编号");	
	
	
	}
	public void score(int on,Student[] arr){
		for(int i =0;i<arr.length;i++){
			if(this.exist(on,arr[i])==true){
               System.out.println("请输入java的成绩");
				arr[i].setJava(in.nextInt());
				System.out.println("请输入c的成绩");
				arr[i].setC(in.nextInt());
				System.out.println("请输入html的成绩");
				arr[i].setHtml(in.nextInt());
				System.out.println("请输入sql的成绩");
				arr[i].setSql(in.nextInt());
				this.print(arr);
				break;
			}
	
		}
	
	}
	public void course(int number,Student[] arr){
		if(number==1){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null && arr[j] !=null){
				if(arr[i].getJava()<arr[j].getJava()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
					}
				}
			}
		}
	}else if(number ==2){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null && arr[j] !=null){
				if(arr[i].getC()<arr[j].getC()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
					}
				}
			}
		}		
	}else if(number ==3){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null && arr[j] !=null){
				if(arr[i].getHtml()<arr[j].getHtml()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
					}
				}
			}
		}		
	}else if(number ==4){
			for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null &&arr[j] !=null){
				if(arr[i].getSql()<arr[j].getSql()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
						}
					}
				}
			}		
		}
			this.print(arr);
	}
	
	public void sumSort(Student[] arr){//根据总分进行排序
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null &&arr[j] !=null){
				if(arr[i].getSum()<arr[j].getSum()){
					Student temp =arr[i];
					arr[i] = arr[j];
					arr[j]	=temp;		
						}
					}
				}
			}		
		this.print(arr);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}