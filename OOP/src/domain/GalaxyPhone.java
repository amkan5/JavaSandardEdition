package domain;
public class GalaxyPhone extends IPhone {
	public static final String BRAND="삼성",KIND="갤럭시";
	private String size;
	//%s 에게 %s 번호로 %s %s제품 %s %s를 사용해서 %s
			// 홍길동에게 010 번호로 이동가능한 삼성제품  6인치 갤럭시을 사용해서
			// 안녕(data)이라고 카톡했다.
			// data를 오버라이딩하세요??? 
	public void setSize () {
		this.size = "6인치";
	}
	public String getSize() {
		return size;
	}
	public void setData(String data) {
		super.data = data +"이라고 카톡했다";
	}
	public String toString() {
		super.setPortable(true);
		return String.format("%s에게 %s번호로 %s %s 제품 %s %s를 사용해서 %s",
				super.getName(),
				super.getPhoneNum(),
				super.getMove(),BRAND,size,KIND,
				super.getData());
	}
	
}
