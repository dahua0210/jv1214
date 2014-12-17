package b_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import java.util.*;

public class CollectionDemo {
	
	public static void main(String[] args) {
		Collection coll = new ArrayList() ;//接口不能实例化对象
		Collection co = new ArrayList();
		
		
		
		//1.增操作
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		
		//BAT:  TABLE:
		co.add("Alibaba");
		co.add("Baidu");
		co.add("Tencent");
		
		//System.out.println("国内"+co);
		//System.out.println("国外"+coll);
		
		co.addAll(coll);
		
		System.out.println("国内"+co);
		System.out.println("国外"+coll);
		
		//2.删除
		//System.out.println(coll.remove("Xiaomi"));
		//System.out.println(coll.remove("Apple"));
		coll.add("Xiaomi");
		System.out.println("国外"+coll);
		
		//删除交集===共有的元素
		coll.removeAll(co);
		
		System.out.println("国外"+coll);
		coll.clear();
		//取交集
		coll.retainAll(co);
		System.out.println(coll);
		
		//3判断操作;
		//System.out.println("coll.isEmpty="+coll.isEmpty());
		//System.out.println("co.isEmpty="+co.isEmpty());
		
		//System.out.println("是否包含谷歌"+co.contains("Google"));
		
		
		//子集判断:
		System.out.println(coll.containsAll(co));
		coll.add("Geminno");
		System.out.println(co.containsAll(coll));
	
	
		
		
//		System.out.println("" +it.next()+co.size());
//		System.out.println("" +co+co.size());
//		it.remove();
//		System.out.println("" +co+co.size());
		
		
		Iterator it =co.iterator();
		//遍历操作:
		while (it.hasNext()) {
			Object object = (Object) it.next();
			/*
			 * co.remove("Baidu");
			 * co.add("geminno");
			 */
			System.out.println(object);
		}
		
		System.out.println("================");
		
		for(Object object: coll){
			//coll.add("tes");
			//coll.remove("Xiaomi");
			System.out.println("coll"+ object);

		}
		System.out.println("================");
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
