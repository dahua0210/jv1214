//Flighter ս����
public class Flighter extends Weapon{
	private int num;
	private String brand;
	public Flighter (int num,String brand){
		this.num = num;
		this.brand = brand;
	}
	public void info(){
		System.out.println("���:"+num);
		System.out.println("Ʒ��:"+brand);
	}
	public void atttack(){
		System.out.println("Fligher����");
	
	}
	public void move(){
		System.out.println("Fligher�ƶ�");
	
	}

}
