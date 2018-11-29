package week4day4;

public class ExceptTheIndexOf {
	
	public static int recursive(int[] list, int index) {
		if(index <= list.length-1) {
			return list[index] * recursive(list, index++);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] list1 = {8, 10, 2};
		int[] list2 = {2, 7, 3, 4};
		
		int[] newList1 = new int[3];
		
		for(int i = 0; i <= list1.length; i++) {
			int temp = 1;
			int index = 0;
			list1[i] = temp;
			newList1[i] = recursive(list1, index);
		}
		
		int count = 0;
		int runningTotal = 0;
		
		
		
	}

}
