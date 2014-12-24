package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 演示对已有文件的数据续写
 */
public class FileWriterDemo3 {

	
	public static void main(String[] args) throws IOException {
		//传递一个已有文件,达标不覆盖已有文件,并在已有文件后续写
		FileWriter fw = new FileWriter("demo.txt");
		
		
		//要保证文件已经存在,如果不存在,如果不存在会发生异常FileNotFoundException
		
		
		//调用read()方法
		//read()一次读一个字符,而且往下读
		//int ch= fr.read();
		//System.out.println("ch"+ch);
		fw.write("abcdedsfsadfasdfasdfasdf中文");
		
		fw.close();
		
		
		/*FileReader fr = new FileReader("demo.txt");
		//循环输出
		while((ch=fr.read())!=-1){
			
			System.out.println("ch");
		}
		
		/*while(true){
			int ch =fr.read();
			if(ch==-1)
				break;
			System.out.println("ch"+(char)ch);
		}*/
		
	}

}
