package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public String accountType;
	public int debt,limit; // 대출금
	public MinusAccount (String name,String uId,String pass) {
		super(name,uId,pass);
		setAccountType(ACCOUNT_TYPE);
	}
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	public String toString() {
		super.setAccountNo();
		super.setCreateDate();
		return String.format("%s \n"
				+ "계좌번호:%s \n"
				+ "이름: %s\n"
				+ "생성일 :%s\n"
				+ "잔액: %d\n",
				BANK_NAME, 
				super.getAccountNo(),
				super.getName(),
				super.getCreateDate(),
				super.getMoney());
	}
}
