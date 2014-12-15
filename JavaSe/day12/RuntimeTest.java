public class RuntimeTest{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();//程序不能创建自己的Runtime实例,但可以通过getRuntime()湖区预支相关连的Runtime对象
		System.out.println("处理器数量:"+rt.availableProcessors());
		System.out.println("空闲内存数:"+rt.freeMemory());
		System.out.println("总内存数:"+rt.totalMemory());
		System.out.println("可用最大内存数:"+rt.maxMemory());
	}
}