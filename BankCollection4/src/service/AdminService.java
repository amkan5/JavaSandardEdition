package service;

import java.util.*;

import domain.*;

public interface AdminService {
	public void createStaff(StaffBean staff);
	public List<String,MemberBean> memberList(); //generic? List에 타입을주라...
	public List<MemberBean> findMemberByName(String name);
	public MemberBean findMemberById(MemberBean member);
	public List<AccountBean> findAccountById(AccountBean acc);
	public List<String,AccountBean> accountList();
	public String createRandom();
	public String createDate();
	public String createAccountNo();
}
