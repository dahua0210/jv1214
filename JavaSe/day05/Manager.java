public class Manager extends Employee{
	//��������

	String car;
	String office;
	//���๹�췽��:�������[����Ĺ��췽��]
	//
	public Manager(){//�����޲ι��췽�� + û����ʾ���ø��๹�캯��  =�Զ����ø����޲ι���
	
		System.out.println("�����޲ι��캯��");
	
	}
	
	//���з���
	public void driver(){
		
		System.out.println("name:" +name+"��"+this.car+"�ϰ�");
	
	}
	//super:���������
	public void info(){
		System.out.println("�����info()");
		//System.out.println("id:"+id+"\nname:"+name+"\nsalary:"+salary);
		super.info();
		System.out.println("car:"+car+"\noffice:"+office);
	}

}