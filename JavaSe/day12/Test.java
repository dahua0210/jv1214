

class Person {
	String name;
	int    age;
	
	public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "name:"+name+"\tage:"+age;
		//return "复写了object的toString方法";
	}
	//同一类对象 属性? 
	public boolean equals(Object obj){
		//是否指向同一对象?
		
		if(this == obj){
			return true;
		}
		//是否是同一类对象?
		boolean res = obj instanceof Person;//测试obj指向Object的对象是否是Person类的实例
		if(res){//同类
			Person p = (Person)obj;
			if(this.name == p.name && this.age ==p.age){//属性?
				return true;
			}else{
				return false;
			}
		}else{
				return false;
		}
	}
}
public class Test{
	public static void main(String[] args){
		Test test = new Test();
		//直接打印对象时,会默认调用toString方法
		Person p = new Person("geminno",12);
		Person p1 = new Person("google",13);
		Person p2 = p1;
		System.out.println(p.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(test);
		System.out.println(test.toString());
		System.out.println(p);
		System.out.println("equals():"+p.equals(p1)+ "\t"+(p ==p1));	
	}
}