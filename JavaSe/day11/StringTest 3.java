public class StringTest{
	
	public static void main(String[] args){
		//StringTest a=new StringTest();
		String str="abcafdef";
		String str1="cafde";
		String str2="ABCAFDEF";
		//1.��ȡ
		
		
		//1.1��ȡ�ַ����ĳ��� :int length();
		System.out.println(str.length());
		
		//1.2����λ�û�ȡλ����ĳ���ַ�
		//char charAt(int index)
		System.out.println(str.charAt(3));
		
		//1.3�����ַ���ȡ���ַ����ַ����е�һ�γ��ֵ�λ��
		//int indexOf(int ch) ������Ҳ���Ի��� һ���ַ�����
		System.out.println(str.indexOf(102));
		//ָ��λ�ÿ�ʼ����ȡch���ַ��г��ֵ�λ��
		//int indexOf(int ch,int fromIndex)����fromIndex��
		System.out.println(str.indexOf(102,5));
		
		//2.�ж�
		//2.1�ַ������Ƿ����ĳ���ַ� boolean contains(str);
		System.out.println(str.contains(str1));
		
		//2.2 �ַ������Ƿ������� boolean isEmpty();
		System.out.println(str.isEmpty());
		
		//2.3�ַ����Ƿ���ָ�����ݿ�ͷboolean startsWith(str)
			//�Ƿ���ָ�����ݽ�β boolean endsWith(str)
			System.out.println(str.startsWith("abd"));
			System.out.println(str.endsWith("def"));
		//2.4�ж��ַ����������Ƿ���ͬ boolean equals(str);
		//2.5�ж������Ƿ���ͬ�����Դ�Сдboolean equalsIgnoreCase();
	}
} 