package domain;


public class Salary {
	public static final String DEPT = "인턴쉽";
	protected String dept,name;
	int sal,total,sum;
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public void setTotal() {
		total= sal;
	}
	public void setSum() {
		sum += total;
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	
	public int getTotal() {
		return total;
	}
	public int getSum() {
		return sum;
	}
	public String toString() {
		return String.format("| %s | %s | %d | %d |", dept,name,sal,total);
	}

}
