package bean;

import java.util.Comparator;

public class ComparatorByLength implements Comparator {

		

		  public int compare(Object  o1, Object o2) {
			Person str1=(Person) o1;
			Person str2=(Person) o2;
			int res=-(str1.length()-str2.length());
			return res;
			//return res==0?str1.getName()-str2.getName90:res;
		}
		  
	}


