package domain;

public class Payment {
	public static final String DEPT = "인턴";
	protected String dept,name;
	protected int sal;
	public Payment(String name, int sal) {
		this.name = name.substring(0,1)+DEPT;
		this.sal = sal;
		this.dept = DEPT;
		toString();
	}
	
	public String toString() {
		return String.format("%s %d만원 지급",name,sal);
	}
	
}
