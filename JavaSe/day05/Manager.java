//������Լ̳и���ı����Լ�����
//this �� super ����ͬʱʹ�ã���Ϊ�������ڵ�һ�У�


public class Manager extends Employee{
	//��������

	String car;
	String office;
	//���๹�췽��:�������[����Ĺ��췽��]
	////�����޲ι��췽�� + û����ʾ���ø��๹�캯��  =�Զ����ø����޲ι���
	public Manager(){
		super();
		System.out.println("�����޲ι��캯��");
	}
	public Manager (int id){
		super(id);
		//this.id  = id;
		System.out.println("����1�ι��캯��");
	
	}
	public Manager(int id,String name){
		this(id);
		this.name = name;
		System.out.println("����2�ι��캯��");
	
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