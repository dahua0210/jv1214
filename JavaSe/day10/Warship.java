//Warship ս��
public class Warship extends Weapon{
	private int num;
	private String paishui;
	public Warship (int num,String paishui){
		this.num = num;
		this.paishui = paishui;
	}
	public void info(){
		System.out.println("��ˮ:"+paishui);
		System.out.println("���:"+num);
	
	}
	public void atttack(){
	System.out.println("Warship����");
	
	}
	public void move(){
	System.out.println("Warship�ƶ�");
	
	}

}
