package b_List;
import java.util.HashSet;
import java.util.Iterator;




public class HashSetTest1 {
	/*
	 * 把自定义对象添加到hashset
	 * 
	 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person(12,"google"));
		hs.add(new Person(23,"Apple"));
		hs.add(new Person(12,"google"));
		System.out.println(""+hs+"size="+hs.size());
		Iterator it =hs.iterator();
		//遍历操作:
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}
}
