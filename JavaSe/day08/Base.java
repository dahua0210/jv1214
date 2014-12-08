public class Base{
	public String a ="向下转型"; 
	private String pri_str= "私有属性";
			String def_str= "默认属性";
	protected	String pro_str= "protected变量";
	public String pub_str = "public变量";
	//
	private void pri_show(){
		System.out.println("私有方法");
	
	}
	 void def_show(){
		System.out.println("私有方法");
	
	}
	protected void pro_show(){
		System.out.println("protected方法");
	
	}
	public void pub_show(){
		System.out.println("public方法");
	
	}
}