package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 1��d�̴���һ���ļ�,���ڴ洢c���ļ��е�����.
 * 2�����ȡ����c���ļ�����
 * 3ͨ�����ϵĶ�д������ݴ洢
 * 4�ر���Դ
 */
public class CopyText {

	public static void main(String[] args) {
		
		copy_1();
		
	}
	//��c���ж�һ���ַ�,�ʹ�d��дһ���ַ�
	public static void copy_1(){
		//����Ŀ�ĵ�
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
			throw new RuntimeException("��дʧ��");
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
