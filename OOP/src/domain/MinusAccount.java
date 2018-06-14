package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출금
	public void setDebt(int debt) {
		this.debt=debt*-1;
	}
	public int getDebt() {
		return debt;
	}
	public String toString() {
		super.setAccountNo();
		super.setCreateDate();
		return String.format("%s \n"
				+ "계좌번호:%s \n"
				+ "이름: %s\n"
				+ "생성일 :%s\n"
				+ "잔액: %d\n",
				super.BANK_NAME,
				super.getAccountNo(),
				super.getName(),
				super.getCreateDate(),
				getDebt());
	}
}
