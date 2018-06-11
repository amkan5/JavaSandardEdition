package domain;

public class Grade {
	int kor,eng,math,total,ave;
	String name,grade;
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setTotal() {
		total = kor+math+eng;
	}
	public void setAve() {
		ave = total/3;
	}
	public void setName(String name) {
	 this.name = name;
	}
	public void setGrade() {
		grade = "f";
		switch(ave/10) {
		 case 10 : case 9 : grade = "A"; break;
		 case 8 : grade ="B"; break;
		 case 7 : grade ="C"; break;
		 case 6 : grade ="D"; break;
		 case 5 : grade ="E"; break;
		 default : grade ="F"; break;
		}
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public int getAve() {
		return ave;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {	
		return grade;
	}
	public String toString() {
		return String.format("| %s | %d | %d | %d | %d | %d | %s |",name,kor,eng,math,total,ave,grade);
	}
}
