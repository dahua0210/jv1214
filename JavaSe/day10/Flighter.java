//Flighter Õ½¶·»ú
public class Flighter extends Weapon{
	private int num;
	private String brand;
	public Flighter (int num,String brand){
		this.num = num;
		this.brand = brand;
	}
	public void info(){
		System.out.println("±àºÅ:"+num);
		System.out.println("Æ·ÅÆ:"+brand);
	}
	public void atttack(){
		System.out.println("Fligher¹¥»÷");
	
	}
	public void move(){
		System.out.println("FligherÒÆ¶¯");
	
	}

}
