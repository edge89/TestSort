package JavaTest;

import java.util.Calendar;
import java.util.Date;

public class Sort {

	public static void bubble(int[] arr1) {
		System.out.println("");
		Date pre = Calendar.getInstance().getTime();
		System.out.println(pre);

		if (arr1.length == 0)
			return;
		int a = arr1.length;
		int temp = 0;
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a - i - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				} else {

				}
			}
		}
		System.out.println("");
		Date lat = Calendar.getInstance().getTime();
		System.out.println(lat);
	}

	public static void select(int[] arr1) {
		System.out.println("");
		Date pre = Calendar.getInstance().getTime();
		System.out.println(pre);
		int temp = 0;
		if (arr1.length == 0)
			return;
		int a = arr1.length;
		for (int i = 0; i < a - 1; i++) {
			int min = arr1[i];
			int minIndex = i;
			for (int j = i + 1; j <= a - 1; j++) {
				if (min > arr1[j]) {
					min = arr1[j];
					minIndex = j;
				}
			}
			temp = arr1[i];
			arr1[i] = arr1[minIndex];
			arr1[minIndex] = temp;
		}
		System.out.println("");
		Date lat = Calendar.getInstance().getTime();
		System.out.println(lat);
	}
}
