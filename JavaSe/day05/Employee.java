//子类可以继承父类的变量以及方法
//this 和 super 不能同时使用（因为都必须在第一行）

public class Employee{
	int id;
	String name;
	double salary;
	
	//子类构造方法:必须调用[子类构造方法]
	//构造函数:不能被继承
	public Employee(){
		System.out.println("父类无参构造函数");
	}
	public String getName(){
		return name;
	}
	public Double getSalary(){
		return salary;
	}
	public void info(){
		System.out.println("父类的info()");
		System.out.println("id:"+id+"\nname:"+name+"salary:"+salary);
	
	}
}