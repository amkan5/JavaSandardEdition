package step3;

import javax.swing.JOptionPane;
public class GradeReport {
	public static int getTotal(String[] scores) {
		return Integer.parseInt(scores[1])+Integer.parseInt(scores[2])+Integer.parseInt(scores[3]);
	}
	public static int getAve(String[] scores) {
		return (Integer.parseInt(scores[1])+Integer.parseInt(scores[2])+Integer.parseInt(scores[3]))/3;
	}
	public static String getGrade(int getAve) {
		String grd = "";
		switch(getAve/10) {
		 case 10 : case 9 : grd = "A"; break;
		 case 8 : grd="B"; break;
		 case 7 : grd="C"; break;
		 case 6 : grd="D"; break;
		 case 5 : grd="E"; break;
		 default : grd="F"; break;
		}
		return grd;
	}
	public static void main(String[] args) {
		int count = 0;
		String result = "| 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 학점 |\n";   
		int[] totals = new int[15];
		String[] std = new String[15];
		while(true) {	
		String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위");
		switch(menu) {
		case "0" : return;
		case "1" : 
			count++;
			String score = JOptionPane.showInputDialog("이름/국어/영어/수학");
			String[] scores = score.split("/");
			std[count] = scores[0] + " | " + scores[1] + " | " + scores[2] + " | " + scores[3] + " | " + String.valueOf(getTotal(scores))+ " | "  + getAve(scores) + " | " + getGrade(getAve(scores)) + "\n";
			totals[count] = getTotal(scores);
			/*result += scores[0] + " | " + scores[1] + " | " + scores[2] + " | " + scores[3] + " | " + String.valueOf(getTotal(scores))+ " | "  + getAve(scores) + " | " + getGrade(getAve(scores)) + "\n";*/
			break;
		case "2" : 
					for(int i=1;i<=count;i++) {
						result += std[i]+"\n";
					}
					JOptionPane.showMessageDialog(null, result);
		break;
		case "3" : 
					/*for(int i=1;i<=count;i++){
						for(int k=i+1;k<=count+1;k++) {
							if(totals[i]<totals[k]) {
								int temp = totals[i];
								totals[i] = totals[k];
								totals[k] = temp;
								String temp2 = std[i];
								std[i] = std[k];
								std[k] = temp2;
							}
						}
					}*/
					int a = totals[1];
					int b= totals[2];
					int c = totals[3];
					result = "";
					if (a>b&&a>c) {
						if(b>c) {
							std[1] = "1등 " + std[1];
							std[2] = "2등 " + std[2];
							std[3] = "3등 " + std[3];
						}else {
							std[1] = "1등 " + std[1];
							std[3] = "2등 " + std[3];
							std[2] = "3등 " + std[2];
						}
					} else if(b>c&&b>a){
						if(a>c) {
							std[2] = "1등 " + std[2];
							std[1] = "2등 " + std[1];
							std[3] = "3등 " + std[3];
							
						}else {
							std[3] = "1등 " + std[3];
							std[1] = "2등 " + std[1];
							std[2] = "3등 " + std[2];
						}
					} else if(c>a&&c>b) {
						if(a>b) {
							std[2] = "1등 " + std[2];
							std[3] = "2등 " + std[3];
							std[1] = "3등 " + std[1];
						}else {
							std[3] = "1등 " + std[3];
							std[2] = "2등 " + std[2];
							std[1] = "3등 " + std[1];
						}
					}
					
					JOptionPane.showMessageDialog(null, std[1]+"\n"+std[2]+"\n"+std[3]+"\n");
			break;
		default : 
			return;
		}
		}
		
	}
}
