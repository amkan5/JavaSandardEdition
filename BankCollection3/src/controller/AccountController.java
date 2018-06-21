package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceInput.*;
enum AButt{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT,
	LIST,
	DEPOSIT,
	WITHDRAW,
	FIND_BY_ID,
	FIND_BY_NAME,
	MINUS_LIST,
	CHANGE_PASS,
	DELETE_ACCOUNT
}
/*계좌계설이랑 리스트 뽑기 
 * input:name, id, password
 * -AccNo 랜덤으로 발생
 * -createDate
 * -리스트 배열에 넣기.
 * output: accountType, Name, AccNo, createDate */
public class AccountController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		AccountBean ac = null;
		MinusAccountBean mac = null;
		while(true) {
			AButt[] butt = {
				AButt.EXIT,
				AButt.ACCOUNT,
				AButt.MINUS_ACCOUNT,
				AButt.LIST,
				AButt.FIND_BY_ID,
				AButt.FIND_BY_NAME,
				AButt.MINUS_LIST,
				AButt.CHANGE_PASS,
				AButt.DELETE_ACCOUNT
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
		case MINUS_ACCOUNT : 

			break;
		case LIST : 
	
			break;
		case MINUS_LIST : 

			                                                                  
			break;
		case FIND_BY_ID:
		
			break;
		case FIND_BY_NAME: 
		
			break;
		case CHANGE_PASS:
		
			break;
		case DELETE_ACCOUNT :
		                                                                                                                                                             
			break;
		default : break;
		}			
		}
	}
}
