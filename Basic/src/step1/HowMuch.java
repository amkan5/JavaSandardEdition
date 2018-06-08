package step1;
import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("얼마예요?");
					int won = scan.nextInt();
					System.out.println(won+"원 입니다");
					System.out.println("몇개 드릴까요?");
					int num = scan.nextInt();
					System.out.println(num + "개 주세요");
					int sum = won*num;
					System.out.println("총 금액은 " + sum + " 입니다");
					System.out.println("비싸요 깍아주세요");
					System.out.println("몇 퍼센트 DC할까요?");
					int dc = scan.nextInt();
					String say = "안팔아요";
					if(dc<=10){
						say = sum-sum*dc/100 + "원 입니다";
					}
					System.out.println(say);
					break;
			default : System.out.println("에러");
			}
		}

	}

}
