package d_Map;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import bean.ComparatorByLength;

import bean.Person;
/*
 * HashMap和TreeMap有什么区别。HashMap通过hashcode对其内容进行快速查找，
 * 而TreeMap中所有的元素都保持着某种固定的顺序，如果你需要得到一个有序的
 * 结果你就应该使用TreeMap（HashMap中元素的排列顺序是不固定的）。
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Person,String> tm = new TreeMap(new ComparatorByLength());
		tm.put(new Person(12,"大众"),"pasatta");
		tm.put(new Person(13,"BMW"),"535" );
		tm.put(new Person(70,"Mecerdece-Benz"),"s600" );
		tm.put(new Person(130,"Ford"),"猛禽F-150");
		
		Set<Person> key=tm.keySet();
		Iterator<Person> it=key.iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			//System.out.println(person);
			//System.out.println(tm.get(person));
			System.out.println("年龄:"+person.getAge()+"名字:"+person.getName()+"型号:"
			+tm.get(person));
			
		}

	}

}
