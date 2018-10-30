/*********************************************
 * Program Name: LinearSearch
 * Description: This class contains 2 methods and 1 constructor. The main method will
 * 				call the constructor to create an array, send it and send the number
 * 				that user would like to find to the linearSearch method. This method will search
 * 				for the number in the list and spit out the index of it in the array
 * Author: Henry Do
 * Date created: 05/21/2018
 **********************************************/
package sorting;

public class LinearSearch {
	
	
	public int linearSearch(int[] a, int value) {
		//If the key value is found in the array, it will return the index of the key value
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				return i + 1;
			}
		}
		
		//If not return -1
		return -1;
	}
	public LinearSearch() {
		
		//Create an array and find different values in the array
		int[] array = {1, 4, 2, 5, 0, 2, 3, 6, 4, 8};
		System.out.println(linearSearch(array, 5));
		System.out.println(linearSearch(array, 11));
	}
	public static void main(String[] args) {
		new LinearSearch();

	}

}
