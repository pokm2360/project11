package string;

public class quiz3 {

	public static void main(String[] args) {
		
		String str = "자바 프로그래밍 입문";
		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') { // 공백이 아니면 숫자 증가
				cnt++;
			}
		}
		System.out.println(str.length());
		System.out.println(cnt);
	}

}
