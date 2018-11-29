package prob3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SimpleMenu {
	
	
	/**
	 * The method uses a buffered reader to get the integer value of the choice they want
	 * 
	 * @return choice  String
	 * @throws IOException
	 * */
	public static int getInput(BufferedReader br) {
		int choice;
		
		try {
			System.out.println("What would you like to do?\n0. Quit\n1. Add to cart\n2. Show contents of cart\n");
			choice = Integer.parseInt(br.readLine());
		} 
		catch(IOException e) {
			System.out.println("Didnt catch that can you try again?\n");
			choice = getInput(br);
		} catch (NumberFormatException e) {
			System.out.println("Didnt catch that can you try again?\n");
			choice = getInput(br);
		}
		
		return choice;
	}
	
	/**
	 * The method processes the users request until they type in 0 to quit 
	 * while it not 0 it will continue to ask the user if they would like 
	 * to add more products to the cart which item and finally add it or 
	 * display it to the console
	 * 
	 * @param cart  HashMap<String, Integer> holding 5 items to display to change the quantity of
	 * @throws IOException 
	 * */
	public static void process(BufferedReader br, Map<String, Integer> cart) throws IOException {
		int choice;
		
		while((choice = getInput(br)) != 0) {
			if (choice == 1) {
				cart = addToCart(br, cart);
			} else if(choice == 2) {
				displayCart(cart);
			}
		}
		
		br.close();
	}
	
	
	
	public static void displayCart(Map<String, Integer> cart){
		Iterable<String> keys = cart.keySet();
		
		for (String i : keys) {
			System.out.println(i + " : " + cart.get(i));
		}
		
		System.out.println("");
	}
	
	/**
	 * @throws IOException 
	 * @throws NumberFormatException */
	public static Map<String, Integer> addToCart(BufferedReader br, Map<String, Integer> cart) throws NumberFormatException, IOException{
		int choice;
		
		try {
			System.out.println("What would you like to add to the cart?\n1. Hamburger \n2. Hot Dogs \n3. Sandwiches \n4. Soda \n5. Fries ");
			choice = Integer.parseInt(br.readLine());
			switch(choice) {
				case 1:
					cart = howMany(br, cart, "Hamburger");
					break;
				case 2:
					cart = howMany(br, cart, "Hot Dogs");
					break;
				case 3:
					cart = howMany(br, cart, "Sandwiches");
					break;
				case 4:
					cart = howMany(br, cart, "Soda");
					break;
				case 5:
					cart = howMany(br, cart, "Fries");
					break;
			}
		} 
		catch(IOException e) {
			System.out.println("Didnt catch that can you try again?\n");
			addToCart(br, cart);
		} catch (NumberFormatException e) {
			System.out.println("Didnt catch that can you try again?\n");
			addToCart(br, cart);
		}
		
		return cart;
	}
	
	public static String getHowMany(BufferedReader br) throws IOException{
		String howMany;
		
		try {
			System.out.println("How Many would you like to put in?");
			howMany = br.readLine();
		} 
		catch(IOException e) {
			System.out.println("Didnt catch that can you try again?\n");
			howMany = getHowMany(br);
		} catch (NumberFormatException e) {
			System.out.println("Didnt catch that can you try again?\n");
			howMany = getHowMany(br);
		}
		
		return howMany;
	}
	
	/**
	 * 
	 * 
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * */
	public static Map<String, Integer> howMany(BufferedReader br, Map<String, Integer> cart, String key) throws NumberFormatException, IOException {
		String howMany;
		int quantity;

		try {
			howMany = getHowMany(br);
			quantity = Integer.parseInt(howMany);
			int value = cart.get(key) + quantity;
			cart.put(key, value);
		} 
		catch(IOException e) {
			System.out.println("Didnt catch that can you try again?\n");
			howMany = getHowMany(br);
			quantity = Integer.parseInt(howMany);
			int value = cart.get(key) + quantity;
			cart.put(key, value);
		} catch (NumberFormatException e) {
			System.out.println("Didnt catch that can you try again?\n");
			howMany = getHowMany(br);
			quantity = Integer.parseInt(howMany);
			int value = cart.get(key) + quantity;
			cart.put(key, value);
		}
		
		return cart;
	}
	
	/**
	 * The method populates the HashMap with initial values and returns them
	 * 
	 * @param cart  HashMap<String, Integer>
	 * 
	 * @return cart  HashMap<String, Integer>
	 * */
	public static Map<String, Integer> populateCart(Map<String, Integer> cart){
		cart.put("Hamburger", 0);
		cart.put("Hot Dogs", 0);
		cart.put("Sandwiches", 0);
		cart.put("Soda", 0);
		cart.put("Fries", 0);
		
		return cart;
	}

	public static void main(String[] args) throws IOException {
		Map<String, Integer> cart = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		cart = populateCart(cart);
		
		process(br, cart);
		
		
	}

}
