import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test10{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("������java ee��ҵ����ʵս");
		books.add("ffff");
		books.add("�¸¸¸¸¸�");
		books.add("��ط�����ٸ�");
		books.add("̫̫̫̫̫̫̫");
		books.add("���java����");
		books.add("���Android����");
		books.add("���Android����");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		//  Ԫ��׃�� ,Ԫ����� ,��v����
		for(Object obj: books){
			// it.next()�������ص�����������object����
			// ��Ҫǿ������ת��
			String book = (String)obj;
			if (book.equals("���java����")) {

				books.remove(book);

			}
			book = "�����ַ���";
		}
		System.out.println(books);
	}
}
