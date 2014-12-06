public class Tiji{
	Geometry bottom;
	double height;
	Tiji(Geometry bottom,double height){
		this.bottom = bottom;
		this.height = height;
	}
	void changeBottom(Geometry bottom){
		this.bottom = bottom;
	
	}
	void changeHeight(double height){
		this.height = height;
	}
	public double getVolume(){
		return bottom.getArea()*height;
	}
}