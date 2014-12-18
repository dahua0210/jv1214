package b_List;

import java.util.Iterator;
import java.util.TreeSet;

import com.sun.org.apache.bcel.internal.generic.NEW;

//让普通类具有可比性:实现comparable接口,复写compareable方法
//自定义比较规则 == 集合的排序规则


public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Person(12,"Google"));
		ts.add(new Person(1,"Gemonno"));
		ts.add(new Person(6,"Baidu"));
		ts.add(new Person(8,"Alibaba"));
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Person object = (Person) iterator.next();
			System.out.println(object);
			System.out.println(ts.first());
			System.out.println(ts.last());
		}
	}

}
