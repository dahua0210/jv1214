//��ô�Լ�����һ����

public class Person{     //
	//��Ա����:ϵͳ��Ĭ�ϳ�ʼ��,ȡ��������
	String name;
	int age;

	//��Ա����
	//������:������ĳ�Ա����,��ʼ����Ա����,��ôҲ����[����]
	//1.�޲ι��캯��
	
	Person(){		
		System.out.println("�����Զ����޲ι�����");
	}
	//2.һ�ι��캯��
	Person(String name){
		System.out.println("����һ�ι��캯��");
		this.name = name;	
	}
	//3.���ι��캯��
	Person(String name,int age){
			System.out.println("���Ƕ��λṹ����");
			this.name= name;
			this.age = age;			
	}
	void setName(String name){
		this.name = name;
	
	}
	//void���������β�
	String getName(){
		return this.name;
	}
	
	void info(){
		System.out.println("Name:"+this.name+"\tAge:"+this.age);
	
	}

}