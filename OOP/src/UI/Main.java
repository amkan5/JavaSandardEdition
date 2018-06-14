package UI;

import javax.swing.JOptionPane;
import domain.Salary;
import domain.BMI;
import domain.Grade;
import domain.Lotto;
enum Butt{
	EXIT,
	Lotto,
	INPUT_BMI,
	LIST,
	INPUT_GRADE,
	OUTPUT_GRADE,
	INPUT_SALARY,
	OUTPUT_SALARY
}
public class Main {
	public static void main(String[] args) {
		int cnt = 0, cnt_grd = 0, cnt_sal = 0;
		BMI[] arr = new BMI[5]; 
		BMI bmi = null;
		Grade grd = null;
		Grade[] studnets = new Grade[5];
		Salary sal = null;
		Salary[] emp = new Salary[5];
		Lotto lot = null;
		while(true){
			Butt[] buttons = {
					Butt.EXIT,
					Butt.Lotto,
					Butt.INPUT_BMI,
					Butt.LIST,
					Butt.INPUT_GRADE,
					Butt.OUTPUT_GRADE,
					Butt.INPUT_SALARY,
					Butt.OUTPUT_SALARY
			};
			Butt menu = (Butt)JOptionPane.showInputDialog(
					null, //frame
					"Salary PAGE", //frame title
					"SELECT Salary MENU", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, //Array of choices
					buttons[1] //default
					);
			
 			switch(menu){
 				case EXIT : return;
 				case INPUT_BMI :
 					bmi = new BMI(); //이전의 값을 없애버림 오버라이딩이 발생하지않게
 					bmi.setName(JOptionPane.showInputDialog("이름?"));
 					bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키?")));
 					bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게?")));
 					bmi.setResult();
 					String result = String.format("%s, %f mm, %f kg, %s", bmi.getName(),bmi.getHeight(),bmi.getWeight(),bmi.getResult());
 					arr[cnt] = bmi;	
 					cnt++;
 					JOptionPane.showMessageDialog(null, result);	
 					break;
 				case LIST : 
 					String output = "";
 					for (int i=0;i<cnt;i++) {
 						output += arr[i].toString() + "\n";
 					}
 					JOptionPane.showMessageDialog(null, output);	break;
 				case INPUT_GRADE : 
 					grd = new Grade();
 					String score = JOptionPane.showInputDialog("이름/국어/영어/수학");
 					String[] scores = score.split("/");
 					grd.setName(scores[0]);
 					grd.setKor(Integer.valueOf(scores[1]));
 					grd.setEng(Integer.valueOf(scores[2]));
 					grd.setMath(Integer.valueOf(scores[3]));
 					grd.setTotal();
 					grd.setAve();
 					grd.setGrade();
 					String res = String.format("| %s | %d | %d | %d | %d | %d | %s |",grd.getName(),grd.getKor(),grd.getEng(),grd.getMath(),grd.getTotal(),grd.getAve(),grd.getGrade());
 					studnets[cnt_grd] = grd;
 					cnt_grd++;
 					JOptionPane.showMessageDialog(null, res);
 					break;
 				case OUTPUT_GRADE :
 					String grdOutput = "| 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 학점 |\n";
 					for (int i=0;i<cnt_grd;i++) {
 					 grdOutput += studnets[i] + "\n";
 					}
 					JOptionPane.showMessageDialog(null, grdOutput);
 					break;
 				case INPUT_SALARY :
 					sal = new Salary();
 					String[] ind = {"부서","성명","본봉","수당"};
 					for (int i=0;i<4;i++) {
 						ind[i] = JOptionPane.showInputDialog(ind[i]);
 					}
 					sal.setDept(ind[0]);
 					sal.setName(ind[1]);
 					sal.setSal(Integer.valueOf(ind[2]));
 					sal.setBonus(Integer.valueOf(ind[3]));
 					sal.setTotal();
 					emp[cnt_sal] = sal;
 					JOptionPane.showMessageDialog(null, emp[cnt_sal].toString());
 					cnt_sal++;
 					break;
 				case OUTPUT_SALARY :
 					String salOutput = "";
 					for (int i=0;i<cnt_sal;i++) {
 						salOutput += emp[i].toString() + "\n";
 					}
 					JOptionPane.showMessageDialog(null, salOutput +"\n" + "부서합계 : " + sal.getSum());
 					break;
 				case Lotto : 
 					String lotto_res = "";
 					lot = new Lotto();
 					lot.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마?")));
 					lot.setCount();
 					lot.setResult();
 					JOptionPane.showMessageDialog(null, lot.toString());
 					break;
 				default : return;
			}
	}
	}
}

