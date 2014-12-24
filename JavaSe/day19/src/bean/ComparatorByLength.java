package bean;

import java.security.PublicKey;
import java.util.Comparator;


/*
 * 按String的长度,排序
 * 
 */
public class ComparatorByLength implements Comparator{

	
	public int compare(Object o1, Object o2) {
		String string1 = (String)o1;
		String string2 = (String)o2;
		int res = string1.length() - string2.length();
		
		
		return res;
	}

}
