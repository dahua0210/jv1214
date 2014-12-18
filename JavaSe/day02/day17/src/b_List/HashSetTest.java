package b_List;
import java.util.HashSet;
import java.util.Iterator;


import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
class A{
	public boolean equals(Object obj){
		return true;	
	}
	
}
class B{
	public int hashCode(){
		return 1;
		
	}
	
}
class C{
	public boolean equals(Object obj){
		return true;
	}	
	public int hashCode(){
		return 2;
		
	}
}

/*
 * 如果复写equals方法,也应该复写hashcode方法.
 * 
 */

public class HashSetTest{

	
	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		/*
		 * 复写equals方法,返回true的情况下,由于hashCode不一样,
		 * 因此:hashset依然当做两个对象
		 * 
		 */
		
		
		System.out.println(hs.add(new A()));
		System.out.println(""+hs.add(new A())+hs.size());
		
		/*
		 * 
		 * 两个对象hashcode相同,但是,equals方法返回false:
		 * 因此:hashset添加2个不同的元素
		 * 
		 */
		System.out.println(hs.add(new B()));
		System.out.println(""+hs.add(new B())+hs.size());
		
		/*
		 * 
		 * 当equals返回true,hashcode返回相同的值;
		 * hashset集合把两个认为是同一个元素.
		 * 
		 */
		
		
		System.out.println(hs.add(new C()));
		System.out.println(""+hs.add(new C())+hs.size());
		
		hs.add(null);
		
	}

	
	

}
