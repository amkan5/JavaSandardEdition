package step3;
import javax.swing.JOptionPane;
public class Calc {
	public static void main(String[] args) {
    	int num1=0,total = 0, count=0, num2=0;
    	String str = "";
		while(true) {
				count++;
				total += (count==1)? Integer.parseInt(JOptionPane.showInputDialog("Enter number1")) : 0;
	        	String op = JOptionPane.showInputDialog("Enter op");
	        	str += (count==1)? String.valueOf(total) + op : op;
	        	switch(op){
	            case "+" : 
	            	num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number2")); 
	            	str += String.valueOf(num2);
	            	total+=num2; break;
	            case "-" : 
	            		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number2"));
	            		str += String.valueOf(num2);
	            		total-=-num2; break;
	            case "*" : 
	            		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number2"));
	            		str += String.valueOf(num2);
	            		total*=num2; break;
	            case "/" : 
	            		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number2"));
	            		str += String.valueOf(num2);
	            		total/=num2; break;
	            case "%" : 
	            		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number2"));
	            		str += String.valueOf(num2);
	            		total%=num2; break;
	            case "=" : 
	            			JOptionPane.showMessageDialog(null, str  + total);
	            		 	return;
	            default : JOptionPane.showMessageDialog(null,"에러");
	            			return;
	        	}

			 
	        	}
		}
	}
