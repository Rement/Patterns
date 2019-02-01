package com.akaliachka.behavioral.strategy;

import com.akaliachka.enums.SortingOrder;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortContext {

	private ISortStrategy sortStrategy;

	private int[] array;

	private SortingOrder sortingOrder;

	public SortContext(ISortStrategy sortStrategy, int[] array, SortingOrder sortingOrder) {
		this.sortStrategy = sortStrategy;
		this.array = array;
		this.sortingOrder = sortingOrder;
	}

	public ISortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public SortingOrder getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(SortingOrder sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	/**
	 * Implement STRATEGY
	 */
	private void sortStratagyImplementation() {
		getSortStrategy().sort(array, sortingOrder);
	}

	@Override
	public String toString() {
		return "SortContext{" +
				"sortStrategy=" + sortStrategy +
				", array=" + Arrays.toString(array) +
				", sortingOrder=" + sortingOrder +
				'}';
	}

	public static void main(String[] args) {
		// Bubble sort ASCENDING
		SortContext sortContext = new SortContext(new BubbleSort(), generateNLengthIntArray(10), SortingOrder.ASCENDING);
		System.out.println("Context object before modifying: " + sortContext);
		sortContext.sortStratagyImplementation();
		System.out.println("Context objecti after ascending sort: " + sortContext);

		// Bubble sort DESCENDING
		sortContext.setArray(generateNLengthIntArray(10));
		sortContext.setSortingOrder(SortingOrder.DESCENDING);

		System.out.println("New array generation...");
		System.out.println("Changing sorting order...");
		System.out.println("Context object before modifying: " + sortContext);
		sortContext.sortStratagyImplementation();
		System.out.println("Context objecti after ascending sort: " + sortContext);

		// Insertion sort ASCENDING
		sortContext.setArray(generateNLengthIntArray(11));
		sortContext.setSortingOrder(SortingOrder.ASCENDING);
		sortContext.setSortStrategy(new InsertionSort());

		System.out.println("Changing sort method...");
		System.out.println("New array generation...");
		System.out.println("Changing sorting order...");
		System.out.println("Context object before modifying: " + sortContext);
		sortContext.sortStratagyImplementation();
		System.out.println("Context objecti after ascending sort: " + sortContext);

		// Insertion sort DESCENDING
		sortContext.setArray(generateNLengthIntArray(11));
		sortContext.setSortingOrder(SortingOrder.DESCENDING);

		System.out.println("New array generation...");
		System.out.println("Changing sorting order...");
		System.out.println("Context object before modifying: " + sortContext);
		sortContext.sortStratagyImplementation();
		System.out.println("Context objecti after ascending sort: " + sortContext);
	}

	/**
	 * Creating new fixed length array
	 *
	 * @param n array capacity
	 * @return new array
	 */
	private static int[] generateNLengthIntArray(int n) {
		return IntStream.range(0, n).map(i -> (int) (Math.random() * 1000 - 500)).toArray();
	}
}
