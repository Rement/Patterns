package com.akaliachka.behavioral.strategy;

import com.akaliachka.enums.SortingOrder;

/**
 * Interface for sorting strategies
 */
public interface ISortStrategy {

	/**
	 * Array sorting method with pre-defined order
	 *
	 * @param arr Array to be sorted
	 * @param sortingOrder Sorting order, defined as ENUM
	 * @return sorted array
	 */
	int[] sort(int[] arr, SortingOrder sortingOrder);
}
