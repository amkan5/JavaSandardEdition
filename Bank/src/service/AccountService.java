package service;
import domain.*;
public interface AccountService {
		public void createAccount(AccountBean account); //생성자에 넣은거
		public MinusAccountBean createMinusAccount(MinusAccountBean maccount);
		public void addList(AccountBean account);
		public AccountBean[] list();
		public int deposit(String money); 
		public int withdraw(String money); 
		public String createAccountNum();
		public String createRandom(int start,int end);
		public String createDate();
		public String showResult();
		/*public AccountBean findByID(AccountBean ac);*/
		/*public String toString();*/
		public AccountBean findByID(AccountBean ac);
		public AccountBean[] findByName(String showInputDialog);
		public int countSameName(String name);
		public String showNameResult(AccountBean[] arr);
		public Object showMinusResult();
}
