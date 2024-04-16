package object;

public class Ex4 {

	public static void main(String[] args) {
		
		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book); // == book.toString()과 같음
		
		Book book2 = book;
		
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
	}

}

class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// source > generate tostring 메뉴
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

	
	// 함수의 원형은 메모리 주소를 반환!!
	// 오버라이드 시 객체의 정보를 반환!!
}