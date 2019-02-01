package com.akaliachka.behavioral.strategy;

import com.akaliachka.enums.SortingOrder;

/**
 * Bubble sort implementation
 */
public class BubbleSort implements ISortStrategy {

	/**
	 * Bubble sort. Complexity O(n^2)
	 * <p>
	 * {@inheritDoc}
	 */
	@Override
	public int[] sort(int[] arr, SortingOrder sortingOrder) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (sortingOrder == SortingOrder.ASCENDING ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				} // end of if
			} // end of forj
		} // end of fori
		return arr;
	}

	@Override
	public String toString() {
		return "BubbleSort";
	}
}
