
/*
 * �ֽ������ַ���
 * �ֽ�����������
 * InputSteam   OutputSteam
 * �ַ�������������
 * Reader  Writer 
 * ��ȻIO�������ڲ������ݵ�
 * ��ô�������������:�ļ�
 * ��ô���Բ����ļ�Ϊ������ʾ
 * ����:��Ӳ����,����һ���ļ���д��һЩ��������
 * ר�����ڲ����ļ���Writer�������,FileWriter.��׺���Ǹ�����.ǰ׺���Ǹ�������Ĺ���
 */

package io;
import java.io.*;
public class IoDemo {



	
	public static void main(String[] args) throws IOException {
		//����һ��FileWriter����,�ö���һ����ʼ���ͱ���Ҫ��ȷҪ�������ļ�
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼��,�����Ŀ¼������ͬ���ļ�,��ʵ�ò����ǽ����ݷ���Ŀ�ĵ�
		
		FileWriter fw= new FileWriter("demo.txt");
		
		//����write����,���ַ���д������ȥ.
		fw.write("abcde");
		
		//ˢ�������󻺳����е�����
		fw.flush();
		
		//�ر�����Դ,���ǹر�֮ǰ��ˢ��һ���ڲ��Ļ����е�����
		//������ˢ��Ŀ�ĵػ���
		//��flush������,�����Լ���ʹ��,closeˢ�º�,�����ر�
		fw.close(); 
		
	}
	

}
