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
			System.out.println("����ʾѡ��һ����Ϣ");
			System.out.println("1.���ʳƷ");
			System.out.println("2.��ѯʳƷ��Ϣ");
			System.out.println("3.�޸�ʳƷ�۸�");
			System.out.println("4.ɾ��ʳƷ");
			System.out.println("0.�˳�ϵͳ");
			String str = sr.readLine();
			if(str.equals("1")){
				System.out.println("������ʳƷ�ı��");
				String num=sr.readLine();
				System.out.println("������ʳƷ������");
				String name = sr.readLine();
				System.out.println("������ʳƷ�ļ۸�");
				float price = Float.parseFloat(sr.readLine());
				Food food = new Food(num, name, price);
				ad.addFood(food);	
			}else if(str.equals("2")){
				System.out.println("������ʳƷ�ı��");
				String num=sr.readLine();
				ad.foodList(num);
			}else if(str.equals("3")){
				System.out.println("������Ҫ�޸�ʳƷ�ı��");
				String num=sr.readLine();
				System.out.println("������Ҫ�޸�ʳƷ�ļ۸�");
				float price = Float.parseFloat(sr.readLine());
				ad.foodPrice(num,price);	
			}else if(str.equals("4")){
				System.out.println("������Ҫɾ��ʳƷ�ı��");
				String num=sr.readLine();
				ad.Delete(num);
			
			}else if(str.equals("0")){
				System.out.println("��л��ʹ��");
				System.exit(0);
				
			}else{
				System.out.println("����������");
				
			}
		}
	}
}
