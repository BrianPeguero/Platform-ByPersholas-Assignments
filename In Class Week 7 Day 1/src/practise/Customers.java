package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Customers {
	private HashMap<Integer, Customer> collection = new HashMap<Integer, Customer>();

	public HashMap<Integer, Customer> getCollection() {
		return collection;
	}

	public void setCollection(HashMap<Integer, Customer> collection) {
		this.collection = collection;
	}

	public void add(int id, String fName, String lName) {
		collection.put(id, new Customer(id, fName, lName));
	}

	public void delete(int id) {
		collection.remove(id);
	}

	public void update(int id, String fName, String lName) {
		collection.get(id).setFirstName(fName);
		collection.get(id).setLastName(lName);
	}

	public void show(int id) {
		System.out.println(collection.get(id).toString());
		
		
	}

	public void showAll() {
		Iterable<Integer> keys =  collection.keySet();
		
		for(Integer i : keys) {
			System.out.println(collection.get(i).toString());
		}
	}

	class Customer {
		private int id;
		private String firstName;
		private String lastName;
		
		

		public Customer(int id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public long getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String toString() {
			return firstName + " : " + lastName + " : " + id;
			
		}

	}
	
	public static String getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What would you like to do?");
		System.out.println("\"add\", \"delete\", \"update\", \"show\", \"show all\", \"exit\"");
		String choice = br.readLine();
		
		return choice;
	}
	
	public static int newCustomerId() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Id number: ");
		int id = Integer.parseInt(br.readLine());
		
		return id;
	}
	
	public static String newCustomerFName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter first name: ");
		String fName = br.readLine();
		
		return fName;
	}
	
	public static String newCustomerLName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter last name: ");
		String lName = br.readLine();
		
		return lName;
	}
	
	public static void menu(Customers custCollection) throws IOException {
		String choice = getInput();
		
		while(!choice.equals("exit")) {
			switch(choice) {
			case "add":
				int id = newCustomerId();
				String fName = newCustomerFName();
				String lName = newCustomerLName();
				custCollection.add(id, fName, lName);
				break;
			case "delete":
				int deleteId = newCustomerId();
				custCollection.delete(deleteId);
				break;
			case "update":
				int updateId = newCustomerId();
				String updateFName = newCustomerFName();
				String updateLName = newCustomerLName();
				custCollection.update(updateId, updateFName, updateLName);
				break;
			case "show":
				int showId = newCustomerId();
				custCollection.show(showId);
				break;
			case "show all":
				custCollection.showAll();
				break;
			}
			
			choice = getInput();
		}
	}

	public static void main(String[] args) {
		Customers custCollection = new Customers();
		try {
			menu(custCollection);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
