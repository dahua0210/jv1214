//�����������:ʵ�ָ������еĳ��󷽷�


public class Circle extends Shape{
	private double radius;
	public Circle(String color,double radius){
		//this.color = color;
		super(color);   //������Ĺ��캯��
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	//���������;
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	public String getType(){
		return getColor() +"Բ��";
	}
}