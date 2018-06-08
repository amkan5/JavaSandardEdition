package step1;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("Enter number1");
	        	int num1 = scan.nextInt();
	        	System.out.println("Enter op");
	        	String op = scan.next();
	        	System.out.println("Enter number2");
	        	int num2 = scan.nextInt();
	        	int num3 = 0;
	        	String str = "Wrong op";
	        	switch(op){
	            case "+" : num3=num1+num2; break;
	            case "-" : num3=num1-num2; break;
	            case "*" : num3=num1*num2;break;
	            case "/" : num3=num1/num2;break;
	            case "%" : num3=num1%num2;break;
	            default : op="x";
	            break;
	        	}
	        	if (!op.equals("x")){
	        		str = num1+op+num2+"= "+num3;
	        	}
	        	System.out.println(str);
					break;
			default : JOptionPane.showMessageDialog(null, "에러");
			}
		}

	}

}
