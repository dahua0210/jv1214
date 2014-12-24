package c_Set;

import java.util.HashSet;

class A{
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class B{
	@Override
	public int hashCode() {
		return	1;
	}
}


class C{
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
}



/*
 * �����д���equals������ҲӦ�ø�дhashcode������
 * 
 */
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		/*
		 * ��дequals����������true������£�����hashCode��һ����
		 * ��ˣ�hashSet��Ȼ������������
		 */
		System.out.println(hs.add(new A()));
		System.out.println("" + hs.add(new A()) + hs.size());
		
		/* 
		 * �������hashcode��ͬ�����ǣ�equals��������false��
		 * ��ˣ�hashset���������ͬ��Ԫ��
		 */
		System.out.println(hs.add(new B()));
		System.out.println("" + hs.add(new B()) + hs.size());
		
		/*
		 * ��equals����true��hashcode������ͬ��ֵ��
		 * hashset������Ϊ��ͬһԪ�ء�
		 */
		System.out.println(hs.add(new C()));
		System.out.println("" + hs.add(new C()) + hs.size());
		

		
		System.out.println(hs.add(null));
		//System.out.println(hs.add(null));		
		
	}

}
