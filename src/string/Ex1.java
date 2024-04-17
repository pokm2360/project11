package string;

public class Ex1 {

	public static void main(String[] args) {
		
//		리터럴 방식으로 문자열 객체 생성
		String str1 = "test";
		String str2 = "test";
		
//		new 방식으로 문자열 객체 생성 - 생성할 때 마다 인스턴스가 새로 생성됨
		String str3 = new String("test");
		
		System.out.println(str1 == str2); // 같은 객체를 공유
		System.out.println(str1 == str3);
		
		System.out.println(str1.hashCode()); // 주소값을 확인할 때 사용(String메소드는 값을 재정의하기 때문에 해당 방식을 사용해야 주소값을 확인할 수 있음)
	}

}
