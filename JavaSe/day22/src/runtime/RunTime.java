package runtime;
/*
 * Runtime������ڲ�û���ṩ����
 * ˵��������new����,��ô��ֱ���뵽�����ֵķ������Ǿ�̬��
 * ˵�������к��ͷǾ�̬����
 * ˵���÷����ṩ������ȡ���ٶ���,�÷����Ǿ�̬��,������ֵ�����Ǳ�������
 * ʹ���˵������ģ��
 * �÷�����static Runtime getRuntime(){
 * }
 */
public class RunTime {

	public static void main(String[] args)throws Exception {
	
		Runtime r =Runtime.getRuntime();
		Process p= r.exec("notepad");
		Thread.sleep(3000);
		p.destroy();
	}

}
