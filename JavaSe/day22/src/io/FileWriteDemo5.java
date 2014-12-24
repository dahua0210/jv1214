package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWriteDemo5 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		//Ñ­»·Êä³ö
		int ch =0;
		while((ch=fr.read())!=-1){
			
			System.out.println("ch="+(char)ch);
		}
		fr.close();
		/*while(true){
			int ch =fr.read();
			if(ch==-1)
				break;
			System.out.println("ch"+(char)ch);
		}*/
	}

}
