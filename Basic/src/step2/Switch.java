package step2;

/**
 * [수열011] 1-2+3-4+5-6...-100 = -50 합계가 답
 */
public class Switch {
	public static void main(String[] args) {
		int sum = 0;
		String result = "";
		for (int i = 1; i <= 100; i++) {
				switch (i % 2) {
				case 0:
					result += (i==100)? i+"=" : i + "+";
					sum -= i;
					break;
				default:
					result +=  i + "-";
					sum += i;
					break;
			}
		}
		System.out.println(result+sum);
	}

}
