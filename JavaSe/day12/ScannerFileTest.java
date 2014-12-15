import java.util.*;//导入scanner的包
import java.io.File;//导入File的包
public class ScannerFileTest{
	public static void main(String[] args) 
		throws Exception
	{	
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		while(sc.hasNextLine()){
			System.out.println("键盘输入的内容是"+sc.nextLine());
		}
	}
}