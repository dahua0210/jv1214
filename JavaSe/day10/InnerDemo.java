class Outer{
	//��Ա����
	int a= 123;
	private String str = "�ⲿ��ı���";
	
	//��̬��Ա�ڲ���:
	class  Inner{
		//final static int a = 123;
		String str = "�ڲ���ı���"; 
		void run(){
			String str = "�ֲ�����";//�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա,����˽�г�Ա
			System.out.println("�ڲ���run()");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);
			//�����ⲿ��Ա�����ķ���.
		}
	}
	//��Ա����
	void run (){
		System.out.println("�ⲿ��run()");
		Inner in = new Inner();//�ⲿ��Ҫ�����ڲ����еĳ�Ա����Ҫ�����ڲ���Ķ���.
		in.run();
		}
	static void static_run(){
		System.out.println("�ⲿ��static_run()");
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
}
	
	
	
public class InnerDemo{
	public static void main (String[] args){
	//�ⲿ���ʹ��
		Outer outer = new Outer();
		outer.run();
		outer.static_run();
		
		//3.��Ա�ڲ���
	//Outer out = new Outer();
	//Outer.Inner in = out.new.Inner();
	//in.run();//��������
	Outer.Inner i = new Outer().new Inner();
	//Outer.Inner inner = (new Outer()).new Inner();
	i.run();
	}
}