package slide25;

public class Slide25 {
	
	 class Person{
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public void introduce() {
			System.out.println("Hello, my name is " 
								+ getName() + 
								" and I am " + getAge() 
								+ " years old.");
		}
		
		
	}
	 public static void main(String[] args) {
		Slide25 slide = new Slide25();
		Person person = slide.new Person();
		
		person.setName("Peter");
		person.setAge(21);
		person.introduce();
	}
	

}
