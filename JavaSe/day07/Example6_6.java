public class Example6_6{
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("0123456789");
		str.setCharAt(0,'a');
		str.setCharAt(1,'b');
		System.out.println(str);
		str.insert(2,"xxx");
		System.out.println(str);
		str.delete(6,8);
		System.out.println(str);
		str.append("i love this game");
		System.out.println(str);

	}

}