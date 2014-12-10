//Warship Õ½½¢
public class Warship extends Weapon{
	private int num;
	private String paishui;
	public Warship (int num,String paishui){
		this.num = num;
		this.paishui = paishui;
	}
	public void info(){
		System.out.println("ÅÅË®:"+paishui);
		System.out.println("±àºÅ:"+num);
	
	}
	public void atttack(){
	System.out.println("Warship¹¥»÷");
	
	}
	public void move(){
	System.out.println("WarshipÒÆ¶¯");
	
	}

}
