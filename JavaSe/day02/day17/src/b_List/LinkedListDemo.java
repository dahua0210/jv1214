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
		//��ָ��Ԫ�ز�����б�Ŀ�ͷ;
		ll.addFirst("С����");
		ll.addFirst("����");
		ll.addFirst("����");
		ll.addFirst("С����");
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		
		}
		//��ָ��Ԫ����ӵ����б�Ľ�β
		l.addLast("���»�");
		l.addLast("��ѧ��");
		l.addLast("������");
		l.addLast("��Ѹ");
		l.addLast("���»�");
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
		
		//2.ɾ���б���ָ��λ�õ�Ԫ��
		ll.remove(0);
		System.out.println(ll);
		//3.�����б��Ƿ����ָ��Ԫ��,����true,false;
		System.out.println(ll.contains("С����"));
		System.out.println(ll.peek());
		
		//4.����������״γ��ֵ�ָ��Ԫ�ص�����,������б��в�������Ԫ��,�򷵻�-1
		System.out.println(ll.indexOf("С����"));
		System.out.println(l.lastIndexOf("���»�"));
		
		//5.���ش�LinkedList��ǳ����
		System.out.println(ll.clone());
		
		//6.�����б���ָ��λ�õ�Ԫ���滻Ϊָ��Ԫ��
		l.set(1,"������");
		System.out.println(l);
		

		
		
	}

}
