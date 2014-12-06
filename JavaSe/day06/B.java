class B extends A{
	int z;
	B(int x,int y){
	super(x,y);
	System.out.println("我是一餐构造函数");

	z=300;
	}
	B(){
	super();
	z=800;
	}
	public void f(){
		System.out.println("x="+x+"y="+y+"z="+z);
	}

}