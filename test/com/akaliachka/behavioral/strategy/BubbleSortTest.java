package com.akaliachka.behavioral.strategy;

import com.akaliachka.enums.SortingOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class BubbleSortTest {

	private BubbleSort bubbleSort;
	private int[] array;

	@BeforeEach
	void setUp() {
		bubbleSort = new BubbleSort();
		array = new int[]{0, -3, 7, 18, 2};
	}

	@Test
	void sortEmpty() {
		int capacity = 4;
		int[] emptyArray = new int[capacity];
		assertArrayEquals("Empty array sort: ", new int[capacity], bubbleSort.sort(emptyArray, SortingOrder.ASCENDING));
	}

	@Test
	void sortAscending() {
		assertArrayEquals("Bubble ascending sort: ", new int[]{-3, 0, 2, 7, 18}, bubbleSort.sort(array, SortingOrder.ASCENDING));
	}

	@Test
	void sortDescending() {
		assertArrayEquals("Bubble descending sort: ", new int[]{18, 7, 2, 0, -3}, bubbleSort.sort(array, SortingOrder.DESCENDING));
	}
}