public class Test9{
	public static void main (String[] args){
		MiWifi mi = new MiWifi();
		USB_WIFI mi = new MiWifi();//����ת��
		
	//	MiWifi mi2 = (MiWifi)mi; //����ת�� 
		System.out.println((MiWifi)mi).brand);
		
		
		mi.open();
		mi.close();
		mi.read();
		miwrite();
		mi.usb2wifi();
	}
}