//������=======����̳�===ʵ��������
//�ӿ�=========ʵ����====ʵ��������
//2-3���󷽷�
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
			//�����ڲ��� == ����ľֲ��ڲ���
			
			USB udisk = new USB(){
				int a;
				//final static String b =123;
				public void read(){
					System.out.println("��ȡu��");
				}
				public void write(){
				System.out.println("дu��");
			}
		};
		Wifi wifi = new Wifi(){
				public void close(){
					System.out.println("�ر�wifi");
				}
				public void open(){
				System.out.println("����wifi");
			}
		};
		udisk.read();
		udisk.write();
		wifi.close();
		wifi.open();
	}
}