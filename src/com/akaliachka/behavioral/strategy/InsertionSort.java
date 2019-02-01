package com.akaliachka.behavioral.strategy;

import com.akaliachka.enums.SortingOrder;

/**
 * Insertion sort implementation
 */
public class InsertionSort implements ISortStrategy {

	/**
	 * Insertion sort. Complexity O(n^2) in the worst case, O(n) in the best
	 * <p>
	 * {@inheritDoc}
	 */
	@Override
	public int[] sort(int[] arr, SortingOrder sortingOrder) {
		if (sortingOrder == SortingOrder.ASCENDING) {
			for (int i = 1; i < arr.length; i++) {
				for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
					if (arr[j - 1] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					} // end of if
				} // end of forj
			} // end of fori
		} else {
			for (int i = 1; i < arr.length; i++) {
				for (int j = i; j > 0 && arr[j - 1] < arr[j]; j--) {
					if (arr[j - 1] < arr[j]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					} // end of if
				} // end of forj
			} // end of fori
		}

		return arr;
	}

	@Override
	public String toString() {
		return "Insertion Sort";
	}
}
