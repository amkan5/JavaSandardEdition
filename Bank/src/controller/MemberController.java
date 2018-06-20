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
			mem = new UserBean();
			mem.setName(JOptionPane.showInputDialog("Name"));
			mem.setUid(JOptionPane.showInputDialog("ID"));
			mem.setPass(JOptionPane.showInputDialog("PASS"));
			mem.setSsn(JOptionPane.showInputDialog("주민번호"));
			mem.setAddr(JOptionPane.showInputDialog("주소"));
			mem.setPhone(JOptionPane.showInputDialog("전화번호"));
			service.createJoin(mem);
			break;
		case ADD : 
			mem = new StaffBean();
			mem.setName(JOptionPane.showInputDialog("Name"));
			mem.setUid(JOptionPane.showInputDialog("ID"));
			mem.setPass(JOptionPane.showInputDialog("PASS"));
			mem.setSsn(JOptionPane.showInputDialog("주민번호"));
			mem.setAddr(JOptionPane.showInputDialog("주소"));
			mem.setPhone(JOptionPane.showInputDialog("전화번호"));
			service.createAdd(mem);
			break;
		case LIST : 
			JOptionPane.showMessageDialog(null, service.list());
			break;
		case FIND_BY_ID:
			mem = new MemberBean();
			mem.setUid(JOptionPane.showInputDialog("ID"));
			mem.setPass(JOptionPane.showInputDialog("Pass"));
			JOptionPane.showMessageDialog(null, service.readId(mem));
			break;
		case FIND_BY_NAME: 
			MemberBean[] mems = service.readName(JOptionPane.showInputDialog("name"));
			JOptionPane.showMessageDialog(null, mems);
			break;
		case UPDATE://비번만 바꾸기
			mem = new MemberBean();
			mem.setUid(JOptionPane.showInputDialog("ID"));
			mem.setPass(JOptionPane.showInputDialog("Pass")+"/"
						+JOptionPane.showInputDialog("new Pass"));
			JOptionPane.showMessageDialog(null, service.updatePass(mem));
			break;
		case WITHDRAWAL:  
			mem = new MemberBean();
			mem.setUid(JOptionPane.showInputDialog("ID"));
			mem.setPass(JOptionPane.showInputDialog("Pass")+"/"
						+JOptionPane.showInputDialog("confirm Pass"));
			service.deleteMember(mem);
			break;
		default : break;
		}			
		}
	}

}
