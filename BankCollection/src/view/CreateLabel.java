package view;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreateLabel {
	JLabel idLab;
	JPanel idPan;
	public void create() {
		idLab = new JLabel("ID", JLabel.CENTER);
		idPan = new JPanel();
		idPan.add(idLab);
	
		//this.add(btn1); this는 상위 컴포넌트 
	}
}
