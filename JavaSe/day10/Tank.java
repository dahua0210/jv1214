public class Tank extends Weapon{
	private int num;
	private String dunwei;
	public Tank(int num,String dunwei){
		this.num = num;
		this.dunwei = dunwei;
	}
	public void info(){
		System.out.println("±àºÅ:"+num);
		System.out.println("¶ÖÎ»:"+dunwei);
	
	}
	public void attack(){
		System.out.println("Tank¹¥»÷");
	}
	public void move(){
		System.out.println("TankÒÆ¶¯");
	}
}