import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;




public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(6);//虽然集合不能方基本类型的值,但java支持自动装箱
		//添加元素
		c.add("孙悟空");
		System.out.println("c集合的元素个数为:"+c.size());
		//判断是否包含指定字符串
		System.out.println("c集合是否包含|孙悟空|字符串:"+c.contains("孙悟空"));//返回true
		c.add("轻量级java ee企业应用实践");
		Collection books = new HashSet<>();
		books.add("轻量级java ee企业应用实战");
		books.add("疯狂java讲义");
		System.out.println("c集合是否完全包含books集合?"+c.containsAll(books));
		//用c集合减去books集合里的元素
		c.removeAll(books);
		System.out.println("c集合的元素"+c);
		c.clear();
		System.out.println("c集合的元素"+c);
		System.out.println("c集合的元素"+books);
		books.retainAll(c);
		System.out.println("books集合的元素"+books);

	}

}
