public class StringTest{
	
	public static void main(String[] args){
		//StringTest a=new StringTest();
		String str="abcafdef";
		String str1="cafde";
		String str2="ABCAFDEF";
		//1.获取
		
		
		//1.1获取字符串的长度 :int length();
		System.out.println(str.length());
		
		//1.2根据位置获取位置上某个字符
		//char charAt(int index)
		System.out.println(str.charAt(3));
		
		//1.3根据字符获取该字符在字符串中第一次出现的位置
		//int indexOf(int ch) 括号内也可以换成 一个字符串。
		System.out.println(str.indexOf(102));
		//指定位置开始，获取ch在字符中出现的位置
		//int indexOf(int ch,int fromIndex)包含fromIndex。
		System.out.println(str.indexOf(102,5));
		
		//2.判断
		//2.1字符串中是否包含某个字符 boolean contains(str);
		System.out.println(str.contains(str1));
		
		//2.2 字符串中是否有内容 boolean isEmpty();
		System.out.println(str.isEmpty());
		
		//2.3字符串是否以指定内容开头boolean startsWith(str)
			//是否以指定内容结尾 boolean endsWith(str)
			System.out.println(str.startsWith("abd"));
			System.out.println(str.endsWith("def"));
		//2.4判断字符串的内容是否相同 boolean equals(str);
		//2.5判断内容是否相同并忽略大小写boolean equalsIgnoreCase();
	}
} 