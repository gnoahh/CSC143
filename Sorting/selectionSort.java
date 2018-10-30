package listing;

public class selectionSort {

	public static double[] selectionSort(double[] list, int low, int high) {
		if(low < high) {
			swap(list, low, minIndex(list,low));
			selectionSort(list, low + 1, high);
			return list;
		}
	}
	
	public static void swap(double[] list, int Index1, int Index2) {
		double currentMin = list[Index1];
		list[Index1] = list[Index2];
		list[Index2] = currentMin;
	}
	
	public static int minIndex(double[] list, int Index) {
		int currentMinindex = 0;
		if(Index == list.length -1) {
			return Index;
			
		}
		currentMinindex = minIndex(list, Index + 1);
		if(list[currentMinindex] < list[Index]) {
			return currentMinindex;
		}else {
			return Index;
		}
	}
	public static void main(String[] args) {
		

	}

}
