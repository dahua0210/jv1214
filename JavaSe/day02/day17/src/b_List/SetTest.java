package b_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {


	public static void main(String[] args) {
		
		//set:����,Ԫ�ز����ظ�
		Set set = new HashSet();
		set.add("abc");
		set.add("cba");
		set.add("bac");
		set.add("a");//��������
		set.add("b");
		Iterator it =set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		System.out.println("++++++++++++++++");
		
		System.out.println(set.add("cba"));
		System.out.println(set);
		
	}

}
