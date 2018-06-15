package service;

public interface AccountService {
	public int deposit(String restMoney, String money);
	public int withdraw(String money);
	public String createAccountNum(String random);
	public String createRandom(int start,int end);
	public String createDate();
	public String showResult();
	
}
