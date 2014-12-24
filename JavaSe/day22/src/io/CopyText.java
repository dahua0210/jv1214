package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 1在d盘创建一个文件,用于存储c盘文件中的数据.
 * 2定义读取流和c盘文件关联
 * 3通过不断的读写完成数据存储
 * 4关闭资源
 */
public class CopyText {

	public static void main(String[] args) {
		
		copy_1();
		
	}
	//从c盘中读一个字符,就从d盘写一个字符
	public static void copy_1(){
		//创建目的地
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw=new FileWriter("demo.txt");
			fr=new FileReader("FileWriterDemo3.java");
			char[] ch= new char[1024];
			int len=0;
			while((len=fr.read(ch) )!= -1){
				fw.write(ch,0,len);
				
			}
		} catch (IOException e) {
			throw new RuntimeException("读写失败");
		}
		finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					
				}
				if(fr!=null){
					try {
						fr.close();
					} catch (Exception e) {
						
					}
				}
			}
			
		}
		
	}
}
