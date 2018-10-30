/*********************************************
 * Program Name: mergeSort
 * Description: This class contains 2 methods and 1 constructor. The main method will
 * 				call the constructor to create an array and send it to the insertionSort method 
 * 				to get it sorted and return the sorted array and print out
 * Author: Henry Do
 * Date created: 05/21/2018
 **********************************************/
package sorting;

public class InsertionSort {
	//Constructor creates array and call insertionSort to sort the array and then print out elements
	public InsertionSort() {
		int[] array = {2, 9, 5, 4, 8, 1, 6};
		int[] arrayresult = insertionSort(array);
		for(int i = 0; i < arrayresult.length; i++) {
			System.out.print(arrayresult[i] + "\t");
		}
		
		System.out.print("\n"  + linearSearch(array, 5));
	}
	
	//Sorting algorithm
	public int[] insertionSort(int[] a) {
		int currentElement;
		int j;
		int tempValue;
		for(int i = 1; i < a.length; i++) {
			currentElement = a[i];
			j = i - 1;
			while(j >= 0 && currentElement < a[j]) {
				tempValue = a[j];
				a[j] = a[j + 1];
				a[j + 1] = tempValue;
				j--;
			
			}
			
			
		}
		return a;
	}
	
	
	public int linearSearch(int[] a, int value) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				return i;
			}
		}
		return -1;
	}
	//main method calls the constructor
	public static void main(String[] args ) {
		new InsertionSort();
	}
}
