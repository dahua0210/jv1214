//����person��

public class PersonTest{    
	public static void main(String[] args){
			//ʵ����:����=����=ʵ��
			//�ڶ����۵�ʱ��û���Զ����޲κ���
			//����ϵͳ�Զ�ָ��������
			//�ڶ����ʱ��{��}�޲ι�����
			
			
			Person	geminno = new Person();
			Person	gem = new Person("�߲�");
			Person gemptc = new Person("�߲�����",12);
			
			
			//����ʹ��:����.��Ա���� ����.��Ա����
			geminno.info();
			gem.info();
			gemptc.info();
			gem.setName("xxx");
			gem.info();
			
			
	}
}