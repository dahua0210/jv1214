//[成员变量]初始化工作?= = 构造函数
//?[类变量]能不能再构造函数中初始化?
public class DogTest{
	public static void main(String[] args){
	System.out.println("我在main函数中");
	//类变量:不依赖于对象优先于对象而存在
	System.out.println("Dog.type=" + Dog.type);
	Dog.type = "藏獒";
	System.out.println("Dog.type=" + Dog.type);
	//类方法:
	Dog.bark1();
	
	
	
	//实例变量
	Dog dog = new Dog(12,"Red");
	Dog dog2 = new Dog(15,"Block");
	//实例变量:依赖于对象
	/*static变量= 类变量
	1.一个类只有一份,被类的所有实例共享
	2.随着类的加载而加载,优先于对象存在
	3.能在没有生成类和类的实例时就访问到,从莫种意义类似于
	全局变量
	4.可以直接使用类名来访问:类.字段*/
	
	/*System.out.println("dog.type=" + dog.type);
	System.out.println("dog2.type=" +dog2.type);
	System.out.println("Dog.type=" + Dog.type);
//类变量共享
	System.out.println("dog.age=" +dog.age);
	System.out.println("dog2.age=" +dog2.age);*/
	//Dog.age = 123;
	dog.bark();//this==dog
	dog2.bark();  //this==dog2
	//使用对象引用 访问 类方法
	dog.bark1();
	dog2.bark1();
	}
	
}


