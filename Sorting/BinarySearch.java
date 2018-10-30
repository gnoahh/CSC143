
/*********************************************
 * Program Name: BinarySearch
 * Description: This class contains 2 methods and 1 constructor. The main method will
 * 				call the constructor to create an array, send it and the key value to the binarySearch method. That method finds the
 * 				index of the key value and returns it. Once the constructor receives the returned index it will print out.
 * Author: Henry Do
 * Date created: 05/21/2018
 **********************************************/
package sorting;

public class BinarySearch {
	
	
	public BinarySearch() {
		//Create a sorted array
		int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		//Print out the index of the key value
		System.out.println(binarySearch(array, 2));
		System.out.println(binarySearch(array, 3));
		System.out.println(binarySearch(array, 4));
		System.out.println(binarySearch(array, 5));
		System.out.println(binarySearch(array, 6));
		System.out.println(binarySearch(array, 7));
		
	}
	
	public int binarySearch(int[] array,int value) {
		
		//Initialize first, mid, and last value
		int first = 0;
		int last = array.length - 1;
		int mid;
		
		//A loop dividing the array into to a lower and upper array
		//It will gradually search for the key value in the lower or upper array
		while(first <= last) {
			mid = (last + first)/2;
			if(value < array[mid]) {
				last = mid - 1;
			}else if(value == array[mid]) {
				//return the value if found at the mid point
				return mid;
			}else {
				first = mid + 1;
			}
		}	
		
		//return -1 if the key value is not in the array
		return -1;
	}
	public static void main(String[] args) {
		new BinarySearch();

	}

}
