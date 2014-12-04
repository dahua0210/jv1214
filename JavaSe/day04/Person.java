//怎么自己定义一个类

public class Person{     //
	//成员变量:系统化默认初始化,取决于类型
	String name;
	int age;

	//成员方法
	//构造器:是特殊的成员方法,初始化成员变量,那么也可以[重载]
	//1.无参构造函数
	
	Person(){		
		System.out.println("我是自定义无参构造器");
	}
	//2.一参构造函数
	Person(String name){
		System.out.println("我是一参构造函数");
		this.name = name;	
	}
	//3.两参构造函数
	Person(String name,int age){
			System.out.println("我是二参会构造器");
			this.name= name;
			this.age = age;			
	}
	void setName(String name){
		this.name = name;
	
	}
	//void不可以做形参
	String getName(){
		return this.name;
	}
	
	void info(){
		System.out.println("Name:"+this.name+"\tAge:"+this.age);
	
	}

}