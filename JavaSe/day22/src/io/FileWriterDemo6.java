package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 第二中方式:通过字符数组进行读取
 */
public class FileWriterDemo6 {

	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		char[] ch=new char[4];
		//read(char[])方法返回的是读出的字符个数
		int num =0;
		num=fr.read(ch);
		/*System.out.println("num:"+num+"..."+new String(ch));
		int num1=fr.read(ch);
		System.out.println("num:"+num1+"..."+new String(ch));
		int num2=fr.read(ch);
		System.out.println("num:"+num2+"..."+new String(ch));
		int num3=fr.read(ch);
		System.out.println("num:"+num3+"..."+new String(ch));*/
		
		while((num=fr.read(ch))!=-1){
			System.out.println(new String(ch,0,num));//new String(ch,index,num)
		}
		fr.close();
	}

}
