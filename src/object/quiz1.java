package object;

public class quiz1 {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2024, 4, 16);
		MyDate date2 = new MyDate(2024, 4, 16);
		
		if (date1.equals(date2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		MyDate date3 = new MyDate(2024, 4, 16);
		MyDate date4 = new MyDate(2024, 4, 17);
		
		if (date3.equals(date4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

class MyDate {
	int year;
	int month;
	int date;
	
	public MyDate(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			
			if(this.year == date.year && this.month == date.month && this.date == date.date) {
				return true;
		}
	}
		return false;
	
	
	}
	

}	
	
