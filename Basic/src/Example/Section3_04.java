package Example;
import java.util.Scanner;
public class Section3_04 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		System.out.printf("10진수 ==> %d \n", data);
		System.out.printf("16진수==> %x \n", data);
		System.out.printf("8진수 ==> %o \n", data);
	}

}
