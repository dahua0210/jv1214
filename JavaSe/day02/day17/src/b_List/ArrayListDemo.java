package b_List;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i <5; i++) {
			al.add("it-"+i);//自动装箱 基本数据类型 封装成对象
		}
		Iterator iterator= al.iterator();
		for (Iterator iterator2 = al.iterator(); iterator2.hasNext();) {
			Object object = (Object) iterator2.next();
			System.out.println(object);
		}
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		
	}

}
