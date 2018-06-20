package service;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;
public interface MemberService  {
	public void createJoin(UserBean mem);
	public void createAdd(StaffBean mem);
	public void addList(MemberBean mem);
	public MemberBean[] list();
	public String showResult();
	public MemberBean readId(MemberBean mem);
	public MemberBean[] readName(String name);
	public String updatePass(MemberBean mem);
	public String deleteMember(MemberBean mem);
	
	
}
