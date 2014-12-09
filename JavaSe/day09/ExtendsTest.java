interface interfaceA{
	int a = 5;
	void testA();
}
interface interfaceB{
	int b = 6;
	void testB();
}
interface interfaceC extends interfaceA, interfaceB{
	int c= 7;
	void testC();

}
public class ExtendsTest{
	public static void main(String[] args){
		System.out.println(interfaceC.a);
		System.out.println(interfaceC.b);
		System.out.println(interfaceC.c);
	}

}