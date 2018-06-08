package step2;

/**
 [수열012] 홀수짝수의 합계 (메소드 분할) 
 * */
import java.util.Scanner;

public class Seq012_2 {
	public static int[] input(Scanner sc) {
		int[] result = new int[2];
		int temp = 0;
		System.out.println("시작수");
		int num1 = sc.nextInt();
		System.out.println("끝수");
		int num2 = sc.nextInt();
		if (num2 < num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		result[0] = num1;
		result[1] = num2;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("0.종료 1.짝수 2.홀수");
			switch (sc.nextInt()) {
			case 0:
				return;
			case 1:
				int num1=0, num2=0, count=0, totalCount=0, sum=0;
				int[] arr = input(sc);
					num1 = arr[0];
					num2 = arr[1];
				String result ="";
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0) {
						count++;
						result += (count == totalCount)? i + "=" : i + "+";
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				num1=0; num2=0; count=0; totalCount=0; sum=0;
				int[] arr2 = input(sc);
				num1 = arr2[0];
				num2 = arr2[1];
				result ="";
				for (int i = num1; i <= num2; i++) {
					if (i % 2 != 0) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = num1; i <= num2; i++) {
					if (i % 2 != 0) {
						count++;
						result += (count == totalCount) ? i + "=" : i + "+";
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			default:
				return;
			}
		}

	}
}
