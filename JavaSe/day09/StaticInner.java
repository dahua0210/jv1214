class Outer{
	//成员变量
	static int a=123;
	static String str="外部类变量";
	
	//静态内部类
	//静态内部类只能访问外部类的静态成员(静态变量和静态方法);
	static class Inner{
	
		String str="gem";
		static String static_str="内部类静态变量";
		
		void  run(){
			System.out.println("内部类非静态方法");
			System.out.println(a);
			System.out.println(str);			
		}
		static void static_run(){
			System.out.println("内部类静态方法");
		}
	}
	void run(){
		//对内部类的类变量、类方法
		System.out.println(Inner.static_str);
		Inner.static_run();
		//对内部类的实例变量、实例方法
		Inner in= new Inner();
		System.out.println(in.str);
		in.run();
	}
}
public class StaticInner{
	public static void main(String[] args){
		System.out.println(Outer.Inner.static_str);
		Outer.Inner.static_run();
		Outer.Inner in=new Outer.Inner();//静态内部类的对象可以直接生成,不需要通过生成外部类对象来生成
		System.out.println(in.str);
		in.run();
		in.static_run();
		Outer o = new Outer();
		o.run();
	}
}

