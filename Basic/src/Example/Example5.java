package Example;
import java.util.Scanner;
public class Example5 {
	public static void main(String[] args) {
		int data=0;
		String result = "";
		System.out.println("입력진수 결정 <1>10 <2>16 <3>8 ");
		Scanner s = new Scanner(System.in);
		String menu = s.next();
		System.out.println("값 입력");
		switch(menu){
		case "1" : data = Integer.parseInt(s.next(),10);
			break;
		case "2" : data = Integer.parseInt(s.next(),16); 
			break;
		case "3" : data = Integer.parseInt(s.next(),8); 
			break;
		default : return;
		}
		System.out.printf("10진수==> %d \n", data);
		System.out.printf("16진수==> %x \n", data);
		System.out.printf("8진수==> %o \n", data);
	}
	
}
