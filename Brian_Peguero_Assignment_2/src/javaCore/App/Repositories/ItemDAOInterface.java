package javaCore.App.Repositories;

import java.util.List;

import javaCore.App.Models.Item;

public interface ItemDAOInterface {
	
	/**
	 * Returns a list of items where items in stock is greater than 0.
	 * 
	 * @return List<Item>
	 */
	public List<Item> getItemsInStock();
	
	/**
	 * The quantity of items is updated based on the item id
	 * 
	 * @param id
	 * @param newQuantityInStock
	 * 
	 * @return boolean
	 */
	public boolean updateQuantityInStock(int id, int newQuantityInStock);
}
