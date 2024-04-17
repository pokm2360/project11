package object;

public class Ex5 {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		
		System.out.println(str1.toString());
		System.out.println(str1);
		
		String str2 = new String("test");
		
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열입니다.");
		}
		// string 객체는 내용이 같으면 주소가 달라도 같은 객체 취급!!
		
		
	}

}
