/**
 * 문자열 거꾸로하기 */
package Example;
import java.util.Scanner;
public class example07 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String result = "";
		for (int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);
	}
}