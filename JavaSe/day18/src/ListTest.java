import java.util.Iterator;
import java.util.TreeSet;


public class ListTest {

	public static void main(String[] args) {
		TreeSet tsSet  = new TreeSet();
		Student s1= new Student("���»�",58);
		Student s2= new Student("������",99);
		Student s3= new Student("��Ѹ",88);
		Student s4= new Student("����",60);
		Student s5= new Student("л����",59);
		Student s6= new Student("�Ű�֥",59);
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
