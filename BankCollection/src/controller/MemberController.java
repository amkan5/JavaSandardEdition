package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceInput.*;
enum MButt{
	//JOIN은 일반유저 추가, ADD는 직원 추가
	EXIT,
	JOIN, ADD, //void create  
	LIST,FIND_BY_ID,FIND_BY_NAME,COUNT, //all, one, sum,count(read하는 method) <-리턴하는 결과값이 
	UPDATE, //void 말그대로 update
	WITHDRAWAL //void delete
} //crud ->메소드짜는걸 앞글자만 따서 crud라고함 ㅎ 
public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		MemberBean mem = null;
		while(true) {
			MButt[] butt = {
				MButt.EXIT,
				MButt.JOIN,
				MButt.ADD,
				MButt.LIST,
				MButt.FIND_BY_ID,
				MButt.FIND_BY_NAME,
				MButt.UPDATE,
				MButt.WITHDRAWAL
			};
		MButt menu = (MButt)JOptionPane.showInputDialog(
		           null, //frame
		           "ACCOUNT PAGE", //frame title
		           "SELECT MENU", //order
		           JOptionPane.QUESTION_MESSAGE, //type
		           null, // icon
		           butt, //Array of choices
		           butt[1] //default
		            );
		switch(menu) {
		case EXIT : 
			return;
		case JOIN : 	
			break;
		case ADD : 
			break;
		case LIST : 
			break;
		case FIND_BY_ID:
			break;
		case FIND_BY_NAME: 
			break;
		case UPDATE:
			break;
		case WITHDRAWAL:  
	
			break;
		default : break;
		}			
		}
	}

}
