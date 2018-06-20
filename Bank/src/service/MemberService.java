package service;
import domain.MemberBean;
public interface MemberService  {
	public void createJoin(MemberBean mem);
	public void createAdd(MemberBean mem);
	public void addList(MemberBean mem);
	public MemberBean[] list();
	public String showResult();
	public MemberBean readId(MemberBean mem);
	public MemberBean[] readName(String name);
	public String updatePass(MemberBean mem);
	public String deleteMember(MemberBean mem);
	
	
}
