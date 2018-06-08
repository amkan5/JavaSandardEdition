package step2;
/**
 [수열013]
항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음)
1+2+4+7+11+16+22+...순서로 나열되는
수열의 20번째 항까지의 합계
 * */

public class Seq013 {
	public static void main(String[] args) {
		int sum = 0, num=1, count=0;
		String result = "";
		for(int i=0;i<20;i++) {
		 num += i;
		 sum += num;
		 result += (i<20)? num+"+" : num + "=";
		}
		System.out.println(result+sum);
	}

}
