public class Sub extends Base{
	String  str = "sub class";
	void sub_show(){
		System.out.println("sub�����еķ���");
	
	}
	void show(){
		System.out.println("���ิд�˸���ķ���sub class");
	}
	
	public static void main(String[] args){
		//����ת��:Ĭ��;�������� ָ��   �������  
		//= !��������������[]=��������,�����า�ǵķ���
		//
		/*Base base = new Sub();
		*System.out.println(base.a);
		*base.show();
		*base.base_show();
		*
		*/
		
		//base.sub_show();
		//base.show();
		//һ�������Ӧ�ò����Է������൱�е������ӵĳ�Ա
	
		Base b = new Sub();
		Sub sub = (Sub)b ;
		System.out.println(sub.a);
		sub.def_show();
		
		
		//����ת��,��Ҫǿ������ת��
		//���ʸ��������
		/*System.out.println(sub.a);
		sub.base_show();
		�������������
		System.out.println(sub.str);
		sub.show();
		sub.sub_show();*/
		Sub s = new Sub();
		System.out.println(s.def_str);
		System.out.println(s.pro_str);
		System.out.println(s.pub_str);
		//s.pri_show();���಻�ܷ��ʸ���private���Ͷ���ķ���
		s.pro_show();
		s.def_show();
		s.pro_show();
		s.pub_show();
		
	}
	
	
}