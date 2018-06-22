package serviceInput;
import java.util.*;

import org.omg.CORBA.IRObject;

import domain.*;
import service.AccountService;
public class AccountServiceImpl implements AccountService {
		Map<String,AccountBean> map;
		public AccountServiceImpl() {
			map = new HashMap<>();
		}
	@Override
	public void createAccount(AccountBean acc) {
		map.put(acc.getUid(), acc);
	}

	@Override
	public void createMinus(MinusAccountBean mac) {
		map.put(mac.getUid(),mac);
	}

	@Override
	public Map<String, AccountBean> map() {
		return map;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		List<AccountBean> temp = new ArrayList<>();
		Set<AccountBean> set = new HashSet<>();
		for(Map.Entry<String, AccountBean> e : map.entrySet()) {
			if(name.equals(e.getValue().getName())) {
				set.add(e.getValue());
			}
		}
		Iterator<AccountBean> it = set.iterator();
		while(it.hasNext()) {
			temp.add(it.next());
		}
		return temp;
	}

	@Override
	public AccountBean findById(AccountBean acc) {
		return map.get(acc.getUid());
	}

	@Override
	public void updatePassword(AccountBean acc) {
		String oldPass = acc.getPass().split("/")[0];
		String newPass = acc.getPass().split("/")[1];
		AccountBean ac = map.get(acc.getUid());
		if(oldPass.equals(ac.getPass())) {
			ac.setPass(newPass);
			map.put(acc.getUid(),acc);
		}
	}
	@Override
	public void deleteAccount(AccountBean acc) {
		map.remove(acc.getUid());
	}
	
	
}
