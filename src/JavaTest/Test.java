package JavaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = Gen.generate(6);
		// int[] arr = { 0, 1, 1, 3, 4, 4, 4, 7, 8, 9, 11, 13, 14, 16, 17, 17, 18,
		// 19, 19, 19 };
		int[] arr1 = Gen.generate(15);
		// int[] arr1 = { 0, 1, 1, 1, 1, 3, 4, 4, 5, 9, 9, 11, 12, 13, 13, 13, 16,
		// 17, 18, 18 };
		// Sort.bubble(arr);
		Sort.select(arr);
		Sort.select(arr1);
		ArrayUtils.syso(arr);
		ArrayUtils.syso(arr1);
		// Integer[] integers = ArrayUtils.IntPackage(arr);
		// Integer[] integers1 = ArrayUtils.IntPackage(arr1);

		// List<Integer> list = Arrays.asList(integers);
		// Collections.sort(list);
		// ArrayUtils.syso(list.toString());
		int[] arr2 = ArrayUtils.Merge(arr, arr1);

		ArrayUtils.syso(arr2);
	}
}
