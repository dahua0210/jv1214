//������  [ֻ�ܱ��̳�]----->����  :ʵ�����г��󷽷�--->����

//��������                           ������
public abstract class Shape{
	//�������6���:
	{
		System.out.println("ִ��shape�ĳ�ʼ����...");
		
	}
	private String color;
	
	
	
	//�ܳ� ���󷽷�
	public abstract double calPerimeter();
	
	
	//��״ ���󷽷�
	public abstract String getType();
	public Shape(){}
	public Shape(String color){
	System.out.println("shape������");
		this.color= color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

}