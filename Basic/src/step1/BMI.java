package step1;
import java.util.Scanner;
/**
 BMI= 몸무게/(키)제곱 
저체중 : 18.5 미만
정상: 18.5~23
비만전단계: 23 ~25
비만1단계: 25~30
비만2단계 :30~35
비만3단계 : 35이상 
 * */
public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 		while(true){
 			System.out.println("0.종료 1.실행");
 			switch(scan.nextInt()){
 				case 0 : return;
 				case 1 : 
 						System.out.println("몸무게?");
 						int wet = scan.nextInt();
 						System.out.println("키?");
 						int hig = scan.nextInt();
 						double bmi = wet/((hig*0.01)*(hig*0.01));
 						String result = "비만3단계";
 						if(bmi<=18.5){
 							result = "저체중";
 						} else if(bmi<=23){
 							result = "정상";
 						} else if(bmi<=25){
 							result = "비만전단계";
 						} else if(bmi<=30){
 							result = "비만1단계";
 						} else if(bmi<=35){
 							result = "비만2단계";
 						}
 						System.out.println(result);
 						break;
 				default :System.out.println("Error"); break;
			}
 		}	
	}

}
