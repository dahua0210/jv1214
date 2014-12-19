import java.util.*;
public class Text{
	public static void main(String[] args){
		System.out.println("------请输入学生的个数-------");
		Scanner in = new Scanner(System.in);
		Student[] stuArr  = new Student[in.nextInt()];
		Admin adminStu = new Admin();
		while(true){
		System.out.println("--你要执行的程序--");
		System.out.println("--10:添加一个学生--");
		System.out.println("--11:查找一个学生----");
		System.out.println("--12:根据编号更新学生的基本信息--------");
		System.out.println("--13:根据编号删除学生--");
		System.out.println("--14:根据编号输入各门学生的成绩--");
		System.out.println("--15:根据莫门成绩进行排序--");
		System.out.println("--16:根据总分进行排序--");
		System.out.println("--99:退出系统--");
		int num = in.nextInt();
	
		if(num ==10){
			System.out.println("请输入学生的姓名:");
			String name = in.next();
			System.out.println("请输入学生的年龄:");
			int age = in.nextInt();
			adminStu.create(name,age,stuArr);//添加学生
		}else if(num == 11){
			System.out.println("执行查询");
			System.out.println("执行要查询学生的编号");
			int on = in.nextInt();
			adminStu.select(on,stuArr);
			adminStu.print(stuArr);
			}else if(num == 12){
			System.out.println("更新学生信息操作");
			System.out.println("请输入要学生编号");
			int on = in.nextInt();
			System.out.println("请输入要学生的姓名");
			String name = in.next();
			System.out.println("请输入要学生的年龄");
			int age = in.nextInt();
			adminStu.update(on,name,age,stuArr);
			adminStu.print(stuArr);
			}else if(num == 13){
				System.out.println("执行删除功能");
				System.out.println("请输入要删除学生的编号");
				int on = in.nextInt();
				adminStu.delete(on,stuArr);
			}else if(num == 14){
				System.out.println("执行输入成绩的功能");
				System.out.println("请输入学生编号:");
				int on = in.nextInt();
				adminStu.score(on,stuArr);
			
			}else if(num == 15){
				System.out.println("执行课程排序功能");
				System.out.println("1.java,2.C,3.html,4.sql");
				int number = in.nextInt();
				adminStu.course(number,stuArr);
			}else if(num == 16){
				System.out.println("执行总分进行排序的方法");
				adminStu.sumSort(stuArr);
			}else if(num == 99){
				System.out.println("程序已退出");
				System.exit(0);
			
			}
		
		}
	}
}