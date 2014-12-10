public class Army{
	
	int maxNum;//武器最大量
	int index = 0;//定义一个下标
	Weapon[] w; //定义一个w的数组
	public Army(int maxNum ){
		this.maxNum = maxNum;
		w =new Weapon[maxNum];
		
	}
	public void addWeapon(Weapon wa){
		if(index<w.length){
			w[index] = wa;
			System.out.println("武器库添加一个武器");
			index ++;
		}
		else{
			System.out.println("武器库已满");
		} 
	}
	public void attackAll(){
	
	System.out.println("所有武器攻击");
	
	}
	public void moveAll(){

	System.out.println("所有武器移动");
	}

}