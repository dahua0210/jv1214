//�ӿ�:������ǵĹ�����չ��,��Ϊ������������������֮��������(��ϵ���̶ܳ�)

class Person{
		String name;
		int age;

}
interface Smoker{
	public abstract void smoket();

}
class Student extends Person{



}
class Worker extends Person implements Smoker{
	public void smoket(){
	System.out.println("����");
	}
}
public class A6_63{
	public static void main(String[] args){
	Worker w= new Worker();
	
	w.smoket();
	}
}