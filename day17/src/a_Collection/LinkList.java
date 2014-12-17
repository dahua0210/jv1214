package a_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	
	public static void main(String[] args) {
	LinkedList cc = new LinkedList();
	
	Food food1 = new Food("4","¹âÃ÷ÏÊÅ£ÄÌ",5f);
	Food food2 = new Food("009","ºì³¦",7f);
	
	cc.addFirst(food1);
	cc.addFirst(food2);
	 
	cc.addLast(food1);
	cc.addLast(food2);
	Iterator it = cc.iterator();
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(((Food) object).getPrice());
	}
	for (Iterator iterator = cc.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(((Food) object).getName());
	}
	for(int i= 0;i<cc.size();i++){
		System.out.println(((Food)cc.getFirst()).getName());
		}
	}
}
