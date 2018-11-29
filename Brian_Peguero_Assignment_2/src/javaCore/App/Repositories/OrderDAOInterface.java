package javaCore.App.Repositories;

import java.util.Map;

public interface OrderDAOInterface {
	
	/**
	 * returns if the query executed correctly
	 * 
	 * @param order  Map<Integer, Integer>
	 * 
	 * @return 
	 */
	public boolean createOrder(Map<Integer, Integer> order);

}