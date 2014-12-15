
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 固定月薪员工
		SalariedEmployee se = new SalariedEmployee("Google",22222.22,1);
		System.out.println("name"+se.getName()+"\tSalary"+se.getSalary(1));
		System.out.println("name"+se.getName()+"\tSalary"+se.getSalary(12));
		//小时工
		HourlyEmployee he = new HourlyEmployee("Baidu",2,100,170); 
		System.out.println("name"+he.getName()+"\tSalary"+he.getSalary(1));
		System.out.println("name"+he.getName()+"\tSalary"+he.getSalary(2));
		//无底薪销售
		SalesEmoployee ss = new SalesEmoployee("albaba",3,9000.0,0.2f);
		System.out.println("name"+ ss.getName() +"\tsalary"+ss.getSalary(3));
		System.out.println("name"+ ss.getName() +"\tsalary"+ss.getSalary(12));
		//有底薪销售
		BaseplusEmployee be = new BaseplusEmployee("Oracle",4,10000.0,0.2f,
				8888);
		System.out.println("name"+be.getName()+"\tSalary"+be.getSalary(2));
		System.out.println("name"+be.getName()+"\tSalary"+be.getSalary(4));
		
	}

}
