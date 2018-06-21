package service;
import java.util.*;
import domain.*;
public interface MemberService  {
	public void createUser(UserBean user);
	public void createStaff(StaffBean staff);
	public Map<String,MemberBean> map(); //generic? List에 타입을주라...
	public List<MemberBean> findByName(String name);
	public MemberBean findById(MemberBean member);
	public void updatePassword(MemberBean member);
	public void deleteMember(MemberBean member);
	
}
