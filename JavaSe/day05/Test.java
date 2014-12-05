public class Test{
	public static void main (String[] args){
		Manager man = new Manager();
		//构造函数不能被继承
		Manager man = new Manager(001);
		man.id = 111;
		man.name = "黄国华";
		man.salary = 88888.8;
		man.car = "Tesla";
		man.info();
		man.driver();
		


	}
}