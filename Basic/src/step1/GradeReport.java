package step1;
import java.util.Scanner;
public class GradeReport {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("이름?");
	 			String name = scan.next();
	 			System.out.println("국어점수?");
	 			int kuk = scan.nextInt();
	 			String result = "잘못된 점수입니다";
	 			if(kuk>100){
	 				System.out.println(result);
	 				return;
	 			}
	 			System.out.println("영어점수?");
	 			int eng = scan.nextInt();
	 			if(eng>100){
	 				System.out.println(result);
	 				return;
	 			}
	 			System.out.println("수학점수?");
	 			int math = scan.nextInt();
	 			if(math>100){
	 				System.out.println(result);
	 				return;
	 			}
	 			int ave = (kuk+eng+math)/3;
	 			int ave2 = ave/10;
	 			String grd = "F";
	 			switch(ave2){
	 				case 9 : grd = "A";break;
	 				case 8 : grd = "B";break;
	 				case 7 : grd = "C";break;
	 				case 6 : grd = "D";break;
	 				case 5 : grd = "E";break;
	 			}
	 			/* string으로 점수받은거)
	 			str = input(sc).split(" ");
 	 			kor = Integer.parseInt(str[0]);
 	 			eng = Integer.parseInt(str[1]);
 	 			math = Integer.parseInt(str[2]);
 	 			System.out.println(kor+" "+eng+" "+math);*/
	 		/*	total = kor+eng+math;
	 			int ave = total/3;
	 			int ave2 = ave/10;
	 			String grd = ""; 
	 			String[] arrG = {"F","E","D","C","B","A"};
	 			int count = 0;
	 			for (int i=1;i<=10;i++) {
	 				count += (i<=4)? 0 : +1;
	 				grd += (i==ave2)? arrG[count] : "";
	 			}*/
	 			System.out.println("이름: " + name + " 평균: " + ave + " 학점: " + grd );
					break;
			default : System.out.println("에러");
			}
		}
	}
}
