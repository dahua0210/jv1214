public class PrimitiveTransferTest{
	public static void swap(int a,int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.print("在swap方法里面a的值是:"+a+"变量b的值是"+b);
	
	}
	public static void main(String[] args){
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.print("交换之后a的值是:"+a+"变量b的值是"+b);
	
	
	}


}