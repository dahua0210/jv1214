import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("������java ee��ҵ����ʵս");
		books.add("���java����");
		books.add("���Android����");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while (it.hasNext()) {
			// it.next()�������ص�����������object����
			// ��Ҫǿ������ת��
			String book = (String) it.next();
			if (book.equals("���java����")) {

				it.remove();

			}
			book = "�����ַ���";
		}
		System.out.println(books);
	}
}
