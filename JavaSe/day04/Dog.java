public class Dog{
	void jump(){
	System.out.println("正在执行jump方法");
	}
	void run(){
	Dog d = new Dog();
	jump();
	System.out.println("正在执行run方法");
	}
}