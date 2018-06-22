package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controller.*;
import domain.*;
public class openAccount extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel topLab, idLab,passLab, nameLab, phoneLab, 
		addrLab, ssnLab, emailLab;
	JTextField idTxt, passTxt, nameTxt, phoneTxt, addrTxt, 
		ssnTxt, emailTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, 
		namePan, phonePan, addrPan, ssnPan, emailPan;
	JComboBox<?> combo;
	String[] menu = {"일반통장","마이너스 통장"};
	public openAccount() {
		makeGui(); //화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}
	// uid,pass,name,ssn,phone,email,addr;
	public void makeGui() {
		topLab = new JLabel("통장개설", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);
		
		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);

		

		addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AccountBean acc = new AccountBean();
				acc.setName(nameTxt.getText());
				acc.setUid(idTxt.getText()); 
				acc.setPass(passTxt.getText());
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
					AccountController.getInstance().account(acc);
				}else {
					/*new AdminServiceImpl().createStaff((StaffBean) member);*/
				}
			}
		});
		

		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}
}
