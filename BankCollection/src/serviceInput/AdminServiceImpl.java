package serviceInput;
import java.text.SimpleDateFormat;
import java.util.*;
import domain.*;
import service.*;
public class AdminServiceImpl implements AdminService{
	private static AdminService instance = new AdminServiceImpl();
		public static AdminService getInstance() {
		return instance;
	}
	private AdminServiceImpl() {		
		}		
	
	List<MemberBean> mlist;
	List<AccountBean> alist;
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

	public String createRandom(int start, int end) {
		return String.format("%03d", (int)(Math.random()*(end-start))+start);
	}
	
	public String createDate() {
		return new SimpleDateFormat("yyyy년MM월dd일").format(new Date());
	}
	@Override
	public String createAccountNo() {
		String accNum = "";
		for(int i=0;i<3;i++) {
		 	accNum += (i!=2)? createRandom(0,1000)+"-" : createRandom(0,1000);
		}
		return accNum;
	}

	@Override
	public List<MemberBean> memberList() {
		return mlist;
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return alist;
	}



	
	

}
