package mergeSort;

import java.util.*;

public class Main {

	public static List<Thread> sortSecondHalfThread = new LinkedList<Thread>();

	public static List<Thread> sortFirstHalfThread = new LinkedList<Thread>();

	public static void split() {
		//TODO stub
	}

	public static void sortSecondHalfThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSortThread();

					state = 2;
					break;
				case 2 :
					try {
						{
							Thread $t;
							synchronized (Main.sortFirstHalfThread) {
								$t = Main.sortFirstHalfThread.remove(Main.sortFirstHalfThread.size() - 1);
							}
							$t.join();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 3;
					break;
				case 3 :
					Main.mergeSortThread();

					state = 0;
					break;
			}
		}

	}

	public static void sortFirstHalfThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSortThread();

					state = 0;
					break;
			}
		}

	}

	public static void merge() {
		//TODO stub
	}

	public static void mergeSortThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.split();

					state = 2;
					break;
				case 2 :

				{
					Thread $t = new Thread(new Runnable() {
						public void run() {
							Main.sortFirstHalfThread();
						}
					});

					synchronized (Main.sortFirstHalfThread) {
						Main.sortFirstHalfThread.add($t);
					}

					$t.start();
				}

				{
					Thread $t = new Thread(new Runnable() {
						public void run() {
							Main.sortSecondHalfThread();
						}
					});

					synchronized (Main.sortSecondHalfThread) {
						Main.sortSecondHalfThread.add($t);
					}

					$t.start();
				}

					state = 0;
					break;
				case 3 :
					Main.merge();

					state = 4;
					break;
				case 4 :

					state = 0;
					break;
			}
		}

	}

	public static void mergeSort() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSortThread();

					state = 2;
					break;
				case 2 :

					state = 0;
					break;
			}
		}

	}

	public static void main(String[] args) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSort();

					state = 0;
					break;
			}
		}

	}

}
