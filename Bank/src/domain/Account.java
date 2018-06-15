package domain;
 //마이너스 통장도 type저장하게해서 ㅎㅎ 배열에는 마이너스도 account도 걍 넣어서 나중에 구별할수있게ㅎㅎㅎ
//
public class Account {
	public final static String BANK_NAME="비트뱅크"; //영원히존재
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money,deposit,withdraw;
	protected String name,uid,pass,
		accountType,createDate,accountNo;
	public Account(String name, String uid, String pass) {
		this.accountType = ACCOUNT_TYPE;
		this.name = name;
		this.uid = uid;
		this.pass = pass;
	//네임,아이디,비번(get) 나머지는 그냥두기
	//연산해야하는 것들은, 인터페이스로 -> 옮겨
		// 섭
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
	public String getUid(String uid) {
		return uid;
	}

	
}
