package serviceInput;
import domain.Account;
import service.AccountService;
public class AccountServiceImpl implements AccountService {
	private Account[] list;
	@Override
	public Account CreateAccount(String name, String uid, String pass) {
		Account a= new Account(name,uid,pass);
		a.setName(name);
		a.setUid(uid);
		a.setPass(pass);
		Account[] list = new Account[100];
		return a;
	}

	@Override
	public void addList(Account account) {
	
	}
	@Override
	public Account[] list() {
	
		return list;
	}

	@Override
	public int deposit(String money) {
		
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
		// TODO Auto-generated method stub
		return null;
	}
	/*createaccount에 초기화를 줌
	 * Account a = new Account();
	a.setName(name);이런식으로 a를 하고 return a 줌?*/
	
	
	
	
}
