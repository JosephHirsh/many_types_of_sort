package sort.many_varieties_of_sort;

import sort.Sort;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] plimitiveArray) {
		if (plimitiveArray.length == 1) {
			return;
		}

		int a = plimitiveArray.length / 2;
		int[] front = new int[a];
		int[] back = new int[plimitiveArray.length - a];

		separeteOwnArray(a, plimitiveArray, front, back);
		stuffIntoArray(plimitiveArray, front, back);
	}

	private void stuffIntoArray(int[] plimitiveArray, int[] front, int[] back) {
		int compareCounterOfFront = 0;
		int compareCounterOfBack = 0;
		for (int i = 0; i < front.length + back.length; i++) {
			if (compareCounterOfFront == front.length) {
				plimitiveArray[i] = back[compareCounterOfBack];
				compareCounterOfBack++;
				continue;
			}
			if (compareCounterOfBack == back.length) {
				plimitiveArray[i] = front[compareCounterOfFront];
				compareCounterOfFront++;
				continue;
			}
			if (front[compareCounterOfFront] < back[compareCounterOfBack]) {
				plimitiveArray[i] = front[compareCounterOfFront];
				compareCounterOfFront++;
			} else {
				plimitiveArray[i] = back[compareCounterOfBack];
				compareCounterOfBack++;
			}
		}
	}

	private void separeteOwnArray(int a, int[] plimitiveArray, int[] front, int[] back) {
		for (int i = 0; i < a; i++) {
			front[i] = plimitiveArray[i];
		}
		for (int i = 0; i < plimitiveArray.length - a; i++) {
			back[i] = plimitiveArray[a + i];
		}
		sort(front);
		sort(back);
	}
}