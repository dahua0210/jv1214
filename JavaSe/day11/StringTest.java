/*1.�����ַ�������
 String s;
 s= new String("we are student");
 String s = new String("we are student");
 --char a[] = {'b','o','y'};
   String s = new String(a);>>>>��һ���ַ�������a����һ���ַ�������
 --String(char a[],starIndex,int count) >>>>ͼ���ַ�������a�е�һ�����ַ�������һ���ַ�������,����StarIndex
 ��count�ֱ�ָ��a����ȡ���ַ�����ʼλ�ú͸�λ�ÿ�ʼ��ȡ���ַ�������.
 -->>public int length()String���е�length()�������Ի�ȡһ���ַ����ĳ�����
 String s = "we are student",tom = "������ѧ��";
 int n1,n2
 n1= s.length();n2= tom.length();
 ----public boolean equals (String)
 >>>�ַ����������String���е�equals����,�Ƚϵ�ǰ�ַ��ʹܶ����ʬ���Ƿ������ָ�����ַ������
 ----public boolean contains(String s)>>�жϵ�ǰ���ַ��������Ƿ��в���ָ�����ַ���s,��:
 tom.contains(("stu"); 
 ---public boolean starts With(String s)��public boolean endsWith(String s)>>�ַ��������ж�
��ǰ�ַ��������ǰ׺�Ƿ��ǲ���ָ�����ַ���s
----public int indexOf(String s)>>>���ַ�����ͷ��ʼ�����ַ���s,�������״γ���s��λ��.���û��
������s��λֵ,�÷������ص�ֵ��-1.
�ַ�������lastIndexOf(String s)�ӵ�ǰ�ַ�����ͷ��ʼ�����ַ���s�����س���s��λ��*/

public class StringTest{
	public static void main(String[] args){
		String s = new String("we are students");
		System.out.println("s.chatAt:"+s.charAt(5) );
		
		
		/*String s2 = new String("abcdfegdf");
		String s3 = new String("abcdfegdfsadasdsad");
		System.out.println("s2.compareTo(s3)"+s2.compareTo(s3));*/
	}

}