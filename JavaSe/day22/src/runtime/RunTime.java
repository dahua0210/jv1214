package runtime;
/*
 * Runtime对象盖内并没有提供对象
 * 说明不可以new对象,那么会直接想到该内种的方法都是静态的
 * 说明该类中海油非静态方法
 * 说明该方法提供方法获取蓓蕾对象,该方法是静态的,并返回值类型是本类类型
 * 使用了单例设计模型
 * 该方是是static Runtime getRuntime(){
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
