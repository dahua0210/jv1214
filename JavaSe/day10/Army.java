public class Army{
	
	int maxNum;//���������
	int index = 0;//����һ���±�
	Weapon[] w; //����һ��w������
	public Army(int maxNum ){
		this.maxNum = maxNum;
		w =new Weapon[maxNum];
		
	}
	public void addWeapon(Weapon wa){
		if(index<w.length){
			w[index] = wa;
			System.out.println("���������һ������");
			index ++;
		}
		else{
			System.out.println("����������");
		} 
	}
	public void attackAll(){
	
	System.out.println("������������");
	
	}
	public void moveAll(){

	System.out.println("���������ƶ�");
	}

}