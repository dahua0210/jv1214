package b_List;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.bcel.internal.generic.RETURN;



public class Person implements Comparable{

	

		private int age;
		private String name;
		
	

	public Person(){
		super();
		
	}



	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Object o) {
		Person person = (Person)o;
		
		//1.�ȱȽ�����Ƚ�,�ڱȽ�����
		//int res = this.age - person.age;
		//if(res == 0){
		//	return this.name.compareTo(person.name);
		//}else{
		//	return res;
			
		//}
		//2.�ȱȽ�����,�ڱȽ�����
		int resString = this.name.compareTo(person.name);
		//if(resString == 0){
		//	return this.age - person.age;	
		//}else{
		//	return resString;
		//}
	  return resString==0 ? this.age - person.age : resString ;//��ľ����
	
	}
	
	
	
	public String toString() {
		return "age=" + age + ", name=" + name + "\n";
	}
}
	
	
	


