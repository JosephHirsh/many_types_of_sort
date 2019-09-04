package sort.many_types_of_sort;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] plimitiveArray = { 5, 20, 1, 30, 6, 4, 15 };
		for (int i = 0; i < plimitiveArray.length; i++) {
			int carsor = plimitiveArray.length - i - 1;
			switch (judgeEvenOdd(carsor)) {
			case 2:
				sortArrayOnNumbers(plimitiveArray, carsor);
				break;
			case 1:
				sortArrayOnNumbers(plimitiveArray, carsor - 1);
				break;
			}
		}
		System.out.println(Arrays.toString(plimitiveArray));
	}

	public static int judgeEvenOdd(int number) {
		if (number % 2 == 0) {
			return 2;
		} else {
			return 1;
		}
	}

	public static void sortArrayOnNumbers(int[] plimitiveArray, int carsor) {
		int smaller = 0;
		if (plimitiveArray[carsor] > plimitiveArray[carsor / 2]) {
			smaller = plimitiveArray[carsor / 2];
			plimitiveArray[carsor / 2] = plimitiveArray[carsor];
			plimitiveArray[carsor] = smaller;
		}
	}
}
