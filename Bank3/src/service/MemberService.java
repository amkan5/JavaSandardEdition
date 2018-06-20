package service;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;
public interface MemberService  {
	public void createUser(UserBean member);
	public void createStaff(StaffBean member);
	public MemberBean[] list();					//SelectAll
	public MemberBean[] search(String param);	//selectSome
	public MemberBean search(MemberBean member); //selectOne 혹은 findbyID 이름은 같아도 리턴값/파라미터로 판단 
	public void update(MemberBean member);
	public void delete(MemberBean member);
	
}
