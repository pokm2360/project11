package wrapper;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String str2 = scan.nextLine();
		
		int sum = Integer.parseInt(str) + Integer.parseInt(str2); // int형으로 변환
		
		System.out.println("두 수의 합은 " + sum);
		System.out.println(str + str2);
	}

}
