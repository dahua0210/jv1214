//定义实现类 == 实现接口

public class Mobile implements USB,Wifi{
	private int num;
	private String brand;
	//构造函数
	public Mobile(){

	}
	public Mobile(int num,String brand){
		this.num= num;
		this.brand = brand;
	}
	// get() set()
	public void info(){
		System.out.println("品牌:"+brand);
		System.out.println("号码:"+num);
	
	}
	public void call(){
	System.out.println("打电话");	
	}
	public void sms(){
	System.out.println("发短信");	
	
	
	}
	//实现类的义务;实现父接口[所有]的抽象方法
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