package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
/*	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";*/
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected String name,uid,pass,accountType,createDate,accountNo;
	// 통장 123-345-678 의 형태가 되도록 코딩
	// uid-> 아이디(입력) 초기입금 입력 받아야하고 통장타입. 
	// createDate 블로그에서 오늘날짜 뽀는 동작 가져오기.
	// money 잔액
	public void setMoney(int money) {
		this.money = money;
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
		createDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
	public void setAccountNo() {
		accountNo = "";
		for (int i=1;i<12;i++) {	
			accountNo += (i%4==0)? "-" : String.valueOf((int)(Math.random()*9));
		}	
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
	public String toString() {
		setAccountNo();
		setCreateDate();
		return String.format("%s \n"
				+ "계좌번호:%s \n"
				+ "이름: %s\n"
				+ "생성일 :%s\n"
				+ "잔액: %d\n",
				BANK_NAME,getAccountNo(),getName(),getCreateDate(),getMoney());
	}
}
