package wrapper;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		// 오토박싱 - list.add(new Character('a'))으로 변환됨.
		
		
		for (int i=0;i<list.size(); i++) {
			
			//list.get(i).charValue()으로 변환됨
			char ch = list.get(i); 
			System.out.println(ch);
		}
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}

}
