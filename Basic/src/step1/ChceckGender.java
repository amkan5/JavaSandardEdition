package step1;
import java.util.Scanner;
public class ChceckGender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("이름?");
  			String name = scan.next();
  			System.out.println("주민번호?");
  			String ssn = scan.next();
  			char ch = ssn.charAt(7);
  			if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
  				System.out.println("다시 입력하세요");
  				return;
  			}
  			String gender = "";
  			switch(ch){
  				case '1' : case '3': gender = "남자";break;
  				case '2' : case '4' : gender = "여자";break;
  				case '5' : case '6' : gender = "외국인";break;
  			}
  			System.out.println(gender);
  			System.out.println("0.종료 1.실행");
  			int flag = scan.nextInt();
					break;
			default : System.out.println("에러");
			}
		}
	}

}
