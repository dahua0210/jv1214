class Dog{
	String name;
	public String prin(String n){
		System.out.println(n);
		return n;
	}
	public void str(int a){
	 if(a==0){
	 System.out.println("���");
	 }else if(a==1){
	 return;
	 }
	  System.out.println("�Һܺ�");
	}//���ط����ƶ����͵�ֵ(���֮����ȷ����)
	//����������ִ��(����һ��return���)
}//
public class A6_9{
	public static void main(String[] args){
		Dog A=new Dog();
		///String name =  A.prin("С��");
		//System.out.println(name);
		A.str(1);
		
	}
	
}