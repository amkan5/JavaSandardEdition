package repositoryImpl;
import java.util.List;

import domain.AccountBean;
import repository.AccountDAO;
public class AccountDAOImpl implements AccountDAO{
	private static AccountDAO instance = new AccountDAOImpl();	
	public static AccountDAO getInstance() {
		return instance;
	}
	private AccountDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertAccount(AccountBean acc) {
		System.out.println("==========디에이오===========");
		System.out.println("넘어온 객체는" + acc);

	}

	@Override
	public List<AccountBean> selectAll(AccountBean acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> selectAccountByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean selectAccountById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		
	}
	
	
}
