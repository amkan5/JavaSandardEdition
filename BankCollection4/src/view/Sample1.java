package view;
import java.awt.*;
import javax.swing.*;
public class Sample1 extends JFrame{
	private static final Object BorderLayout = null;
	public Sample1(String title) {
		super(title);
		setSize(500, 500);
		setLocation(300, 300);
		this.setLayout(new BorderLayout(10,10));
		JPanel pan1 = new JPanel();
		pan1.setSize(500,100);
		pan1.setBackground(Color.YELLOW);

		JLabel lab1 = new JLabel("관리자화면");
		JLabel lab2 = new JLabel("회원관리");
		JLabel lab3 = new JLabel("계좌관리");
		lab2.setBounds(10, 30, 50,20);
		lab3.setBounds(10, 40, 50, 20);
		pan1.add(lab1);
		pan1.add(lab2);
		pan1.add(lab3);
		JButton btn1 = new JButton("버튼1");
		/*this.add(pan1);
		//setVisible(true);
		/*this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
	}
	public static void main(String[] args) {
		new Sample1("샘플");
	
}
}
