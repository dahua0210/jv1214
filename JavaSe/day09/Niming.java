//抽象类=======子类继承===实例化对象
//接口=========实现类====实例化对象
//2-3抽象方法
abstract class USB{
	 public abstract void read();
	 public abstract void write();
}
interface Wifi{
	void close();
	void open();

}

public class Niming{
	public static void main(String[] args){
			//匿名内部类 == 特殊的局部内部类
			
			USB udisk = new USB(){
				int a;
				//final static String b =123;
				public void read(){
					System.out.println("读取u盘");
				}
				public void write(){
				System.out.println("写u盘");
			}
		};
		Wifi wifi = new Wifi(){
				public void close(){
					System.out.println("关闭wifi");
				}
				public void open(){
				System.out.println("开启wifi");
			}
		};
		udisk.read();
		udisk.write();
		wifi.close();
		wifi.open();
	}
}