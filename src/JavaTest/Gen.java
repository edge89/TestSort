package JavaTest;

public class Gen {
	public static int[] generate(int i) {
		int a = i;
		int[] arr = new int[a];
		for (int j = 0; j < a; j++) {
			arr[j] = (int) (Math.random() * a);
		}
		return arr;
	}
}
