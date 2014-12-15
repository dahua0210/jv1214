class Outer{
	//成员变量
	int a= 123;
	private String str = "外部类的变量";
	
	//静态成员内部类:
	class  Inner{
		//final static int a = 123;
		String str = "内部类的变量"; 
		void run(){
			String str = "局部变量";//内部类可以直接访问外部类中的成员,摆阔私有成员
			System.out.println("内部类run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
			//访问外部成员变量的方法.
		}
	}
	//成员方法
	void run (){
		System.out.println("外部类run()");
		Inner in = new Inner();//外部类要访问内部类中的成员必须要建立内部类的对象.
		in.run();
		}
	static void static_run(){
		System.out.println("外部类static_run()");
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
}
	
	
	
public class InnerDemo{
	public static void main (String[] args){
	//外部类的使用
		Outer outer = new Outer();
		outer.run();
		outer.static_run();
		
		//3.成员内部类
	//Outer out = new Outer();
	//Outer.Inner in = out.new.Inner();
	//in.run();//匿名对象
	Outer.Inner i = new Outer().new Inner();
	//Outer.Inner inner = (new Outer()).new Inner();
	i.run();
	}
}