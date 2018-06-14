package domain;
public class OwnerSalary extends StaffSalary {
	public static final String DEPT = "이사";
	protected int share; //지분은 (sal+bonus)*10
	public OwnerSalary(String name,int sal) {
		super(name,sal*10);
		super.dept = name.substring(0,1)+DEPT;
		toString();
	}
}
