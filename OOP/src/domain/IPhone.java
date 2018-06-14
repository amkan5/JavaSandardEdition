package domain;

public class IPhone extends CellPhone {
	public static final String BRAND = "애플", KIND = "스마트폰";
	protected String data;
	public void setData(String data) {
		this.data = data+"이라고 문자했다";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		//%s 에게 %s 번호로 %s %s제품 %s를 사용해서 %s 라고 통화했다
		// 홍길동에게 010 번호로 이동가능한 애플제품 아이폰을 사용해서
		// 안녕(data)이라고 문자를 전송했다.
		super.setPortable(true);
		return String.format("%s에게 %s 번호로 %s %s제품 %s를 사용해서 %s",
				super.getName(),
				super.getPhoneNum(),
				super.getMove(),BRAND,KIND,
				data);
	}
}
