package wrapper;

public class quiz1 {

	public static void main(String[] args) {
//		1번
		byte bNum = Byte.parseByte("10"); //"10" -> 10
		short sNum = Short.parseShort("10");
		int iNum = Integer.parseInt("10");
		long lNum = Long.parseLong("10");
		
		float fNum = Float.parseFloat("10.0"); //"10.0" -> 10.0
		double dNum = Double.parseDouble("10.0");
		
		Double double1 = Double.parseDouble("10.0"); // 오토박싱됨
		
		
//		Byte bNum = 10;
//		
//		Short sNum = 10;
//		
//		Integer iNum = 10;
//		
//		Long lNum = 10l;
//		
//		Float fNum = 10.0f;
//		
//		Double dNum = 10.0;
		
//		2번
		String str1 = Integer.toString(10); // 10 -> "10"

		String str2 = Double.toString(1.123); // 1.123 -> "1.123"
		
		String str3 = Character.toString('c'); // 'c' -> "c"
		
		String str4 = Boolean.toString(true); // true -> "true"
		
		
		String str5 = String.valueOf(10);
		
		String str6 = String.valueOf(1.123);
		
		String str7 = String.valueOf('c');
		
		String str8 = String.valueOf(true);
//		Character ch = 10;
//		
//		String str = "1.123";
//		
//		Character str2 = 'c';
//		
//		Boolean bool = true;
//		
//		System.out.println(str2);
	}

}
