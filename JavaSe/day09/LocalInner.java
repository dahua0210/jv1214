class Outer{
	int a =123;
	private String str= "geminno";
	void run(){
		String local_var= "�ֲ�����";
		final int num = 1111;
		
		
		//�ֲ��ڲ���!!!���÷�Χֻ���ڲ�����������
		//public class Inner{  error
		//static class Inner{  error
		class Inner{
			String str = "inner class";
			int aaa = 888;
			//static String var = "static var";//���ܶ��徲̬����
			static final String s= "java";
			void local_run(){
				System.out.println("�ڲ���:��Ա����"+num);//���ܷ��ʾֲ�����local_var
				System.out.println(a+"\t"+str);
				System.out.println(Outer.this.str);
			}
		}
		Inner in=new Inner();
		in.local_run();
	}
}
public class LocalInner{
	public static void main(String[] args){
		Outer out = new Outer();
		out.run();
		
		
		
	}

}