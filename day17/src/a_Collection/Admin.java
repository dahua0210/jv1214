package a_Collection;

import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

public class Admin {
	private ArrayList aa  =null;
	public Admin() {
		aa = new ArrayList();
	}
	public  void addFood(Food f) {
		aa.add(f);
		System.out.println("�����ʳƷ�ɹ�!");
	}
	public void foodList  (String nu) {
		int i;
		for(i =0;i<aa.size();i++){
			Food food = (Food)aa.get(i);
			if(food.getNum().equals(nu)){
				System.out.println("�ñ�ŵ���ϢΪ: ");
				System.out.println("ʳƷ���:"+nu);
				System.out.println("ʳƷ����"+food.getName());
				System.out.println("ʳƷ�۸�"+food.getPrice());
				break;	
			}
		}
		if(i== aa.size()){
			System.out.println("�Բ���,û���ҵ���ʳƷ");
		}
	}
	public void foodPrice(String nu,float price){
		int i;
		for(i=0;i<aa.size();i++){
			Food  food = (Food)aa.get(i);
			if (food.getNum().equals(nu)) {
				food.setPrice(price);
				System.out.println("�޸ļ۸�ɹ�");
				break;
			}
		}
		if(0==aa.size()){
			System.out.println("�Բ���û���ҵ���ӦʳƷ");
			
		}
	
	}
	public void Delete(String num){
		int i;
		if(aa.size()==0){
			System.out.println("�Բ���û���κ���Ʒ");
		}
		for(i = 0;i<aa.size();i++){
			Food food = (Food)aa.get(i);
			if(food.getNum().equals(num)){
				aa.remove(i);
				System.out.println("ɾ��ʳƷ�ɹ�");
				
			}
		}
	
		if((i ==aa.size()) && (aa.size() !=0)){
			System.out.println("�Բ���û�и�ʳƷ");
			}
	}

}
