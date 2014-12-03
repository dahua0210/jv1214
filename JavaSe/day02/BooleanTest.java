public class BooleanTest{
		public static void main(String args[]){
			boolean flag = true;
			if (!flag){
					System.out.println("真");
			}else{
			
					System.out.println("假");
			
			}
			//使用boolern和字符串进行连接运算,boolern会自动转换成字符串
			//""空字符和串 + 
			String str = true + "我爱你";
			System.out.println("str=" + str);
			
		}

}