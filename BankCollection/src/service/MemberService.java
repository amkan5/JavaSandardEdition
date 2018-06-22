package service;
import java.util.*;
import domain.*;
public interface MemberService  {
	public void createUser(UserBean member);
	public String login(MemberBean member);
	public void updatePassword(MemberBean member);
	public void deleteMember(MemberBean member);
	public MemberBean findById(MemberBean member);
}
