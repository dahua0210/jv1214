public class ThisTest{
	String name;
	public ThisTest(String name){
		this.name = name;
	
	}
	//成员变量
	ThisTest get(){
		return this;
	
	}
	public static void main (String[] args){
		ThisTest s1 = new ThisTest("geminno");
		ThisTest s2 = new ThisTest("gemptc");
		System.out.println(s1);
		System.out.println(s1.get().name);
		System.out.println(s2);
		System.out.println(s2.get().name);
	}


}