package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList class
 * 
 * @author brian
 * */

public class Assignment4 {
	
	/**
	 * appends an element to the end of the linked list
	 * */
	public static void append(List<Integer> list, int value) {
		list.add(value);
	}
	
	/**
	 * The method iterates over the elements of the linked list
	 * */
	public static void iterate(List<Integer> list) {
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
	
	/**
	 * The method iterates over the elements of the linked list 
	 * starting at a position if it exists.
	 * */
	public static void iterateAt(List<Integer> list, int index) {
		if(index <= list.size()) {
			for (; index < list.size(); index++) {
				System.out.println(list.get(index));
			}
		} else {
			System.out.println("Sorry couldn't do");
		}
	}
	
	/**
	 * The method iterates over the linked list in reverse order
	 * 
	 * */
	public static void iterateReverse(List<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
	
	/**
	 * The method inserts an element at the specified location
	 * 
	 * @param element  Integer
	 * @param position Integer
	 * 
	 * @return list  updated version of the list
	 * */
	public static List<Integer> insert(List<Integer> list, int position, int element) {
		if(position <= list.size()) {
			list.add(position, element);
		} else {
			System.out.println("sorry not happening... out of bounds");
		}
		
		return list;
	}
	
	/**
	 * adds the first parameter passed in to the beginning of the list 
	 * and the second parameter to the end returns an updates version of the list
	 * 
	 * @param list  LinkedList
	 * @param first  integer to insert to the beginning of the list
	 * @param last  integer to insert to the end of the list
	 * 
	 * @return list  updated LinkedList
	 * */
	public static List<Integer> firstAndLast(List<Integer> list, int first, int last){
		list.add(0, first);
		list.add(last);
		
		return list;
	}
	
	/**
	 * adds an element to the beginning of the list
	 * 
	 * @param list  LinkedList
	 * @param element  integer 
	 * 
	 * @return list  an updated version of the LinkedList
	 * */
	public static List<Integer> insertAtFirst(List<Integer> list, int element){
		list.add(0, element);
		
		return list;
	}
	
	/**
	 * adds an element to the end of the list
	 * 
	 * @param list  LinkedList
	 * @param element  integer 
	 * 
	 * @return list  an updated version of the LinkedList
	 * */
	public static List<Integer> insertAtEnd(List<Integer> list, int element){
		list.add(element);
		
		return list;
	}
	
	/**
	 * method adds and array of elements to the list
	 * 
	 * @param list  List<Integer>
	 * @param index integer
	 * @param elements  int[]
	 * 
	 * @return list  an updated version of the list 
	 * */
	public static List<Integer> insertElementsAtIndex(List<Integer> list, int index, int[] elements){
		for(int i : elements) {
			list.add(index++, i);
		}
		
		return list;
	}

	/**
	 * The method finds the first and last occurrence of the element in the list
	 * 
	 * @param list  List<Integer>
	 * @param element  integer
	 * */
	public static void firstAndLastOccurance(List<Integer> list, int element) {
		int first = 0;
		int last = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == element && first == 0) {
				first = i;
			} else if(list.get(i) == element && last == 0) {
				last = i;
			}
		}
		
		if (first == 0) {
			System.out.println("Couldn't find any occurences of the element");
		} else if (last == 0) {
			System.out.println("only found the element at " + first);
		}
	}
	
	/**
	 * removes the first and last elements of the list
	 * 
	 * @param list List<Integer>
	 * 
	 * @return list 
	 * */
	public static List<Integer> removeFirstAndLast(List<Integer> list){
		list.remove(0);
		list.remove(list.size()-1);
		
		return list;
	}
	
	/**
	 * removes all elements of the list
	 * 
	 * @param list List<Integer>
	 * 
	 * @return list 
	 * */
	public static List<Integer> removeAll(List<Integer> list){
		for(int i = list.size() - 1 ; i >= 0; i--) {
			list.remove(i);
		}
		
		return list;
	}
	
	/**
	 * Swaps two elements in the list
	 * */
	public static List<Integer> swap(List<Integer> list, int index1, int index2){
		list.add(1); list.add(2);list.add(10); list.add(3);list.add(5); list.add(6);
		
		int temp1 = list.get(index1);
		int temp2 = list.get(index2);
		
		list.remove(index1);
		list.add(index1, temp2);
		
		list.remove(index1);
		list.add(index2, temp1);
		
		return list;
	}
	
	/**
	 * converts the List to an ArrayList
	 * */
	public static ArrayList<Integer> convert(List<Integer> list) {
		ArrayList<Integer> aList = new ArrayList<>();
		
		for (int i : list) {
			aList.add(i);
		}
		
		return aList;
	}
	
	/**
	 * evaluates if its empty or not
	 * */
	public static boolean isEmpty(List<Integer> list) {
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		append(list, 8);
		append(list, 2);
		append(list, 10);
		append(list, 12);
		iterate(list);
		iterateAt(list, 2);
		iterateReverse(list);
		list = insert(list, 4, 3);
		list = firstAndLast(list, 3, 6);
		list = insertAtFirst(list, 1);
		list = insertAtEnd(list, 5);
		int[] newElements= {1, 3, 4, 5};
		list = insertElementsAtIndex(list, 3, newElements);
		firstAndLastOccurance(list, 1);
		list = removeFirstAndLast(list);
		list = removeAll(list);
		list = swap(list, 0, 3);
		convert(list);
		isEmpty(list);
	}

}
