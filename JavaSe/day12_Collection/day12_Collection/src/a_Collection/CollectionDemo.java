package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		Collection co = new ArrayList();	
		
		
		// String------- Person	
		//1、增操作
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		coll.add("Xiaomi");
		
		//BAT:		TABLE:
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("Xiaomi");
		
		System.out.println("国内" + co);
		System.out.println("国外" + coll);
		
	
		co.addAll(coll);
		System.out.println("国内" + co);
		System.out.println("国外" + coll);
		
		//2、删除
//		System.out.println(coll.remove("Xiaomi"));
//		System.out.println(coll.remove("Apple"));		
//		System.out.println("国外" + coll);
		
		//删除交集====共有的元素
		//coll.removeAll(co);
		//coll.clear();
		//System.out.println("国外" + coll);
		
		
		//取交集
//		coll.retainAll(co);
//		System.out.println("国外" + coll);
		
		//3、判断操作
//		System.out.println("coll.isEmpty=" + coll.isEmpty());
//		System.out.println("co.isEmpty()=" + co.isEmpty());		
//		System.out.println("co.contains=Google=?" + co.contains("Google"));
		
		//子集判断：
		System.out.println(coll.containsAll(co));
		coll.add("Geminno");
		System.out.println("" + co.containsAll(coll) + co.size());
		
		
		Iterator it = co.iterator();
		//遍历操作：
		while (it.hasNext()) {
			Object object = (Object) it.next();
			//co.add("geminno");		//
			//co.remove("Baidu");
			System.out.println(object);
		}
		
		System.out.println("===================");
		for (Iterator it1 = coll.iterator(); it1.hasNext(); ) {
			Object object = (Object) it1.next();
			System.out.println(object);
		}
		System.out.println("===================");
		for (Object object : coll) {
			//coll.add("tes");
			coll.remove("Xiaomi");
			System.out.println("coll:" + object);
			
		}
//		System.out.println("" + it.next() + co.size());
//		System.out.println("" + it.next() + co.size());
//		it.remove();
//		System.out.println("" + co + co.size());
//		
		
		
		
		
	}

}
