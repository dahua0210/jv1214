//抽象类的子类:实现父类所有的抽象方法


public class Circle extends Shape{
	private double radius;
	public Circle(String color,double radius){
		//this.color = color;
		super(color);   //抽象类的构造函数
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	//子类的义务;
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	public String getType(){
		return getColor() +"圆形";
	}
}