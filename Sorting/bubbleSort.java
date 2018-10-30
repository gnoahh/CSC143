/*********************************************
 * Program Name: bubbleSort
 * Description: This class will have 3 methods arranging elements in an array/arraylist/linkedlist in an ascending order
 * 				a main method calling the constructor to create, add elements into an array/arraylist/linkedlist 
 * 				and printing out the results afterwards	
 * Author: Henry Do
 * Date created: 05/17/2018
 **********************************************/
package sorting;

import java.util.ArrayList;
import java.util.LinkedList;

public class bubbleSort {

	//create an array, array list, linked list and then call other methods
	//to arrange the elements in an ascending order and print out the new arranged array/arraylist/linkedlist
	public bubbleSort() {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2};
		System.out.println("Elements in the sorted array are: ");
		for(int i = 0; i < arrayBubbleSort(a).length; i++) {
			System.out.print(arrayBubbleSort(a)[i] + "\t");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer> ();
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		System.out.println("Elements in the sorted list are: " + arraylistBubbleSort(list));
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(10);
		linkedlist.add(9);
		linkedlist.add(8);
		linkedlist.add(7);
		linkedlist.add(6);
		System.out.println("Elements in the sorted linked list are: " + linkedlistBubbleSort(linkedlist));
	}
	//This method is to arrange an array in an ascending order
	public int[] arrayBubbleSort(int[] a) {
		int temporaryvalue = 0;

		for(int i = 1; i < a.length; i++) {
			for(int j = 0; j < a.length - 1; j++) {
				if(a[j] > a[j + 1]) {
					temporaryvalue = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temporaryvalue;
				}
			}

		}
		return a;
	}
	
	//This method is to arrange an array list in an ascending order
	public ArrayList<Integer> arraylistBubbleSort(ArrayList<Integer> a) {
		int temporaryvalue = 0;
		for(int i = 1; i < a.size(); i++) {
			for(int j = 0; j < a.size() - 1; j++) {
				if(a.get(j) > a.get(j + 1)) {
					temporaryvalue = a.get(j);
					a.set(j, a.get(j + 1));
					a.set(j + 1, temporaryvalue);
				}
			}

		}
		return a;
	}
	
	//This method is to arrange a linked list in an ascending order
	public LinkedList<Integer> linkedlistBubbleSort(LinkedList<Integer> a){
		int temporaryvalue = 0;
		for(int i = 1; i < a.size(); i++) {
			for(int j = 0; j < a.size() - 1; j++) {
				if(a.get(j) > a.get(j + 1)) {
					temporaryvalue = a.get(j);
					a.set(j, a.get(j + 1));
					a.set(j + 1, temporaryvalue);
				}
			}

		}
		return a;
	}
	
	
	public static void main(String[] args) {
		new bubbleSort();

	}

}
