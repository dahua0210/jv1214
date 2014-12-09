//接口:提高我们的功能扩展性,因为他降低了事物与事物之间的耦合性(关系精密程度)

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
	System.out.println("抽烟");
	}
}
public class A6_63{
	public static void main(String[] args){
	Worker w= new Worker();
	
	w.smoket();
	}
}