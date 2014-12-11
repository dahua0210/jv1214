/*
设计模式:针对此类问题最有效的解决方法
Java23中设计模式
单例设计模式:解决一个类只在内存中只存在一个对象

如何让一个类在内存中只存在一个对象
1.禁止其他应用程序,通过此类来创建对象
2.既然外部不能通过此类创建对象了,我们要用对象,就可以在本类里面创建本类对象
3.为了其他应用程序能够访问到本类里面创建的对象;
我们需要对外提供一种访问方式
如何用代码体现出来
1:私有化对象
2.在本类中创建对象
3.对外界提供访问的方法
*/
class Person{
		String name;
		private Person(){}
		static Person p = new Person();
		public static Person getInstance()	{
			return p;
		}
		

}
public class DanLi{

public static void main(String[] args){
	Person a = Person.getInstance();
	a.name= "小敏";
	Person b= Person.getInstance();
	System.out.println(b.name);
	}

}




