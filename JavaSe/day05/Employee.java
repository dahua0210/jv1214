//������Լ̳и���ı����Լ�����
//this �� super ����ͬʱʹ�ã���Ϊ�������ڵ�һ�У�

public class Employee{
	int id;
	String name;
	double salary;
	
	//���๹�췽��:�������[���๹�췽��]
	//���캯��:���ܱ��̳�
	public Employee(){
		System.out.println("�����޲ι��캯��");
	}
	public String getName(){
		return name;
	}
	public Double getSalary(){
		return salary;
	}
	public void info(){
		System.out.println("�����info()");
		System.out.println("id:"+id+"\nname:"+name+"salary:"+salary);
	
	}
}