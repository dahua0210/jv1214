public class Test{
	public static void main(String[] args){
		Tank t = new Tank(001,"10ถึ");
		Flighter f = new Flighter(002,"f-35");
		Warship w = new Warship(003,"200ถึ");
		t.info();
		t.attack();
		t.move();
		f.info();
		f.attack();
		f.move();
		w.info();
		w.attack();
		w.move();
		Army a=new Army(3);
		a.addWeapon(t);
		a.addWeapon(f);
		a.addWeapon(w);
		a.attackAll();
		a.moveAll();
	}
}