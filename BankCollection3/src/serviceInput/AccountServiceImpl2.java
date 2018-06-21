package serviceInput;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import service.AccountService2;
public class AccountServiceImpl2 implements AccountService2 {
	List<AccountBean> list;

	public AccountServiceImpl2() {
		list = new ArrayList<>();
	}
	
	public void createAccount(AccountBean acc) {
		list.add(acc);
	}

	@Override
	public void createMinusAccount(MinusAccountBean macc) {
		list.add(macc);
	}

	@Override
	public List<AccountBean> list() {
		return list;
	}

	@Override
	public List<AccountBean> search(String param) { //얘는 
		 List<AccountBean> temp = new ArrayList<>();
		 for(int i=0;i<list.size();i++) {
			 if(param.equals(list.get(i).getName())) {
				 temp.add(list.get(i));
			 }
		 }
		return temp;
	}

	@Override
	public AccountBean search(AccountBean acc) { //얘는 하나만 찾어. 아이디/비번
		AccountBean dep = new AccountBean();
		for(int i=0;i<list.size();i++) {
			 if(acc.getUid().equals(list.get(i).getUid())) {
				 dep = list.get(i);
				 break;
			 }
		}
		return dep;
	}

	@Override
	public void update(AccountBean acc) {
		AccountBean m = search(acc);
		m.setPass(acc.getPass());
		list.add(list.indexOf(m),m);
		//list.add(list.indexOf(m),m.setPass(acc.getPass()));
		list.get(list.indexOf(search(acc))).setPass(acc.getPass());
	}
	@Override
	public void delete(AccountBean acc) {
		list.remove(search(acc));
		list.remove(list.indexOf(search(acc)));
	}
	
}
