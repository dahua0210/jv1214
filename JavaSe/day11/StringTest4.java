/*1.创建字符串对象
 String s;
 s= new String("we are student");
 String s = new String("we are student");
 --char a[] = {'b','o','y'};
   String s = new String(a);>>>>用一个字符串数组a创建一个字符串数组
 --String(char a[],starIndex,int count) >>>>图区字符串数组a中的一部分字符串创建一个字符串对象,参数StarIndex
 和count分别指定a中提取的字符的起始位置和该位置开始截取的字符串个数.
 -->>public int length()String类中的length()方法可以获取一个字符串的长度如
 String s = "we are student",tom = "我们是学生";
 int n1,n2
 n1= s.length();n2= tom.length();
 ----public boolean equals (String)
 >>>字符串对象调用String类中的equals方法,比较当前字符和窜对象的尸体是否与参数指定的字符串相等
 ----public boolean contains(String s)>>判断当前的字符串对象是否含有参数指定的字符串s,如:
 tom.contains(("stu"); 
 ---public boolean starts With(String s)和public boolean endsWith(String s)>>字符串调用判断
当前字符串对象的前缀是否是参数指定的字符串s
----public int indexOf(String s)>>>从字符串的头开始检索字符串s,并返回首次出现s的位置.如果没有
检索到s的位值,该方法返回的值是-1.
字符串调用lastIndexOf(String s)从当前字符串的头开始检索字符串s并返回出现s的位置*/

public class StringTest4{
	public static void main(String[] args){
		String s1,s2;
		s1 = new String("we are students");
		s2 = new String("we are students");
		System.out.println(s1.equals(s2)+"");
	}

}
 