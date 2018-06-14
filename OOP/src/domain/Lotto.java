package domain;
/*
 * 로또볼 추첨
 * 1~45까지 랜덤숫자
 * 볼갯수는 총 6개
 * 중복 불허
 * 출력은 {5,23,2,40,19,22}
 * 얼마치를 구입하십니까? (천원에 한바퀴)
 * 한줄당 랜덤숫자가 나와야해 ^^;
 * **/
public class Lotto {
	int money,count;
	int[][] balls = new int[10][6];
	int[] ball = new int[6];
	String result;
	public void setMoney(int money) {
		this.money = money;
	}
	public void setCount() {
		count = money/1000;
	}
	public void setBall() {
		for(int i=0;i<6;i++) {
			ball[i] = (int)(Math.random()*45);
			}
	}
	public void setResult() {
		for(int i=0;i<6;i++) {
			result += String.valueOf(balls[i]);
		}
	}
	public int getMoney() {
		return money;
	}
	public int getCount() {
		return count;
	}
	public int[] getBall(){
		return ball;
	}
	public String getResult() {
		return result;
	}
	public String toString() {
		return String.format("%d %d %d %d %d %d",balls[0],balls[1],balls[2],balls[3],balls[4],balls[5]);
	}
	
}
