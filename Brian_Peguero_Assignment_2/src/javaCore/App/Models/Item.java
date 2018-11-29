package javaCore.App.Models;

public class Item {
	private int id;
	private String name;
	private int quantity_in_stock;
	private double price;
	
	public Item(int id, String name, int quantity_in_stock, double price) {
		this.id = id;
		this.name = name;
		this.quantity_in_stock = quantity_in_stock;
		this.price = price;
	}
	
	public Item() {
		this.id = 0;
		this.name = "";
		this.quantity_in_stock = 0;
		this.price = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}

	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return this.name + " : " + this.price + " ";
	}
	
}
