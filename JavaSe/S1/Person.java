/*�ڲ����ṩ���õķ�װ,���԰��ڲ���Ӱ�����ⲿ��֮��,������ͬһ��������������ʸ���
�ڲ����Ա����ֱ�ӷ����ⲿ���˽������,��Ϊ�ڲ��౻�����ⲿ���Ա
ͬһ����ĳ�Ա֮������໥����,���ⲿ�಻���ܹ������ڲ����ʵ��ϸ��,����
�ڲ����Զ����
�����ڲ����ʺ����ڴ�����Щ����Ҫһ�η��ʵ���

*/
public class Person{
	private double weight;
	public Person(){
	
	}
	public Person(double weight){
		this.weight = weight;
		
	}
	private class PersonLeg{
	
		private double length;
		private String color;
		public PersonLeg(double length,double color){
			this.length = length;
			this.color = color;
		}
		public void setLength(){
			this.length = length;
		
		}
		public double getLength(){
			return length;
		
		}
		void info(){
			System.out.println("��ǰ�˴�����ɫ:"+color+"���:"+length);
			System.out.println("��������:"+weigth);
		}

	
	} 

}