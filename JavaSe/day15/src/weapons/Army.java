package weapons;

import weapon.Weapon;

public class Army {
	Weapon[] w;
	int index = 0;
	public Army(int num) {
		super();
		// TODO Auto-generated constructor stub
		this.w =  new Weapon[num];
		
	}
	public void addWeapon(Weapon wa){
		w[index++] = wa;
	}
	public void attackAll() {
	//	for (int i = 0;i<w.length;i++) {
	//		w[i].attack();
	//	}
		//foreach±ãÀûÊý×é
		for(Weapon weapon : w){
			weapon.attack();
		}
		
	}
	public void moveAll() {
//		for (int i = 0;i<w.length;i++) {
//			w[i].move();
//		}
		//for each
		for(Weapon weapon : w)
			weapon.attack();
	}
}
