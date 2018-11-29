package jdbc;

import java.util.List;

public interface ItemInterface {
	
	enum SQl{
		GET_ITEM_BY_ID ("SELECT * FROM item WHERE id=?"),
		GET_ITEM_GREATER_THAN ("SELECT * FROM item WHERE price>?"),
		GET_ITEMS_IN_STOCK ("SELECT * FROM itmes WHERE quantity_in_stock>0");
		
		private final String query;
		
		SQl(String query) {
			this.query = query;
		}
		
		public String getQuery() {
			return query;
		}
		
	}
	
	public Item getItemById(int item);
	public List<Item> getItemsCostingGreaterThan(double price);
	public List<Item> getItemsInStock();
	
	
}
