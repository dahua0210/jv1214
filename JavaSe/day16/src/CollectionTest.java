import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;




public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c =new ArrayList();
		c.add(6);//��Ȼ���ϲ��ܷ��������͵�ֵ,��java֧���Զ�װ��
		//���Ԫ��
		c.add("�����");
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:"+c.size());
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c�����Ƿ����|�����|�ַ���:"+c.contains("�����"));//����true
		c.add("������java ee��ҵӦ��ʵ��");
		Collection books = new HashSet<>();
		books.add("������java ee��ҵӦ��ʵս");
		books.add("���java����");
		System.out.println("c�����Ƿ���ȫ����books����?"+c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ��"+c);
		c.clear();
		System.out.println("c���ϵ�Ԫ��"+c);
		System.out.println("c���ϵ�Ԫ��"+books);
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ��"+books);

	}

}
