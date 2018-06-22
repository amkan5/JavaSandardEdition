package controller;

import domain.*;
import service.*;
import serviceInput.*;

public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {
		return instance;
	}

	private MemberController() {
		
	}
	MemberService service;
	public void join(UserBean member) {
		System.out.println("==========멤버 컨트롤러===========");
		System.err.println("화면에서 넘어온 객체는" + member);
	/*	mem.setName(JOptionPane.showInputDialog("Name"));
		mem.setUid(JOptionPane.showInputDialog("ID"));
		mem.setPass(JOptionPane.showInputDialog("PASS"));
		mem.setSsn(JOptionPane.showInputDialog("주민번호"));
		mem.setAddr(JOptionPane.showInputDialog("주소"));
		mem.setPhone(JOptionPane.showInputDialog("전화번호"));*/
		MemberServiceImpl.getInstance().createUser(member);
	}
	public void add() {
		MemberBean mem = new StaffBean();
		/*mem.setName(JOptionPane.showInputDialog("Name"));
		mem.setUid(JOptionPane.showInputDialog("ID"));
		mem.setPass(JOptionPane.showInputDialog("PASS"));
		mem.setSsn(JOptionPane.showInputDialog("주민번호"));
		mem.setAddr(JOptionPane.showInputDialog("주소"));
		mem.setPhone(JOptionPane.showInputDialog("전화번호"));*/
		/*service.createStaff((StaffBean) mem);*/
	}
	public void list() {
		
		/*JOptionPane.showMessageDialog(null, service.map());*/
	}
	public void findById() {
		
		
	}
	public void findByName() {
	
	}
	public void Update() {
		
	}
	public void WithDrawal() {
	
	}
	
}
