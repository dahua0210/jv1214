import java.util.TreeSet;

import java.util.*;
class Student{
	private String name;
	private int    age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new Mycompare());
		ts.add(new Student("µË×ÏÆå01",22));
		ts.add(new Student("µË×ÏÆå02",56));
		ts.add(new Student("µË×ÏÆå03",25));
		ts.add(new Student("µË×ÏÆå03",22));
		ts.add(new Student("µË×ÏÆå05",21));
		
		Iterator it =  ts.iterator();
		while(it.hasNext()){
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());	
		}

	}

}
class Mycompare implements Comparator{

	
	public int compare(Object o1, Object o2) {
		Student s1= (Student)o1;
		Student s2=(Student)o2;
		int res = s1.getName().compareTo(s2.getName());
		if(res==0){
			return s1.getAge() - s2.getAge();
		}
		return res;
	}
	
	
	
}






