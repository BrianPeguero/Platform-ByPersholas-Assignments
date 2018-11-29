package library;

public class KidUser implements LibraryUser{
	
	private int age;
	private String bookType;
	
	public KidUser(int age, String book) {
		this.age = age;
		this.bookType = book;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getBookType() {
		return this.bookType;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBookType(String book) {
		this.bookType = book;
	}
	
	public void registerAccount() {
		if (getAge() < 12) {
			System.out.println("You have successfully regitered under a kids account");
		} else {
			System.out.println("Sorry, your age must be less that 12 to register as a kd");
		}
	}

	public void requestBook() {
		if (getBookType().equals("Kids")) {
			System.out.println("Book issued successfully, please return in 10 days");
		} else {
			System.out.println("Oops, you're only allowed to take out kids books");
		}
		
	}

}
