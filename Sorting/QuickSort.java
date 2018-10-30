/*********************************************
 * Program Name: mergeSort
 * Description: This class contains 2 methods and one constructor. The main method simply calls the constructor to create an array
 * 				and call the quickSort method to do the sorting thing, then it will print out the elements. The quickSort method
 * 				will take the midpoint of the array as a pivot and sort elements accordingly (smaller values on the left, larger values
 * 				on the right)
 * Author: Henry Do
 * Date created: 05/21/2018
 **********************************************/
package sorting;

public class QuickSort {

	//Constructor creates an array and sends it to the quickSort method to get it sorted
	public QuickSort() {
		int[] list = {5, 2, 9, 3, 8, 0, 4, 1, 6, 7};
		quickSort(list, 0, list.length -1);
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		
	}
	
	//This method contains the sorting algorithm of quick sort
	public void quickSort(int[] array, int left, int right) {
		
		//Set up the "walls"
		int i = left;
		int j = right;
		
		//Create a pivot 
		int pivot = (i + j)/2;
		//Temporary value
		int temp;
		
		//While loop runs until the "walls"  reach the pivot
		while(i <= j) {
			while(array[i] < pivot) {
				i++;
			}
		
			while(array[j] > pivot) {
				j--;
			}
			
			//Switch values
			if(i <= j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
	
		//Recursion to sort the rest of the list
		if(left < j) {
			quickSort(array, left, j);
		}
		
		if(i < right) {
			quickSort(array,i, right);
		}
	}
	
	//main method calls the constructor
	public static void main(String[] args) {
		new QuickSort();

	}

}
