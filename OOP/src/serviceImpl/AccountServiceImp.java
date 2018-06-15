package serviceImpl;
import domain.Account;
import service.AccountService; //비즈니스 로직
public class AccountServiceImp implements AccountService {
	private Account[] list; //보안떄문에 노출하면 안되니까
	//리턴 필요없는것들은 void
	int count;
	public AccountServiceImp() {
		list = new Account[10]; //필드에있음안됨	
		int count = 0; //복습하자
	}
	public void addList(Account account) {
		list[count++] = account;
	}
	public Account[] List() {
		return list;
	}
	@Override
	public int deposit(String restMoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		/*Account[] arr = list(); *///메소드 호출
		String result = "";
		for(int i=0;i<count;i++) {
			result += list()[i]+toString();
		}
		return result;
	}

	@Override
	public Account CreateAccount(String name, String uid, String pass) {
		return new Account(name,uid,pass);
	}
	@Override
	public Account[] list() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
