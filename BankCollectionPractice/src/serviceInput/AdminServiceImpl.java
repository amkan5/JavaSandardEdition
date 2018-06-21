package serviceInput;
import java.util.*;
import domain.*;
import service.*;
public class AdminServiceImpl implements AdminService{
	private Map<String, AccountBean> accountTable;
	private Map <String,MemberBean> memberTable;
	public AdminServiceImpl() {
		accountTable = new HashMap<>();
		memberTable = new HashMap<>();
	}
	public Map<String, AccountBean> AccountTable() {
		return accountTable;
	}
	public Map<String, MemberBean> getMemberTable() {
		return memberTable;
	}

}
