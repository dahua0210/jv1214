public class Test{
	public static void main(String[] args){
		SalariedEmployee e1 = new SalariedEmployee("邓紫棋",3,50000);
		HourlyEmployee e2 = new HourlyEmployee("王焕",12,8,200);
		SalesEmployee e3 = new SalesEmployee("刘德华",12,50000,0.10);
		BasePlusSalesEmployee e4 = new BasePlusSalesEmployee("罗永浩",12,70000,0.10,1500);
		Employee e = new Employee("李四",4);
		e1.info();
		e2.info();
		e3.info();
		e4.info();
	}
}