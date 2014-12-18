package b_List;
import java.util.*;
import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * List存储各种数据,元素可以重复,有序[可以使用索引访问元素]
		 *相对Collection:特有方法:带index的方法
		 */
		
		
		List list = new ArrayList<>();
		
		//1.增加操作
		list.add("Android-001");
		list.add("Androd-002");
		list.add("Androd-003");
		list.add("Androd-004");
		list.add("Androd-005");
		list.add("Androd-006");
		list.add(3,"Google");
		
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		/*try {
			System.out.println(list.remove(10));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		//2.删除操作
		System.out.println("==============");
		list.remove(3);
		list.remove("Androd-004");
		System.out.println(list);
		System.out.println("==============");
		//3.修改操作
		System.out.println(list.set(0,"GDG"));
		for(int i= 0;i<list.size();i++)
		{		System.out.println(list);
		}
		//4.遍历
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			//list.add("test");
			System.out.println(object);
		}
		//Listiterator:
		/*ListIterator iit =  list.listIterator();
		/*while (it.hasNext()) {
			Object object = (Object) iit.next();
			iit.add("Alibaba");
			System.out.println(object);
		}*/
		/* while (iit.hasPrevious()) {
			
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
