package mergeSort;

public class Main {

	public static void split() {
		//TODO stub
	}

	public static void sortSecondHalfThread(Thread sortFirstHalfThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSortThread(1);

					state = 2;
					break;
				case 2 :
					try {
						sortFirstHalfThread.join();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 3;
					break;
				case 3 :
					Main.mergeSortThread(3);

					state = 0;
					break;
			}
		}

	}

	public static void sortFirstHalfThread(Thread sortFirstHalfThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSortThread(1);

					state = 0;
					break;
			}
		}

	}

	public static void merge() {
		//TODO stub
	}

	public static void mergeSortThread(int $initialState) {
		int state = $initialState;
		Thread sortSecondHalfThread = null;
		Thread sortFirstHalfThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.split();

					state = 2;
					break;
				case 2 :

				{
					final Thread sortFirstHalfThread$final = sortFirstHalfThread;
					sortFirstHalfThread = new Thread(new Runnable() {
						public void run() {
							Main.sortFirstHalfThread(sortFirstHalfThread$final);
						}
					});

					sortFirstHalfThread.start();
				}

				{
					final Thread sortFirstHalfThread$final = sortFirstHalfThread;
					sortSecondHalfThread = new Thread(new Runnable() {
						public void run() {
							Main.sortSecondHalfThread(sortFirstHalfThread$final);
						}
					});

					sortSecondHalfThread.start();
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
					Main.mergeSortThread(1);

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
