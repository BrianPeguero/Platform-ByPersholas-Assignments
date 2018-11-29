package library;

public class AdultUser implements LibraryUser {
	
	private int age;
	private String bookType;
	
	public AdultUser(int age, String book) {
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
		if (getAge() > 12) {
			System.out.println("You have successfully regitered under an adult account");
		} else {
			System.out.println("Sorry, your age must be greater that 12 to register as an adult");
		}
	}

	public void requestBook() {
		if (getBookType().equals("Fiction")) {
			System.out.println("Book issued successfully, please return in 7 days");
		} else {
			System.out.println("Oops, you're only allowed to take out fiction books");
		}
		
	}

}
