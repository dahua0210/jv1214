public class Account{
	private String user="geminno";
	private String password = "123456";
	
	public void setPwd(String str){
		this.password = str;
	
	}
	public void info(){
		System.out.println("user:"+this.user+"\tpassword"+this.password);
	
	}

}//private只能在当前的类访问