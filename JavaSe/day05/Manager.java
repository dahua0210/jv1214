public class Manager extends Employee{
	//特有属性

	String car;
	String office;
	//子类构造方法:必须调用[父类的构造方法]
	//
	public Manager(){//子类无参构造方法 + 没有显示调用父类构造函数  =自动调用父类无参构造
	
		System.out.println("子类无参构造函数");
	
	}
	
	//特有方法
	public void driver(){
		
		System.out.println("name:" +name+"开"+this.car+"上班");
	
	}
	//super:父类的引用
	public void info(){
		System.out.println("子类的info()");
		//System.out.println("id:"+id+"\nname:"+name+"\nsalary:"+salary);
		super.info();
		System.out.println("car:"+car+"\noffice:"+office);
	}

}