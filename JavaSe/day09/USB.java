//1,与类文件类似,接口文件中只能有一个public接口,并且接口名==
//2.不饿能直接实例化
//3.多重实现
//4.接口继承实现
//文件名

//接口--->实现类--->对象

public interface USB{
	//组成
	int test = 1;
	double version = 3.0;//默认的修饰:public static final
	void read();         //默认修饰:public abstract
	void write();        //默认修饰:public abstract
}