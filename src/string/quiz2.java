package string;

public class quiz2 {

	public static void main(String[] args) {
		String num = "881120-1068234";
		
		if (num.charAt(7) == '1' || num.charAt(7) == '3') {
			System.out.println("성별은 남자입니다");
		} else if (num.charAt(7) == '2' || num.charAt(7) == '4') {
			System.out.println("성별은 여자입니다");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
			
	}

}
