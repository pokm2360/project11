package string;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		while (i>=0) {
			System.out.print("문장을 입력하세요:");
			String str = scanner.nextLine();
			
			if (str.equals("end") || str.equals("END")) {
				break;
			}
		}
	}

}
