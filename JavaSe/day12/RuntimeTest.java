public class RuntimeTest{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();//�����ܴ����Լ���Runtimeʵ��,������ͨ��getRuntime()����Ԥ֧�������Runtime����
		System.out.println("����������:"+rt.availableProcessors());
		System.out.println("�����ڴ���:"+rt.freeMemory());
		System.out.println("���ڴ���:"+rt.totalMemory());
		System.out.println("��������ڴ���:"+rt.maxMemory());
	}
}