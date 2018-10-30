/*********************************************
 * Program Name: mergeSort
 * Description: This class will have 4 methods arranging elements in an array/arraylist/linkedlist in an ascending order
 * 				a main method calling the constructor to create, add elements into an array/arraylist/linkedlist 
 * 				and printing out the results afterwards	
 * Author: Henry Do
 * Date created: 05/17/2018
 **********************************************/
package sorting;

import java.util.ArrayList;

public class MergeSort {
	
	//A constructor to create an array/arraylist and call the mergeSort method to sort the array in
	//an ascending order
	public MergeSort() {
		int[] array = {10, 9, 8, 7, 6, 5};
		int[] result = mergeSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(result[i] + "\t");

		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer> ();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(13);
		list.add(10);
		System.out.print("The array list after getting sorted is: " + arraylistMergeSort(list));
	
	}
	
	//recursive method to call itself and create 2 new arrays to store parts of the main array
	public int [] mergeSort(int[] list) {
		if(list.length == 0){
			return null;
		}
			else if (list.length == 1) {
				return list;
			}
			else {
				int[] leftList = splitLeft(list);
				int[] rightList = splitRight(list);
				mergeSort(leftList);
				mergeSort(rightList);
				return merge(leftList, rightList, list);
				
			}
		}
		
	
	//This method is to create an array to store the first half of the main array
	public int [] splitLeft(int[] list) {
		int size = list.length/2;
		int[] leftList = new int[size];
		
		for(int i = 0; i < size; i++) {
			leftList[i] = list[i];
		}
		return leftList;
	}
		
	//This method is to split the main array
	public int [] splitRight(int[] list) {
		int halfSize = list.length/2;
		int size = list.length - (list.length/2);
		int[] rightList = new int[size];
		
		for(int i = 0; i < size; i++) {
			rightList[i] = list[halfSize + i];
		}
		return rightList;
	}
	
	
	//Arrange the elements according to the index
	public int[] merge(int[] left, int[] right, int[] temp) {
		int currentLeftIndex = 0;
		int currentRightIndex = 0;
		int currentTempIndex = 0;
		
		while(currentLeftIndex < left.length && currentRightIndex < right.length) {
			if(left[currentLeftIndex] < right[currentRightIndex]) {
				temp[currentTempIndex++] = left[currentLeftIndex++];
	
			}
			else {
				temp[currentTempIndex++] = right[currentRightIndex++];
			}
		
			
		}
		while(currentLeftIndex < left.length) {
			temp[currentTempIndex++] = left[currentLeftIndex++];
		}
		while(currentRightIndex < right.length) {
			temp[currentTempIndex++] = right[currentRightIndex++];
		}
		return temp;
	}
	
	//recursive method to call itself and create 2 new array lists to store parts of the main array list
	public ArrayList<Integer> arraylistMergeSort(ArrayList<Integer> list) {
		if(list.size() == 0){
			return null;
		}
			else if (list.size() == 1) {
				return list;
			}
			else {
				ArrayList<Integer> leftList = new ArrayList<Integer>();
				leftList.addAll(arraylistSplitLeft(list));
				ArrayList<Integer> rightList = new ArrayList<Integer>();
				rightList.addAll(arraylistSplitRight(list));
				arraylistMergeSort(leftList);
				arraylistMergeSort(rightList);
				return arraylistMerge(leftList, rightList, list);
				
			}
	
		}
		
	
	//This method is to create an array list to store the first half of the main array
	public ArrayList<Integer> arraylistSplitLeft(ArrayList<Integer> list) {
		int size = list.size()/2;
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i++) {
			leftList.set(i,list.get(i));
		}
		return leftList;
	}
		
	//This method is to create an array list to store the second half of the main array
	public ArrayList<Integer> arraylistSplitRight(ArrayList<Integer> list) {
		int halfSize = list.size()/2;
		int size = list.size() - (list.size()/2);
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i++) {
			rightList.set(i, list.get(halfSize + i));
		}
		return rightList;
	}
	
	//Arrange the elements according to the index
	public ArrayList<Integer> arraylistMerge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> temp) {
		int currentLeftIndex = 0;
		int currentRightIndex = 0;
		int currentTempIndex = 0;
		
		while(currentLeftIndex < left.size() && currentRightIndex < right.size()) {
			if(left.get(currentLeftIndex) < right.get(currentRightIndex)) {
				temp.set(currentTempIndex++, left.get(currentLeftIndex++));
	
			}
			else {
				temp.set(currentTempIndex++, left.get(currentRightIndex++));
			}
		
			
		}
		while(currentLeftIndex < left.size()) {
			temp.set(currentTempIndex++, left.get(currentLeftIndex++));
		}
		while(currentRightIndex < right.size()) {
			temp.set(currentTempIndex++, left.get(currentRightIndex++));
		}
		return temp;
	}
	
		//This main method is to call the constructor to make it run
	public static void main(String[] args) {
		new MergeSort();

	}
	
}
