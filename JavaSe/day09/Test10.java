public class Test10{
	public static void main(String[] args){
		USB_KEY jianpan = new USB_KEY();
		
		Udisk    u = new Udisk();
		jianpan.read();
		jianpan.write();
		System.out.println(jianpan.brand);
		u.read();
		u.write();
		System.out.println(u.brand);
		//�̳е�����ת�� VS �ӿ�,ʵ���������ת������
		USB key  = new USB_KEY();
		key.read();
		key.write();
	}
}