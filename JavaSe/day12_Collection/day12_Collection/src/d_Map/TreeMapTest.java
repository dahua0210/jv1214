package d_Map;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import bean.ComparatorByLength;

import bean.Person;
/*
 * HashMap��TreeMap��ʲô����HashMapͨ��hashcode�������ݽ��п��ٲ��ң�
 * ��TreeMap�����е�Ԫ�ض�������ĳ�̶ֹ���˳���������Ҫ�õ�һ�������
 * ������Ӧ��ʹ��TreeMap��HashMap��Ԫ�ص�����˳���ǲ��̶��ģ���
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Person,String> tm = new TreeMap(new ComparatorByLength());
		tm.put(new Person(12,"����"),"pasatta");
		tm.put(new Person(13,"BMW"),"535" );
		tm.put(new Person(70,"Mecerdece-Benz"),"s600" );
		tm.put(new Person(130,"Ford"),"����F-150");
		
		Set<Person> key=tm.keySet();
		Iterator<Person> it=key.iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			//System.out.println(person);
			//System.out.println(tm.get(person));
			System.out.println("����:"+person.getAge()+"����:"+person.getName()+"�ͺ�:"
			+tm.get(person));
			
		}

	}

}
