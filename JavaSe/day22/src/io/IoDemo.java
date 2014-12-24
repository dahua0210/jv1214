
/*
 * 字节流和字符流
 * 字节流两个基类
 * InputSteam   OutputSteam
 * 字符流的两个基类
 * Reader  Writer 
 * 既然IO流适用于操作数据的
 * 那么数据最常见体现是:文件
 * 那么先以操作文件为主来演示
 * 需求:在硬盘上,创建一个文件并写入一些文字数据
 * 专门用于操作文件的Writer子类对象,FileWriter.后缀名是父类名.前缀名是该流对象的功能
 */

package io;
import java.io.*;
public class IoDemo {



	
	public static void main(String[] args) throws IOException {
		//创建一个FileWriter对象,该对象一被初始化就必须要明确要操作的文件
		//而且该文件会被创建到指定目录下,如果该目录下已有同名文件,其实该步就是将数据放在目的地
		
		FileWriter fw= new FileWriter("demo.txt");
		
		//调用write方法,将字符串写入流中去.
		fw.write("abcde");
		
		//刷新流对象缓冲区中的数据
		fw.flush();
		
		//关闭流资源,但是关闭之前会刷新一次内部的缓冲中的数据
		//将数据刷到目的地汇总
		//和flush的区别,流可以继续使用,close刷新后,将流关闭
		fw.close(); 
		
	}
	

}
