package string;

public class quiz4 {

	public static void main(String[] args) {
		getCharCount("자바 프로그래밍 입문");
		getCharCount("equals 메소드는 두 객체가 같은지 비교한다");
	}

	private static void getCharCount(String s1) {
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') { // 공백이 아니면 숫자 증가
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
