package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceInput.*;
/*계좌계설이랑 리스트 뽑기 
 * input:name, id, password
 * -AccNo 랜덤으로 발생
 * -createDate
 * -리스트 배열에 넣기.
 * output: accountType, Name, AccNo, createDate */
enum AButt{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT,
	LIST
}
public class AccountController {
	public static void main(String[] args) {
		AccountService aservice = new AccountServiceImpl();
		while(true) {
			AButt[] butt = {
				AButt.EXIT,
				AButt.ACCOUNT,
				AButt.MINUS_ACCOUNT,
				AButt.LIST
			};
		AButt menu = (AButt)JOptionPane.showInputDialog(
		           null, //frame
		           "ACCOUNT PAGE", //frame title
		           "SELECT MENU", //order
		           JOptionPane.QUESTION_MESSAGE, //type
		           null, // icon
		           butt, //Array of choices
		           butt[1] //default
		            );
		switch(menu) {
		case EXIT : return;
		case ACCOUNT : 
			
			break;
		case MINUS_ACCOUNT : break;
		case LIST : break;
		
		}			
		}
	}
}
