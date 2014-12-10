/*内部类提供更好的封装,可以吧内部类影藏在外部类之内,不允许同一个包中其他类访问该类
内部类成员可以直接访问外部类的私有数据,因为内部类被当成外部类成员
同一个类的成员之间可以相互访问,但外部类不恩能够访问内部类的实现细节,例如
内部类陈远变量
匿名内部类适合用于创建那些仅需要一次访问的类

*/
public class Person{
	private double weight;
	public Person(){
	
	}
	public Person(double weight){
		this.weight = weight;
		
	}
	private class PersonLeg{
	
		private double length;
		private String color;
		public PersonLeg(double length,double color){
			this.length = length;
			this.color = color;
		}
		public void setLength(){
			this.length = length;
		
		}
		public double getLength(){
			return length;
		
		}
		void info(){
			System.out.println("当前人穿着颜色:"+color+"身高:"+length);
			System.out.println("本人体重:"+weigth);
		}

	
	} 

}