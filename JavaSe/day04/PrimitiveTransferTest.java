public class PrimitiveTransferTest{
	public static void swap(int a,int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.print("��swap��������a��ֵ��:"+a+"����b��ֵ��"+b);
	
	}
	public static void main(String[] args){
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.print("����֮��a��ֵ��:"+a+"����b��ֵ��"+b);
	
	
	}


}