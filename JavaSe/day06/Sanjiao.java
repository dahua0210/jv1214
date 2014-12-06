public class Sanjiao implements Geometry{
	double a,h;
	Sanjiao(double a,double h){
	this.a = a;
	this.h = h;
	}
	public double getArea(){
	return a*h*1/2;
	}
}