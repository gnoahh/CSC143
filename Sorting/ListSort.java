/*********************************************
 * Program Name: ListSort
 * Description: This class will contain a createlist method which create an array list and stores
 * 				values inside, a selectionSort method which sorts the numbers in list in an
 * 				ascending number and returns the list, a main method which call the other 2 methods	
 * Author: Henry Do
 * Date created: 05/15/2018
 **********************************************/
package listing;

import java.util.ArrayList;

public class ListSort {
	public static ArrayList<Integer> createlist() {
		
		//Create an array list
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add elements into the list
		list.add(17);
		list.add(8);
		list.add(3);
		list.add(11);
		list.add(6);
		list.add(13);
		list.add(4);
		
		//return value
		return list;
	}
	

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){
		
		//algorithm to sort the list 
		for(int startIndex = 0; startIndex < list.size() - 1; startIndex++) {
			int currentMin = list.get(startIndex);
			int currentMinIndex = startIndex;
			for(int nextIndex = startIndex + 1; nextIndex < list.size(); nextIndex++) {
				if(currentMin> list.get(nextIndex)) {
					currentMin = list.get(nextIndex);
					currentMinIndex = nextIndex;
				}
			}
			if(currentMinIndex != startIndex) {
				list.set(currentMinIndex, list.get(startIndex));
				list.set(startIndex, currentMin);
			}
		}
		
		//return list after sorting 
		return list;
	}

	public static void main(String[] args) {
		
		//invoke the other 2 methods
		System.out.println(selectionSort(createlist()));
	}
}
