package sort.many_varieties_of_sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import sort.many_varieties_of_sort.MergeSort;

public class ExcuteFunctions {
	public static void main(String[] args) {
		int[] plimitiveArray = createNewArray();
		MergeSort ms = new MergeSort();

		ms.sort(plimitiveArray);
		System.out.println("ソート後の配列は" + Arrays.toString(plimitiveArray) + "です");
	}

	private static int[] createNewArray() {
		Scanner scnn = new Scanner(System.in);
		Random rndm = new Random();
		int length;
		int createRandom;

		System.out.println("配列の長さを入力");
		length = scnn.nextInt();
		System.out.println("配列に入れたい乱数の上限を入力");
		createRandom = scnn.nextInt() + 1;

		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = rndm.nextInt(createRandom);
		}

		scnn.close();
		System.out.println("完成した配列は" + Arrays.toString(array) + "です");

		return array;
	}
}
