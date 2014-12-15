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
		//继承的向上转型 VS 接口,实现类的向上转型类似
		USB key  = new USB_KEY();
		key.read();
		key.write();
	}
}