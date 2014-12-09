public class Computer{
	private Output out;
	public Computer(Output out){
	
	this.out = out;
	
	}
	public void keyIn(String msg){
	out.getDate(msg);
}
	public void print(){
		out.out();
	
	}
}
public class OutputFactory{
	public Output getOutput(){
		return new Printer();
	
	}
	public static void main(String[] args){
	OutputFactory of = new OutputFactory();
	Computer c = new Computer(of.getOutput());
	c.keyIn("轻量级java ee 企业应用实战");
	c.keyIn("疯狂java讲义");
	c.print();
	}

}