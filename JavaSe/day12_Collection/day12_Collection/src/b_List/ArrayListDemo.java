package b_List;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			al.add("it-" + i);	//�Զ�װ��   ������������  ��װ�� ����
		}
		
		//  ?����
		for(int i =0; i< al.size(); i++){
			
		}
		
		for (Iterator it = al.iterator(); it.hasNext();) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		for (Object object : al) {			
			System.out.println(object);
		}
		
		Iterator it = al.iterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		
		
	}

}
