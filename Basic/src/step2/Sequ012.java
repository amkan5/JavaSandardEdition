package step2;
/**
  [수열012] 1부터 10까지의 합을 짝수로
 * */
import java.util.Scanner;
public class Sequ012 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			String result = "";
			int sum = 0, num1=0, num2=0,temp=0, count=0, totalCount=0;
			System.out.println("0.종료 1.짝수 2.홀수");
			switch(s.nextInt()) {
			case 0 : return;
			case 1 : System.out.println("시작수");
					 num1 = s.nextInt();
					 System.out.println("끝수");
					 num2 = s.nextInt();
					 if (num2 < num1) {
							temp = num1;
							num1 = num2;
							num2 = temp;
						}
				/*	  temp = (num1>num2)? num1 : num2 ;
					  num1 = (num1>num2)? num2 : num1 ;
					  num2 = (temp>num2)? temp : num2 ;*/
				// 	  num2 = (num2%2==0)? num2 : num2--;
				//	 count = num2-num1;
					 for(int i=num1; i<=num2; i++) {
						 if(i%2==0) {
							 count++;
						 }
					 }
					 totalCount = count;
					 count=0;
					 for(int i=num1; i<=num2; i++) {	
						 if(i%2==0) {
							 count++;
							 result += (count==totalCount)? i+"=" : i+"+";
							 sum += i; 	
						 } 
					}
					 System.out.println(result + sum);
				break;
			case 2 : System.out.println("시작수");
					 num1 = s.nextInt();
					 System.out.println("끝수");
					 num2 = s.nextInt();
					 if (num2 < num1) {
							temp = num1;
							num1 = num2;
							num2 = temp;
						}
					 num2 = (num2%2!=0)? num2 : num2-1;
					 for(int i=num1; i<=num2; i++) {
						 if(i%2!=0) {
							 result += (i==num2)? i+"=": i+"+";
							 sum += i;
						 }
					 }
					 System.out.println(result + sum);
				break;
			default : return;
			}
	}
		
		}
	}
