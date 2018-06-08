package step2;

/**
 기사문제시험 [수열010] 1+2+#+ +100
 정수를 입력받아 두 사이의 합을 구하는 프로그램으로 구현하시오... 
 * */
import java.util.Scanner;

public class SequenceSum {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("0.종료 1.실행");
			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("숫자1");
				int num1 = sc.nextInt();
				System.out.println("숫자2");
				int num2 = sc.nextInt(), temp = 0;
				if (num2 < num1) {
					temp = num1;
					num1 = num2;
					num2 = temp;
				}
				 /* temp = (num1>num2)? num1 : num2 ;
				  num1 = (num1>num2)? num2 : num1 ;
				  num2 = (num1>num2)? temp : num2 ;*/
				  
				int sum = 0;
				String result = "";
				for (int i = num1; i <= num2; i++) {
					/*result += "+" + i;*/
					sum += i;
					result += (i==num2)? i+"=":i+"+";
				}
				System.out.println(result + sum);
				break;
			default:
				return;
			}
		}
	}

}
