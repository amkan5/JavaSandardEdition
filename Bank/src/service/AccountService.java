package service;
import domain.Account;
public interface AccountService {
		public Account CreateAccount(String name, String uid, String pass); //생성자에 넣은거
		public void addList(Account account);
		public Account[] list();
		public int deposit(String money); 
		public int withdraw(String money); 
		public String createAccountNum(String random);
		public String createRandom(int start,int end);
		public String createDate();
		public String showResult();
		
}
