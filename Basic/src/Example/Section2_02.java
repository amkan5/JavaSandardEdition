package Example;
import java.util.Scanner;
public class Section2_02 {
	public static void main(String[] args) {
	int num = 0, result = 0;
	System.out.println("첫번째 계산할 값을 입력하세요");
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
	System.out.println("+ - * / %");
	String op = s.next();
	System.out.println("두번째 계산할 값을 입력하세요");
	int num2 = s.nextInt();
		result = num2;
	switch(op) {
	case "+" : result += num;
			break;
	case "-" : result -= num;
		break;
	case "*" : result *= num;
		break;
	case "/" : result /= num;
		break;
	case "%" : result %= num;
	default : return;
	}
	System.out.println(num + op + num2 + "=" + result);
	}
}
