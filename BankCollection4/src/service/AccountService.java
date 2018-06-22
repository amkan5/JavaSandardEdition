package service;
import java.util.*;
import domain.*;
public interface AccountService {
	public void createAccount(AccountBean acc);
	public void createMinusAccount(MinusAccountBean macc);
	public List<AccountBean> findByName(String name);
	public void updatePassword(AccountBean acc);
	public void deleteAccount(AccountBean acc);

}
