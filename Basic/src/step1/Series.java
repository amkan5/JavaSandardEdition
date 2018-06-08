package step1;
import java.util.Scanner;
public class Series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("숫자1");
				int num1 = scan.nextInt();
				System.out.println("숫자2");
				int num2 = scan.nextInt(), tem=0;
				if(num1>num2){
					tem=num2;
					num2=num1;
					num1=tem;
				}
				int sum = num1;
				String result = num1+"";
				for (int i=num1+1; i<=num2; i++){
					result += "+" + i;
					sum += i;
				}
				System.out.println(result + "=" + sum);
				break;
			default : System.out.println("에러");
			}
		}
	}

}
