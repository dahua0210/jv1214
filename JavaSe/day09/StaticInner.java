class Outer{
	//��Ա����
	static int a=123;
	static String str="�ⲿ�����";
	
	//��̬�ڲ���
	//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա(��̬�����;�̬����);
	static class Inner{
	
		String str="gem";
		static String static_str="�ڲ��ྲ̬����";
		
		void  run(){
			System.out.println("�ڲ���Ǿ�̬����");
			System.out.println(a);
			System.out.println(str);			
		}
		static void static_run(){
			System.out.println("�ڲ��ྲ̬����");
		}
	}
	void run(){
		//���ڲ������������෽��
		System.out.println(Inner.static_str);
		Inner.static_run();
		//���ڲ����ʵ��������ʵ������
		Inner in= new Inner();
		System.out.println(in.str);
		in.run();
	}
}
public class StaticInner{
	public static void main(String[] args){
		System.out.println(Outer.Inner.static_str);
		Outer.Inner.static_run();
		Outer.Inner in=new Outer.Inner();//��̬�ڲ���Ķ������ֱ������,����Ҫͨ�������ⲿ�����������
		System.out.println(in.str);
		in.run();
		in.static_run();
		Outer o = new Outer();
		o.run();
	}
}

