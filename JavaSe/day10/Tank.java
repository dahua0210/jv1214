public class Tank extends Weapon{
	private int num;
	private String dunwei;
	public Tank(int num,String dunwei){
		this.num = num;
		this.dunwei = dunwei;
	}
	public void info(){
		System.out.println("���:"+num);
		System.out.println("��λ:"+dunwei);
	
	}
	public void attack(){
		System.out.println("Tank����");
	}
	public void move(){
		System.out.println("Tank�ƶ�");
	}
}