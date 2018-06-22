package repository;
import domain.*;
import java.util.*;
public interface AccountDAO {
	public void insertAccount (AccountBean acc);
	public List<AccountBean> selectAll(AccountBean acc);
	public List<AccountBean> selectAccountByName(String name);
	public AccountBean selectAccountById(String id);
	public int countAccount();
	public void updateAccount(AccountBean acc);
	public void deleteAccount(AccountBean acc);
}
