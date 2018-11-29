package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemsImplement extends AbstractDAO implements ItemInterface{

	
	/**
	 * retrieves an item object from the database and returns its by its ID number
	 * 
	 * @param itemID  type int 
	 * 
	 * @return item  type Item
	 */
	@Override
	public Item getItemById(int itemID) {
		Item item = null;
		connection();
		try {
			
			ps = conn.prepareStatement(SQl.GET_ITEM_BY_ID.getQuery());
			ps.setInt(1, itemID);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				item = new Item(rs.getInt(0), rs.getString(1), rs.getInt(2), rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			System.out.println("couldn't get the item");
			
		} finally {
			dispose();
		}
		
		return item;
	}

	
	/**
	 * retrieves from the database a list of all items with a price greater than 
	 * the double passed in
	 * 
	 * @param price  Double
	 * @return itemList  List<Item>
	 */
	@Override
	public List<Item> getItemsCostingGreaterThan(double price) {
		List<Item> itemList = new ArrayList<Item>();
		
		try {
			ps = conn.prepareStatement(SQl.GET_ITEM_GREATER_THAN.getQuery());
			ps.setDouble(1, price);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				itemList.add(new Item(rs.getInt(0), rs.getString(1), rs.getInt(2), rs.getDouble(3)));
			}
		} catch (SQLException e) {
			System.out.println("Couldn't find any");
		} finally {
			dispose();
		}
		
		return itemList;
	}
	
	
	/**
	 * retrieves from the database a list of all items whose quantity_in_stock field is greater than 0
	 * 
	 * @return itemList  ListItem
	 */
	@Override
	public List<Item> getItemsInStock() {
		List<Item> itemList = new ArrayList<Item>();
		
		connection();
		
		try {
			ps = conn.prepareStatement(SQl.GET_ITEMS_IN_STOCK.getQuery());
			rs = ps.executeQuery();
			
			while (rs.next()) {
				itemList.add(new Item(rs.getInt(0), rs.getString(1), rs.getInt(2), rs.getDouble(3)));
			}
			
		} catch(Exception e) {
			System.out.println("Can't");
		} finally {
			dispose();
		}
		return itemList;
	}
}
