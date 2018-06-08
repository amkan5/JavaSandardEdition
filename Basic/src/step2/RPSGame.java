package step2;
import java.util.Scanner;
public class RPSGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : return;
			case 1 :
					int num1 = 0, num2=0;
					String result = "";
					System.out.println("A: 0.가위 1.바위 2.보");
					//1. String arps = sc.next();
					num1 = sc.nextInt();
	 		 		System.out.println("B : 0.가위 1.바위 2.보");
				   //1. String brps = sc.next();
	 		 		num2 = sc.nextInt();
	 		 		result = (num1==num2)? "비김" : "B가이김";
	 		 		if ((num1+num2==1)&&(num1==1)||((num1+num2==2)&&(num1==0))||((num1+num2==3)&&(num1==2))) {
	 		 			result = "A가이김";
	 		 		}
	 		 		/* 2번째 방법
	 		 		int cal = (num1==num2)? 0 : num1+num2;
	 		 		switch(cal) {
	 		 		case 0 : result = "비김";break;
	 		 		case 1 : result = (num1==1)? "A가이김" : "B가이김";break;
	 		 		case 2 : result = (num1==0)? "A가이김" : "B가이김";break;
	 		 		case 3 : result = (num1==2)? "A가이김" : "B가이김";break;
	 		 		default : break;
	 		 		}*/
	 		 		/* 첫번째 방법
	 		 		    if(arps.equals(brps)){
	 		 			result = "비김";
	 		 		}else if(
	 		 			(arps.equals("R") && brps.equals("S"))
	 		 			||
	 		 			(arps.equals("P") && brps.equals("R"))
	 		 		 	||
	 		 		 	(arps.equals("S") && brps.equals("P"))
	 		 				){
	 		 			result = "A가 이김";
	 		 		}*/
	 		 		System.out.println(result);
					break;
			default : System.out.println("에러");
			}
		}
	}

}
