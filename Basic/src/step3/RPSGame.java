package step3;
import javax.swing.JOptionPane;
public class RPSGame {
	public static void main(String[] args) {
		int num1 = 0, num2=0, totalCount=0, countA=0, countD=0, temp=0;
		String result = "";
		while(true) { 
		temp = Integer.valueOf(JOptionPane.showInputDialog("0.실행 1.승패"));
		switch(temp) {
		case 0 :totalCount++;
				num1 = Integer.valueOf(JOptionPane.showInputDialog("A: 0.가위 1.바위 2.보"));
				/*num2 = Integer.valueOf(JOptionPane.showInputDialog("B : 0.가위 1.바위 2.보"));*/
				temp = (int)(Math.random()*3);
				/* temp = (temp!=0) 1 : 2; */
				/* JOptionPane.showMe0ssageDialog(null, temp);*/
				result = (num1==num2)? "비김" : "B가이김";
				countD += (num1==num2)? 1 : 0; 
				if ((num1+num2==1)&&(num1==1)||((num1+num2==2)&&(num1==0))||((num1+num2==3)&&(num1==2))) {
	 			result = "A가이김";
	 			countA++;
				}
	 	JOptionPane.showMessageDialog(null, result);
			break;
		case 1 : result = "A : " + String.valueOf(countA) + "승 " + String.valueOf(totalCount-countA-countD)  + "패 " +String.valueOf(countD) + "무";
				JOptionPane.showMessageDialog(null, result);
			return;
		}
		
	 	
	}
	}
}
