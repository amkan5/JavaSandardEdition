package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	public final static String BANK_NAME="비트뱅크"; //영원히존재
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money,deposit,withdraw;
	protected String name,uid,pass,accountType,createDate,accountNo;
	// 통장 123-345-678 의 형태가 되도록 코딩
	// uid-> 아이디(입력) 초기입금 입력 받아야하고 통장타입. 
	// createDate 블로그에서 오늘날짜 뽀는 동작 가져오기.
	// money 잔액
	public Account(String name,String uId,String pass) {
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate();
		this.name = name;
		this.uid = uId; 	//얘는 바꿀수없는거라서 set이 없어도됨
		this.pass = pass; //얘는 바꿀수있는거라서 set이 있어야하고
	}
	//입금 deposit? 출금 withdraw? 
	public void setDepoist(int deposit) {
		this.deposit =deposit;
		setMoney(money);
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
		setMoney(money);
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setCreateDate() {
		createDate = new SimpleDateFormat("yyyy년MM월dd일").format(new Date());
	}
	public void setAccountNo() {
		String accountNo = "";
		for (int i=1;i<12;i++) {	
			accountNo += (i%4==0)? "-" : String.valueOf((int)(Math.random()*10));
		}
		this.accountNo = accountNo;
	}
	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getUid() {
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public String toString2() {
		return String.format("");
	}
	public String toString() {
		return String.format("%s %s\n"
				+ "계좌번호:%s \n"
				+ "이름: %s\n"
				+ "생성일 :%s\n"
				+ "잔액: %d\n",
				BANK_NAME,getAccountType(),getAccountNo(),getName(),getCreateDate(),getMoney());
	}
}
