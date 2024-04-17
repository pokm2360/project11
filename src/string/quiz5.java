package string;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
       
//        2
        int i = str.length() - 1;
        while(i>=0) {
        	System.out.print(str.charAt(i));
        	i--;
        }
//        3
        for (i=4;i>=0;i--) {
        	System.out.print(str.charAt(i));
        }
//		  4
        StringBuilder builder = new StringBuilder(str);
        
        builder.reverse(); // 문자열을 거꾸로 변경
        System.out.println(builder.toString());
        
	}

}
