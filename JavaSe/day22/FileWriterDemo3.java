package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��ʾ�������ļ���������д
 */
public class FileWriterDemo3 {

	
	public static void main(String[] args) throws IOException {
		//����һ�������ļ�,��겻���������ļ�,���������ļ�����д
		FileWriter fw = new FileWriter("demo.txt");
		
		
		//Ҫ��֤�ļ��Ѿ�����,���������,��������ڻᷢ���쳣FileNotFoundException
		
		
		//����read()����
		//read()һ�ζ�һ���ַ�,�������¶�
		//int ch= fr.read();
		//System.out.println("ch"+ch);
		fw.write("abcdedsfsadfasdfasdfasdf����");
		
		fw.close();
		
		
		/*FileReader fr = new FileReader("demo.txt");
		//ѭ�����
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
