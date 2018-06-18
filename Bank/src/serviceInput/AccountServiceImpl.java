package serviceInput;
import java.text.SimpleDateFormat;
import java.util.Date;

import domain.AccountBean;
import domain.MinusAccountBean;
import service.AccountService;
public class AccountServiceImpl implements AccountService {
	private AccountBean[] list;
	int count;
	public AccountServiceImpl() {
		list=new AccountBean[10];
		int count = 0;
	}

	public void createAccount(AccountBean account) {
		account.setAccountNo(createAccountNum());
		account.setCreateDate(createDate());
		account.setAccountType(account.ACCOUNT_TYPE);
		//account.money(money).... 
		addList(account);
	}
	@Override
	public MinusAccountBean createMinusAccount(MinusAccountBean maccount) {
		createAccount(maccount);
		maccount.setAccountType(maccount.ACCOUNT_TYPE); 
		//instanceof newAccountBean과 new MinusAccountBean 비교
		// AccountBean[] arr = new MinusAccountBean(); 으로 담을것. 
		// Phone p = new IPhone() 이런느낌으로 
		// 상속 추상화든지 타입정의는 최상위 객체의 타입으로 정의한다. 
		return maccount;
	}

	@Override
	public void addList(AccountBean account) {
		list[count++] = account;
	}
	@Override
	public AccountBean[] list() {
		/*AccountBean[] arr = new AccountBean[0];*/ //리터낟나?
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
	public String createAccountNum() {
		String accNum = "";
		for(int i=0;i<3;i++) {
		 	accNum += (i!=2)? createRandom(0,1000)+"-" : createRandom(0,1000);
		}
		return accNum;
	}
	@Override
	public String createRandom(int start, int end) {
		return String.format("%03d", (int)(Math.random()*(end-start))+start);
	}

	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년MM월dd일").format(new Date());
	}

	@Override
	public String showResult() {
		String result = "";
		for(int i=0;i<count;i++) {
			result += list()[i].toString();
		}
		return result;
	}
	@Override
	public String showNameResult(AccountBean[] arr) {
		String result = "";
		for(int i=0;i<arr.length;i++) {
			result += arr[i].toString();
		}
		return result;
	}
	@Override
	public AccountBean findByID(AccountBean account) {
		AccountBean acc = new AccountBean();
		for(int i=0;i<count;i++) {
			if((account.getPass()).equals(list[i].getPass())&&(account.getUid()).equals(list[i].getUid())){
				acc = list[i];
				break;
			}
			}
		// 배열 list를 looping 하면서 아이디가 일치하고 비번이 일치한 값을 찾아서 그 객체를 리턴한다.
		// 일단 일치하는 값이 없는 상황은 나중에 치고 ...
		return acc;
	}
	@Override
	public AccountBean[] findByName(String name) {
		AccountBean[] arr = new AccountBean[countSameName(name)];
		int arrcnt=0;
		for(int i=0;i<count;i++) {
			if(name.equals(list[i].getName())) {
			 arr[arrcnt++] = list[i];
			}
		}
		return arr;
	
	}


	@Override                
	public int countSameName(String word) {
		int cnt = 0;
		for(int i=0;i<count;i++) {
			if(word.equals(list[i].getName())) {
				cnt++;}
			}
		return cnt;
	}

	@Override
	public Object showMinusResult() {
		// TODO Auto-generated method stub
		return null;
	}


	
	/*createaccount에 초기화를 줌
	 * Account a = new Account();
	a.setName(name);이런식으로 a를 하고 return a 줌?*/




	
	
	
	
}
