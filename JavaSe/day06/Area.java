public class Area{
	public static void main(String[] args){
		Geometry h;
		h = new Sanjiao(2.12545132454545,5.454564654654);
		Tiji t = new Tiji(h,50);
		System.out.println("�����ε�Ϊ2.12545132454545�����"+h.getArea());
		System.out.println("��Ϊ50����������Ϊ"+t.getVolume());
		t.changeHeight(1);
		System.out.println("��Ϊ50����������Ϊ"+t.getVolume());
	}
}