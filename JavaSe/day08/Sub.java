public class Sub extends Base{
	String  str = "sub class";
	void sub_show(){
		System.out.println("sub类特有的方法");
	
	}
	void show(){
		System.out.println("子类复写了父类的方法sub class");
	}
	
	public static void main(String[] args){
		//向上转型:默认;基类引用 指向   子类对象  
		//= !子类新增的属性[]=基类特有,被子类覆盖的方法
		//
		/*Base base = new Sub();
		*System.out.println(base.a);
		*base.show();
		*base.base_show();
		*
		*/
		
		//base.sub_show();
		//base.show();
		//一个基类的应用不可以访问子类当中的新增加的成员
	
		Base b = new Sub();
		Sub sub = (Sub)b ;
		System.out.println(sub.a);
		sub.def_show();
		
		
		//向下转型,需要强制类型转化
		//访问父类的属性
		/*System.out.println(sub.a);
		sub.base_show();
		访问子类的属性
		System.out.println(sub.str);
		sub.show();
		sub.sub_show();*/
		Sub s = new Sub();
		System.out.println(s.def_str);
		System.out.println(s.pro_str);
		System.out.println(s.pub_str);
		//s.pri_show();子类不能访问父类private类型定义的方法
		s.pro_show();
		s.def_show();
		s.pro_show();
		s.pub_show();
		
	}
	
	
}