public class Test9{
	public static void main (String[] args){
		MiWifi mi = new MiWifi();
		USB_WIFI mi = new MiWifi();//向上转型
		
	//	MiWifi mi2 = (MiWifi)mi; //向下转型 
		System.out.println((MiWifi)mi).brand);
		
		
		mi.open();
		mi.close();
		mi.read();
		miwrite();
		mi.usb2wifi();
	}
}