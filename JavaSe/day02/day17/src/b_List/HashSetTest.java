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
 * �����дequals����,ҲӦ�ø�дhashcode����.
 * 
 */

public class HashSetTest{

	
	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		/*
		 * ��дequals����,����true�������,����hashCode��һ��,
		 * ���:hashset��Ȼ������������
		 * 
		 */
		
		
		System.out.println(hs.add(new A()));
		System.out.println(""+hs.add(new A())+hs.size());
		
		/*
		 * 
		 * ��������hashcode��ͬ,����,equals��������false:
		 * ���:hashset���2����ͬ��Ԫ��
		 * 
		 */
		System.out.println(hs.add(new B()));
		System.out.println(""+hs.add(new B())+hs.size());
		
		/*
		 * 
		 * ��equals����true,hashcode������ͬ��ֵ;
		 * hashset���ϰ�������Ϊ��ͬһ��Ԫ��.
		 * 
		 */
		
		
		System.out.println(hs.add(new C()));
		System.out.println(""+hs.add(new C())+hs.size());
		
		hs.add(null);
		
	}

	
	

}
