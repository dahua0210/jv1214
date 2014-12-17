

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
		//return "��д��object��toString����";
	}
	//ͬһ����� ����? 
	public boolean equals(Object obj){
		//�Ƿ�ָ��ͬһ����?
		
		if(this == obj){
			return true;
		}
		//�Ƿ���ͬһ�����?
		boolean res = obj instanceof Person;//����objָ��Object�Ķ����Ƿ���Person���ʵ��
		if(res){//ͬ��
			Person p = (Person)obj;
			if(this.name == p.name && this.age ==p.age){//����?
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
		//ֱ�Ӵ�ӡ����ʱ,��Ĭ�ϵ���toString����
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