/*static{
	静态代码块中执行语句

}
特点:随着类的加载而执行,并且只会执行一次,并且还犹豫
主函数作用:用于给类进行初始化



*/
class A6_42{
	public static void main (String[] args){
		System.out.println("我是主函数");
		}
	static{
	System.out.println("我是静态住吗块");
	}
		
	}