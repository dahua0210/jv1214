import java.util.Iterator;
import java.util.TreeSet;


public class ListTest {

	public static void main(String[] args) {
		TreeSet tsSet  = new TreeSet();
		Student s1= new Student("刘德华",58);
		Student s2= new Student("李亚鹏",99);
		Student s3= new Student("周迅",88);
		Student s4= new Student("王菲",60);
		Student s5= new Student("谢霆锋",59);
		Student s6= new Student("张柏芝",59);
		tsSet.add(s1);
		tsSet.add(s2);
		tsSet.add(s3);
		tsSet.add(s4);
		tsSet.add(s5);
		tsSet.add(s6);
		for (Iterator iterator = tsSet.iterator(); iterator.hasNext();) {
			Student object = (Student) iterator.next();
			System.out.println(object);
		}
		
	}

}
