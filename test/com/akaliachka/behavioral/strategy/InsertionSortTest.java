package com.akaliachka.behavioral.strategy;

import com.akaliachka.enums.SortingOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class InsertionSortTest {

	private InsertionSort insertionSort;
	private int[] array;

	@BeforeEach
	void setUp() {
		insertionSort = new InsertionSort();
		array = new int[]{0, -3, 7, 18, 2};
	}

	@Test
	void sortEmpty() {
		int capacity = 4;
		int[] emptyArray = new int[capacity];
		assertArrayEquals("Empty array sort: ", new int[capacity], insertionSort.sort(emptyArray, SortingOrder.ASCENDING));
	}

	@Test
	void sortAscending() {
		assertArrayEquals("Insertion ascending sort: ", new int[]{-3, 0, 2, 7, 18}, insertionSort.sort(array, SortingOrder.ASCENDING));
	}

	@Test
	void sortDescending() {
		assertArrayEquals("Insertion descending sort: ", new int[]{18, 7, 2, 0, -3}, insertionSort.sort(array, SortingOrder.DESCENDING));
	}
}