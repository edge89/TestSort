package JavaTest;


/**
 * 数组的工具类
 * 
 * @author edge
 * 
 */
public class ArrayUtils {

	public static void syso(int[] arr1) {
		for (int j : arr1) {
			System.out.print(j + " ");
		}
		System.out.println("%%");
	}

	public static void syso(String str) {
		System.out.println(str + " ");
	}

	public static Integer[] IntPackage(int[] arr1) {
		Integer[] integers = new Integer[arr1.length];
		for (int i = 0; i < integers.length; i++) {
			integers[i] = Integer.valueOf(arr1[i]);
		}
		return integers;
	}

	public static int[] Merge(int[] arr, int[] arr1) {

		if (CheckArray(arr)&&CheckArray(arr1)) {

			int[] arr2 = new int[arr.length + arr1.length];
			int a = 0, b = 0, c = 0;// a 为arr下标,b is the index of arr1,c is the
			while (a < arr.length && b < arr1.length) {
				if (arr[a] <= arr1[b]) {
					arr2[c++] = arr[a++];
				} else {
					arr2[c++] = arr1[b++];
				}
			}
			while (a < arr.length) {
				arr2[c++] = arr[a++];
			}
			while (b < arr1.length) {
				arr2[c++] = arr1[b++];
			}
			return arr2;
		} else {
			System.out.println("不满足输入条件");
			return null;
		}
	}

	private static boolean CheckArray(int[] arr) {
		boolean changed = true;
		for (int i = 0; i < arr.length - 1 && changed; i++) {
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j - 1] > arr[j])
					return false;
				else
					changed = false;
		}
		return false;
	}
}
