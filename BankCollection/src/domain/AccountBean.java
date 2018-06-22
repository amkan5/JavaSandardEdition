package domain;
 import javax.swing.JOptionPane;

//마이너스 통장도 type저장하게해서 ㅎㅎ 배열에는 마이너스도 account도 걍 넣어서 나중에 구별할수있게ㅎㅎㅎ
//
import serviceInput.*;
public class AccountBean {
	public final static String BANK_NAME="비트뱅크"; //영원히존재
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money,deposit,withdraw;
	protected String name,uid,pass,
		accountType,createDate,accountNo;

	public void setMoney(int money) {
		this.money = money;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	public String getUid() {
		return uid;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public Integer getMoney() {
		return money;
	}
	public String toString() {
		return String.format("%s \n"
				+ "계좌번호:%s \n"
				+ "이름: %s\n"
				+ "생성일 :%s\n"
				+ "잔액: %d\n",
				BANK_NAME,accountNo,name,createDate,money);
	}
	private void consol() {
		// TODO Auto-generated method stub

	}
}
