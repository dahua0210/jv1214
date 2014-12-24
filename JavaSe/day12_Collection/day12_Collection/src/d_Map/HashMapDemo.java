package d_Map;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Person;


public class HashMapDemo {

	
	public static void main(String[] args) {
		//Person--City
		HashMap<Person,String> hm = new HashMap() ;
		hm.put(new Person(100,"IBM"), "USA");
		hm.put(new Person(15,"Alibaba"), "漳州");
		hm.put(new Person(100,"Google"), "USA");
		hm.put(new Person(10,"Baidu"), "beijing");
		hm.put(new Person(10,"同里"), "苏州");//?
		hm.put(new Person(10,"索马里"),"非洲");
		
		//遍历:
		//Set<Map.Entry<Person, String>> entryEntries= hm.entrySet();
		//Iterator<Map.Entry<Person, String>> iterator= entryEntries.iterator();
		//while (iterator.hasNext()) {
			//Map.Entry<bean.Person, java.lang.String> entry = (Map.Entry<bean.Person, java.lang.String>) iterator
				//	.next();
	//Person keyPerson = entry.getKey();
		//	String valueString =entry.getValue();
			//System.out.println("key:"+keyPerson+"valueString"+valueString);
		Iterator<Person> it =hm.keySet().iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			System.out.println("\t年龄:"+person.getAge()+"\tname"+person.getName()+"\taddress:"+hm.get(person));
			}
	 	}
	}


