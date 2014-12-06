public class Area{
	public static void main(String[] args){
		Geometry h;
		h = new Sanjiao(2.12545132454545,5.454564654654);
		Tiji t = new Tiji(h,50);
		System.out.println("三角形低为2.12545132454545的面积"+h.getArea());
		System.out.println("高为50三棱体的体积为"+t.getVolume());
		t.changeHeight(1);
		System.out.println("高为50三棱体的体积为"+t.getVolume());
	}
}