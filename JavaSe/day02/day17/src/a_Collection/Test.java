package a_Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.corba.se.spi.orbutil.fsm.InputImpl;

import sun.java2d.pipe.BufferedBufImgOps;

public class Test {

	
	public static void main(String[] args) throws IOException {
		Admin ad = new Admin();
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
		 
		
	 	while (true) {
			System.out.println("按提示选择一下信息");
			System.out.println("1.添加食品");
			System.out.println("2.查询食品信息");
			System.out.println("3.修改食品价格");
			System.out.println("4.删除食品");
			System.out.println("0.退出系统");
			String str = sr.readLine();
			if(str.equals("1")){
				System.out.println("请输入食品的编号");
				String num=sr.readLine();
				System.out.println("请输入食品的名称");
				String name = sr.readLine();
				System.out.println("请输入食品的价格");
				float price = Float.parseFloat(sr.readLine());
				Food food = new Food(num, name, price);
				ad.addFood(food);	
			}else if(str.equals("2")){
				System.out.println("请输入食品的编号");
				String num=sr.readLine();
				ad.foodList(num);
			}else if(str.equals("3")){
				System.out.println("请输入要修改食品的编号");
				String num=sr.readLine();
				System.out.println("请输入要修改食品的价格");
				float price = Float.parseFloat(sr.readLine());
				ad.foodPrice(num,price);	
			}else if(str.equals("4")){
				System.out.println("请输入要删除食品的编号");
				String num=sr.readLine();
				ad.Delete(num);
			
			}else if(str.equals("0")){
				System.out.println("感谢您使用");
				System.exit(0);
				
			}else{
				System.out.println("你输入有误");
				
			}
		}
	}
}
