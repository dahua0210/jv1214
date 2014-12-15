class Outer{
	int a =123;
	private String str= "geminno";
	void run(){
		String local_var= "局部变量";
		final int num = 1111;
		
		
		//局部内部类!!!作用范围只在内部方法体制中
		//public class Inner{  error
		//static class Inner{  error
		class Inner{
			String str = "inner class";
			int aaa = 888;
			//static String var = "static var";//不能定义静态变量
			static final String s= "java";
			void local_run(){
				System.out.println("内部类:成员方法"+num);//不能访问局部变量local_var
				System.out.println(a+"\t"+str);
				System.out.println(Outer.this.str);
			}
		}
		Inner in=new Inner();
		in.local_run();
	}
}
public class LocalInner{
	public static void main(String[] args){
		Outer out = new Outer();
		out.run();
		
		
		
	}

}