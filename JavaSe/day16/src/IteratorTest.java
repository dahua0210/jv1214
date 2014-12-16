import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("轻量级java ee企业引用实战");
		books.add("疯狂java讲义");
		books.add("疯狂Android讲义");
		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext()) {
			// it.next()方法返回的数据类型是object类型
			// 需要强制类型转换
			String book = (String) it.next();
			if (book.equals("疯狂java讲义")) {

				it.remove();

			}
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
