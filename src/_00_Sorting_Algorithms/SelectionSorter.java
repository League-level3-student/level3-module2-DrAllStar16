package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}

	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		// 1. make a for loop to iterate through all but the last
		// element of the array
		boolean isSorted = false;
		while (isSorted == false) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				int index = 1;
				for (int j = 0; j + 1 < array.length; j++) {
					if (array[j] < array[index]) {
						array[index] = j;
					}
					int first = array[i];
					int second = array[index];
					array[i] = second;
					array[index] = first;
					isSorted = false;
				}
			}
		}
		// 2. create an integer called index and set it equal to i

		// 3. make another for loop that starts at i + 1 and
		// goes through the entire array

		// 4. if the array element at j is less than the
		// element at index, then set index equal to j

		// 5. swap the array element at index with the array element at i

	}
}
