//����ʵ���� == ʵ�ֽӿ�

public class Mobile implements USB,Wifi{
	private int num;
	private String brand;
	//���캯��
	public Mobile(){

	}
	public Mobile(int num,String brand){
		this.num= num;
		this.brand = brand;
	}
	// get() set()
	public void info(){
		System.out.println("Ʒ��:"+brand);
		System.out.println("����:"+num);
	
	}
	public void call(){
	System.out.println("��绰");	
	}
	public void sms(){
	System.out.println("������");	
	
	
	}
	//ʵ���������;ʵ�ָ��ӿ�[����]�ĳ��󷽷�
	public void read(){
		System.out.println("read Usb");
	
	}
	public void write(){
		System.out.println("write Usb");
	
	}
	public void open(){
		System.out.println("open WIFI");
	
	}
	public void close(){
		System.out.println("CLose WIFI");
	
	}

}