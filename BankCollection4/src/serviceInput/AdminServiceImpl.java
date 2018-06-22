package serviceInput;
import java.util.*;
import domain.*;
import service.*;
public class AdminServiceImpl implements AdminService{
	List<MemberBean> mlist;
	List<AccountBean> alist;
	public AdminServiceImpl() {
		mlist = new ArrayList<>();
		alist = new ArrayList<>();
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		mlist.add(staff);
		
	}

	@Override
	public List<MemberBean> findMemberByName(String name) {
		List<MemberBean> temp = new ArrayList<>();
		
		return temp;
	}
	@Override
	public MemberBean findMemberById(MemberBean member) {
		MemberBean dap = new MemberBean();
	
		return dap;
	}
	@Override
	public List<AccountBean> findAccountById(AccountBean acc) {
		 List<AccountBean> temp = new ArrayList<>();
		 for(int i=0;i<alist.size();i++) {
			 if(acc.equals(alist.get(i).getName())) {
				 temp.add(alist.get(i));
			 }
		 }
		return temp;
	}
	@Override
	public String createRandom() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String createAccountNo() {
		// TODO Auto-generated method stub
		return null;
	}



	
	

}
