package b_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList ll= new LinkedList<>();
		LinkedList l= new LinkedList<>();
		//将指定元素插入此列表的开头;
		ll.addFirst("小妹妹");
		ll.addFirst("大哥哥");
		ll.addFirst("大表哥");
		ll.addFirst("小表妹");
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		
		}
		//将指定元素添加到此列表的结尾
		l.addLast("刘德华");
		l.addLast("张学友");
		l.addLast("邓紫棋");
		l.addLast("周迅");
		l.addLast("刘德华");
		l.addLast("Anglebaby");
		
		
		Iterator iterator= ll.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(l);
		}
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//2.删除列表中指定位置的元素
		ll.remove(0);
		System.out.println(ll);
		//3.至此列表是否包含指定元素,返回true,false;
		System.out.println(ll.contains("小妹妹"));
		System.out.println(ll.peek());
		
		//4.返回类表中首次出现的指定元素的索引,如果此列表中不包含该元素,则返回-1
		System.out.println(ll.indexOf("小妹妹"));
		System.out.println(l.lastIndexOf("刘德华"));
		
		//5.返回此LinkedList的浅副本
		System.out.println(ll.clone());
		
		//6.将此列表中指定位置的元素替换为指定元素
		l.set(1,"草泥马");
		System.out.println(l);
		

		
		
	}

}
