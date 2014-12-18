
public class Student implements Comparable{
	private String name;
	private int    score;
	public Student(){
		
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		Student student = (Student)o;
		int res = -(this.score - student.score);
		if(res == 0){
			return this.name.compareTo(student.name);
		}else{
			return res;
		}
		
	}
	public String toString(){
		return "name:"+name+"score:"+score+"\n" ;	
	}
		
	
	
	
}
