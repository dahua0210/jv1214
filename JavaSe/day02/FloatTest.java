public class FloatTest{
	public static void main(String args[]){
		float floatNum = 123;
		//浮点类型常量默认为:double类型;
		
		float floatNum1 = 3.14f;  //f或者F
		System.out.println("floatNum="+ floatNum1);
		float floatNum2 = 3.14e2f;
		
		float sum = (float)(floatNum + 321 + 3.14);
		System.out.println('a');
		System.out.println('a'+1);
		System.out.println('a'+(char)1);
		byte b = 3;
		b = (byte)(b + 4);
		byte b1 = 3,b2 = 4, b3;
		b3 = (byte)(b1 + b2);
		b3 = 3 + 4;
		int n = 123456789;
		float f = n;//
		System.out.println("float f ="+ f);
	}
}