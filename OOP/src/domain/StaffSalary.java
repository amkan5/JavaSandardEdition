package domain;
public class StaffSalary extends Payment{
	public static final String DEPT = "직원";
	protected int bonus;
	public StaffSalary(String name,int sal) {
		super(name,sal+(int)(sal*0.1));
		super.dept = name.substring(0,1)+DEPT;
		toString();
	}
}
