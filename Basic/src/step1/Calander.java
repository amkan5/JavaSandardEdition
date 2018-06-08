package step1;
import java.util.Scanner;
public class Calander {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("0.종료 1.실행");
			switch (scan.nextInt()){
				case 0 : return;
				case 1 : 	System.out.println("몇월?");
							int mon = scan.nextInt();
							int day = 30;
							switch(mon){
							case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day=31;break;
							case 2 : day=28; break;
							}
							System.out.println(mon+"월 " + day + "일");
				break;
				default : System.out.print("Error");
			}
		}	
	}

}
