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
		System.out.println("添加新食品成功!");
	}
	public void foodList  (String nu) {
		int i;
		for(i =0;i<aa.size();i++){
			Food food = (Food)aa.get(i);
			if(food.getNum().equals(nu)){
				System.out.println("该编号的信息为: ");
				System.out.println("食品编号:"+nu);
				System.out.println("食品名称"+food.getName());
				System.out.println("食品价格"+food.getPrice());
				break;	
			}
		}
		if(i== aa.size()){
			System.out.println("对不起,没有找到该食品");
		}
	}
	public void foodPrice(String nu,float price){
		int i;
		for(i=0;i<aa.size();i++){
			Food  food = (Food)aa.get(i);
			if (food.getNum().equals(nu)) {
				food.setPrice(price);
				System.out.println("修改价格成功");
				break;
			}
		}
		if(0==aa.size()){
			System.out.println("对不起没有找到相应食品");
			
		}
	
	}
	public void Delete(String num){
		int i;
		if(aa.size()==0){
			System.out.println("对不起没有任何商品");
		}
		for(i = 0;i<aa.size();i++){
			Food food = (Food)aa.get(i);
			if(food.getNum().equals(num)){
				aa.remove(i);
				System.out.println("删除食品成功");
				
			}
		}
	
		if((i ==aa.size()) && (aa.size() !=0)){
			System.out.println("对不起没有该食品");
			}
	}

}
