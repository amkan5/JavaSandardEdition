package UI;

import javax.swing.JOptionPane;

//스위치로 마이너스통장갈지 스탠다드통장갈지.... 마이너스 통장에는 대출하는 기능만.
//uid 
// 마이너스로 가면 대출하시겠습니까? 까지 보여줘야해. 
// output:
/* 
 * 비트캠프
 * 기본통장(마이너스통장) 입금하시겠습니까?
 * 계좌번호 : 123-456-789
 * 이름 : 홍길동 (input)으로 받을것
 * 생성일:
 * 패스워드 (input)받을것 (어딘가에 저장되어있어야함) 나오진않음
 * 잔액 : 0 (입금했으면 만원있는거. 한번물어봄)
 * 
 * 마이너스통장가면 
 * 계좌번호 : 123-456-789
 * 이름: 
 * 생성일:
 * 대출하시겠습니까? 
 * 잔액 : -10000. (첫날잔액만 나오게)
 * 상속을 이용해서. 마이너스통장은 대출만 받기.
 * 
 * **/
import domain.Account;
import domain.MinusAccount;
enum Butt3{
		STANDARD_ACCOUNT,
		MINUS_ACCOUNT
}
enum Butt4{
		YES,
		NO
}
public class AccountMain {
	public static void main(String[] args) {
		Account acc = null;
		MinusAccount macc = null;
		Butt3[] buttons = {
				Butt3.STANDARD_ACCOUNT,
				Butt3.MINUS_ACCOUNT
		}; 
		Butt4[] button = {
				Butt4.YES,
				Butt4.NO
		};
		while(true){
			Butt3 menu = (Butt3)JOptionPane.showInputDialog(
					null, //frame
					"Account PAGE", //frame title
					"SELECT ACCOUNT MENU", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, //Array of choices
					buttons[1] //default
					);
			switch(menu) {
			case STANDARD_ACCOUNT : 
				acc = new Account();
				acc.setUid(JOptionPane.showInputDialog("ID를 입력하세요"));
				acc.setPass(JOptionPane.showInputDialog("Password를 입력하세요"));
				acc.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				Butt4 ask = (Butt4)JOptionPane.showInputDialog(
						null, //frame
						"입금하시겠습니까?", //frame title
						"SELECT ACCOUNT MENU", //order
						JOptionPane.QUESTION_MESSAGE, //type
						null, //icon
						button, //Array of choices
						button[1] //default
						);
				switch(ask){
				case YES : 
					acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액은?"))); break;
				case NO : 
					acc.setMoney(0); break;
				default : return;
				}
				JOptionPane.showMessageDialog(null, acc.toString());
				break;
			case MINUS_ACCOUNT : 
				macc = new MinusAccount();
				macc.setUid(JOptionPane.showInputDialog("ID를 입력하세요"));
				macc.setPass(JOptionPane.showInputDialog("Password를 입력하세요"));
				macc.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				ask = (Butt4)JOptionPane.showInputDialog(
						null, //frame
						"대출하시겠습니까?", //frame title
						"SELECT ACCOUNT MENU", //order
						JOptionPane.QUESTION_MESSAGE, //type
						null, //icon
						button, //Array of choices
						button[1] //default
						);
				switch(ask) {
				case YES : macc.setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출금액은?")));break;
				case NO : macc.setDebt(0); break;
				default : return;
				}
				JOptionPane.showMessageDialog(null, macc.toString());
				break;
			default : return;
			}
			
		}

	}

}
