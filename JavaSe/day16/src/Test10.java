import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test10{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("轻量级java ee企业引用实战");
		books.add("ffff");
		books.add("嘎嘎嘎嘎嘎嘎");
		books.add("鬼地方个梵蒂冈");
		books.add("太太太太太太太");
		books.add("疯狂java讲义");
		books.add("疯狂Android讲义");
		books.add("疯狂Android讲义");
		// 获取books集合对应的迭代器
		//  元素變量 ,元素類型 ,遍歷對象
		for(Object obj: books){
			// it.next()方法返回的数据类型是object类型
			// 需要强制类型转换
			String book = (String)obj;
			if (book.equals("疯狂java讲义")) {

				books.remove(book);

			}
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
