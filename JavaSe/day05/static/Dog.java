
//����Ĺ�
//ĳ��Ʒ�еĹ�                            

public class Dog{
	//����
	static String type; //�����   �������ڶ���[����.�����]//Ʒ��
	
	int age;           //ʵ������;�����ڶ��� [��������.ʵ������]
	String color;
	//��̬�����
	static{//ʹ��:��ʼ�� �����
		
		type = "xxxx";
		System.out.println("������static������");
		//age = "12";  //!ʵ������
		//color = "red";
	
	}
	
	
	
	//����
	Dog(){
	
	}
	Dog(int age,String color){
		this.type = "��ʿ��";
		this.age = age;
		this.color = color;	
	}
	//ʵ������:this��������������
	void bark(){
	this.type = "̩��";
	System.out.println("barking...."+age+"����");
	}
	//�෽��:���ܷ���[ʵ������]===?�������ڶ���,
	static void bark1(){//û�ж���,���Բ��ܷ���ʵ������,ʵ������
		//ֻ�ܷ��������,�Լ����ľֲ�����
		type = "����";
	}
}