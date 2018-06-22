package serviceInput;
import java.util.*;
import domain.*;
import service.AccountService;
public class AccountServiceImpl implements AccountService {
	Map<String, AccountBean> map;

	public AccountServiceImpl() {
		map = new HashMap<>();
	}
	
	public void createAccount(AccountBean acc) {
		map.put(acc.getUid(),acc);
	}

	@Override
	public void createMinusAccount(MinusAccountBean macc) {
		map.put(macc.getUid(),macc);
	}

/*	@Override
	public Map<String,AccountBean> map() {
		return map;
	}
*/
	@Override
	public List<AccountBean> findByName(String name) { 
		 List<AccountBean> temp = new ArrayList<>();
		 Set<AccountBean> set = new HashSet<>();
		 
	/*	for(Map.Entry<String, AccountBean> e : map.entrySet()) {
			if(name.equals(e.getValue().getName())) {
				set.add(e.getValue());
			}
		 }
		Iterator<AccountBean> it = set.iterator();
		while(it.hasNext()) {
			temp.add(it.next());
		}*/
		
		
		/* List<MemberBean> temp = new ArrayList<>();
			for (int i=0;i<list.size();i++) {
				if(param.equals(list.get(i).getName())) {
					temp.add(list.get(i));
			}
			}*/
		 
		/* Map<String, MemberBean> temp = new HashMap<String, MemberBean>();
	      //Set<String> key = map.keySet();
	      for(String key : map.keySet()) {
	         if(name.equals(map.get(key).getName())) {
	            temp.put(map.get(key).getUid(), map.get(key));
	         }
	      }*/
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
		if(ac==null) {
			System.out.println("id찾지못함");
		}else if(oldPass.equals(ac.getPass())) {
			ac.setPass(newPass);
			map.put(acc.getUid(), ac);
		}
	/*	
	 * 
	 * AccountBean ac = map.get(acc.getUid());
		if(ac==null) {
			System.out.println("id찾지못함");
		}else if(acc.getPass().split("/")[0].equals(ac.getPass())) {
			ac.setPass(acc.getPass().split("/")[1]);
			map.put(acc.getUid(), ac);
		} */
	
	}
	@Override
	public void deleteAccount(AccountBean acc) {
		map.remove(acc.getUid());
	}
	
}
