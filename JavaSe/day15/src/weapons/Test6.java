package weapons;
public class Test6 {
	public static void main(String[] args) {
		Army a = new Army(4);
		Tank t = new Tank();
		Flighter f = new Flighter();
		Warship warship = new Warship();
		a.addWeapon(t);
		a.addWeapon(f);
		a.addWeapon(warship);
		a.addWeapon(t);
		a.attackAll();
		a.moveAll();
	}
}
