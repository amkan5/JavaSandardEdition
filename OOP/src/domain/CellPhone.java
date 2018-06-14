package domain;

public class CellPhone extends Phone{
	public static final String BRAND = "노키아", KIND = "휴대폰";
	private boolean portable;
	private String move;
	public void setMove(String move) {
		this.move = move;
	}
	public void setPortable(boolean portable) {
		if(portable) {
			setMove("이동 가능");
		}else {
			setMove("이동 불가능");
		}
		setMove((portable)?"이동가능":"이동불가능");
		this.portable = portable;
	}
	public boolean isPortable() {
		return portable;
	}
	public String getMove() {
		return move;
	}
	public String toString() {
		setPortable(true); // 이걸 메인메소드에서 안하고 toString에다가. 왜냐면 cellphone에서만 쓰니까
		return String.format("%s 에게 %s 번호로 %s %s제품 %s를 사용해서 %s 라고 통화했다", 
					super.getName(),
					super.getPhoneNum(),move,BRAND,KIND,
					super.getCall());
	}
}
