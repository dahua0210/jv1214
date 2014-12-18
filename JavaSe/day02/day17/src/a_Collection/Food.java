package a_Collection;

public class Food {
	private String num;
	private String name;
	private float  price;
	Food(String num,String name,float price){
		this.num= num;
		this.name = name;
		this.price = price;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
