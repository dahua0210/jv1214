package b_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import java.util.*;

public class CollectionDemo {
	
	public static void main(String[] args) {
		Collection coll = new ArrayList() ;//�ӿڲ���ʵ��������
		Collection co = new ArrayList();
		
		
		
		//1.������
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		
		//BAT:  TABLE:
		co.add("Alibaba");
		co.add("Baidu");
		co.add("Tencent");
		
		//System.out.println("����"+co);
		//System.out.println("����"+coll);
		
		co.addAll(coll);
		
		System.out.println("����"+co);
		System.out.println("����"+coll);
		
		//2.ɾ��
		//System.out.println(coll.remove("Xiaomi"));
		//System.out.println(coll.remove("Apple"));
		coll.add("Xiaomi");
		System.out.println("����"+coll);
		
		//ɾ������===���е�Ԫ��
		coll.removeAll(co);
		
		System.out.println("����"+coll);
		coll.clear();
		//ȡ����
		coll.retainAll(co);
		System.out.println(coll);
		
		//3�жϲ���;
		//System.out.println("coll.isEmpty="+coll.isEmpty());
		//System.out.println("co.isEmpty="+co.isEmpty());
		
		//System.out.println("�Ƿ�����ȸ�"+co.contains("Google"));
		
		
		//�Ӽ��ж�:
		System.out.println(coll.containsAll(co));
		coll.add("Geminno");
		System.out.println(co.containsAll(coll));
	
	
		
		
//		System.out.println("" +it.next()+co.size());
//		System.out.println("" +co+co.size());
//		it.remove();
//		System.out.println("" +co+co.size());
		
		
		Iterator it =co.iterator();
		//��������:
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
