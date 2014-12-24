package io;
/*
 * IO异常的处理方式
 * 
 */
import java.io.*;
public class FileWriteDemo2 {

	
	public static void main(String[] args){
		FileWriter fw =null;
		try {
				fw = new FileWriter("d:\\demo.txt");
		
				fw.write("hdsfakjhkkjfds");
		
				
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		finally{
			try {
				if(fw!=null)
				fw.close();
			} catch (IOException e2) {
				System.out.println(e2.toString());
			}	
		}
	}
}
