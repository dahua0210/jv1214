//[��Ա����]��ʼ������?= = ���캯��
//?[�����]�ܲ����ٹ��캯���г�ʼ��?
public class DogTest{
	public static void main(String[] args){
	System.out.println("����main������");
	//�����:�������ڶ��������ڶ��������
	System.out.println("Dog.type=" + Dog.type);
	Dog.type = "����";
	System.out.println("Dog.type=" + Dog.type);
	//�෽��:
	Dog.bark1();
	
	
	
	//ʵ������
	Dog dog = new Dog(12,"Red");
	Dog dog2 = new Dog(15,"Block");
	//ʵ������:�����ڶ���
	/*static����= �����
	1.һ����ֻ��һ��,���������ʵ������
	2.������ļ��ض�����,�����ڶ������
	3.����û������������ʵ��ʱ�ͷ��ʵ�,��Ī������������
	ȫ�ֱ���
	4.����ֱ��ʹ������������:��.�ֶ�*/
	
	/*System.out.println("dog.type=" + dog.type);
	System.out.println("dog2.type=" +dog2.type);
	System.out.println("Dog.type=" + Dog.type);
//���������
	System.out.println("dog.age=" +dog.age);
	System.out.println("dog2.age=" +dog2.age);*/
	//Dog.age = 123;
	dog.bark();//this==dog
	dog2.bark();  //this==dog2
	//ʹ�ö������� ���� �෽��
	dog.bark1();
	dog2.bark1();
	}
	
}


