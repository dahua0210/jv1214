class Address{
	String detail;
	public Address(String detail){
		this.detail = detail;
	}
}
class User implements Cloneable{
	int age;
	Address address;
	public User(int age){
		this.age = age;
		address = new Address("广州天河");
	}
	public User clone()
	throws CloneNotSupportedException
	{
	
		return (User)super.clone();
	}
}
public class CloneTest{
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		User u1= new User(23);
		//clone 得到u1的副本
		User u2 = u1.clone();
		System.out.println(u1 == u2);
		//判断u1,u2是否相同
		System.out.println(u1.address == u2.address);
		//判断u1,u2的address是否相同
	}

}