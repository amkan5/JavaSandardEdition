package step2;

/**
 NEW GradeReport
 * */
import java.util.Scanner;
public class GradeReport {
		/*int를 쓴 경우
  		public static int[] input(Scanner sc) {
		int[] result = new int[3];
		int kor =0;
		System.out.println("국어점수?"); 
		result[0] = sc.nextInt();
		System.out.println("영어점수?");
		result[1] = sc.nextInt();
		System.out.println("수학점수?");
		result[2] = sc.nextInt();
		return result;
	}*/
	
	public static boolean input(int param) {
		 boolean flag = false;
		/* flag = (param>=0 && param<=100)? true : false;*/
		return (param>=0 && param<=100);
	}
	public static String[] getTotal(String[] params) {
		String[] result = new String[10];
		result[0] = String.valueOf(
				Integer.parseInt(params[0]) + 
				Integer.parseInt(params[1]) + 
				Integer.parseInt(params[2]));
		result[1] = String.valueOf(Integer.parseInt(result[0])/3);
		return result;
	}

	public static String[] getGrade(String[] params) {
		String[] result = new String[3];
		result[0] = params[0];
		result[1] = params[1];
	/*	switch(Integer.parseInt(result[1])/10){
			case 9 : result[2] = "A";break;
			case 8 : result[2] = "B";break;
			case 7 : result[2] = "C";break;
			case 6 : result[2] = "D";break;
			case 5 : result[2] = "E";break;
			default : result[2] = "F";break;
		}*/ 
		String[] arrG = {"F","E","D","C","B","A"};
		int count = 0;
		for (int i=1;i<=10;i++) {
			count += (i<=4)? 0 : +1;
			result[2] += (i==Integer.parseInt(result[1])/10)? arrG[count] : "";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행");
			switch(sc.nextInt()) {
			case 0 : return;
			case 1 : 
	 			int kor=0, eng=0, math=0, total=0;
	 			String[] params = new String[10];
	 			System.out.println("이름?");
	 			String name = sc.next();
	 		/*	System.out.println("국어점수?"); 
	 			params[0] = sc.next();
	 			System.out.println("영어점수?");
	 			params[1] = sc.next();
	 			System.out.println("수학점수?");
	 			params[2] = sc.next();*/
	 			String[] subjects = {"국어","영어","수학"};
	 			for(int i=0; i<subjects.length; i++) {
	 				System.out.println(subjects[i] + " 점수를 입력하세요");
	 				int temp = Integer.parseInt(sc.next());
	 				if (input(temp)){
	 				params[i] = String.valueOf(temp);
	 				} else {
	 					i--;
	 					}
	 			}
	 			String[] arr = getGrade(getTotal(params));
	 			System.out.printf(" | 이름  | 총점   | 평균  | 등급  |\n");
	 			System.out.printf("-----------------------------\n");
	 			System.out.printf(" | %s | %s | %s | %s |\\n", name,arr[0],arr[1],arr[2]);
	 			/*System.out.printf("| %s | %d | %d | %s | \n",name,total,ave,grd);*/
					break;
			default : System.out.println("에러");
			}
		}
	}

}
