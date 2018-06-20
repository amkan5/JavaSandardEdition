package service;
import java.util.List;
import java.util.ArrayList;
import domain.*;
public interface AccountService {
	public void createAccount(AccountBean acc);
	public void createMinusAccount(MinusAccountBean macc);
	public List<AccountBean> list();
	public List<AccountBean> search(String param);
	public AccountBean search(AccountBean acc);
	public void update(AccountBean acc);
	public void delete(AccountBean acc);
}
