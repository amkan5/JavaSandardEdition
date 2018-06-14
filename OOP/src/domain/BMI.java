package domain;

public class BMI {
	String name,result = "";
	double height,weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setResult() {
		double bmi = weight/((height*0.01)*(height*0.01));
		result = "비만3단계";
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
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		/*return String.format("%s, %f mm, %f kg, %s", name, height, weight, result);*/
		return "";
	}
}
