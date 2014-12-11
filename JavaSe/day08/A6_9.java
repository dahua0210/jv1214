class Dog{
	String name;
	public String prin(String n){
		System.out.println(n);
		return n;
	}
	public void str(int a){
	 if(a==0){
	 System.out.println("你好");
	 }else if(a==1){
	 return;
	 }
	  System.out.println("我很好");
	}//返回方法制定类型的值(这个之总是确定的)
	//结束方法的执行(仅仅一个return语句)
}//
public class A6_9{
	public static void main(String[] args){
		Dog A=new Dog();
		///String name =  A.prin("小刚");
		//System.out.println(name);
		A.str(1);
		
	}
	
}