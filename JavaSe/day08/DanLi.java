/*
���ģʽ:��Դ�����������Ч�Ľ������
Java23�����ģʽ
�������ģʽ:���һ����ֻ���ڴ���ֻ����һ������

�����һ�������ڴ���ֻ����һ������
1.��ֹ����Ӧ�ó���,ͨ����������������
2.��Ȼ�ⲿ����ͨ�����ഴ��������,����Ҫ�ö���,�Ϳ����ڱ������洴���������
3.Ϊ������Ӧ�ó����ܹ����ʵ��������洴���Ķ���;
������Ҫ�����ṩһ�ַ��ʷ�ʽ
����ô������ֳ���
1:˽�л�����
2.�ڱ����д�������
3.������ṩ���ʵķ���
*/
class Person{
		String name;
		private Person(){}
		static Person p = new Person();
		public static Person getInstance()	{
			return p;
		}
		

}
public class DanLi{

public static void main(String[] args){
	Person a = Person.getInstance();
	a.name= "С��";
	Person b= Person.getInstance();
	System.out.println(b.name);
	}

}




