package mergeSort;

import java.util.*;

public class Main {

	public static void split() throws InterruptedException {
		//TODO stub
	}

	public static void sortSecondHalfThread(Thread sortFirstHalfThread, final Set<Thread> $childThreads) {
		int state = 1;
		while (state > 0) {
			try {
				switch (state) {
					case 1 :
						Main.subProcessThread($childThreads, 1);

						state = 2;
						break;
					case 2 :

						sortFirstHalfThread.join();

						state = 3;
						break;
					case 3 :
						Main.subProcessThread($childThreads, 3);

						state = 0;
						break;
				}
			} catch (InterruptedException e) {

				synchronized ($childThreads) {
					for (Thread $t : $childThreads) {
						$t.interrupt();
					}
					$childThreads.clear();
				}

				state = 0;
			}
		}

	}

	public static void sortFirstHalfThread(final Set<Thread> $childThreads) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.subProcessThread($childThreads, 1);

					state = 0;
					break;
			}
		}

	}

	public static void merge() throws InterruptedException {
		//TODO stub
	}

	public static void subProcessThread(final Set<Thread> $childThreads, int $initialState) {
		int state = $initialState;
		Thread sortSecondHalfThread = null;
		Thread sortFirstHalfThread = null;
		while (state > 0) {
			try {
				switch (state) {
					case 1 :
						Main.split();

						state = 2;
						break;
					case 2 :

						sortFirstHalfThread = new Main.HelperClass$sortFirstHalfThread();

						synchronized ($childThreads) {
							$childThreads.add(sortFirstHalfThread);
						}

						sortSecondHalfThread = new Main.HelperClass$sortSecondHalfThread();

						synchronized ($childThreads) {
							$childThreads.add(sortSecondHalfThread);
						}

						((Main.HelperClass$sortFirstHalfThread) sortFirstHalfThread).$childThreads = $childThreads;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).sortFirstHalfThread = sortFirstHalfThread;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).$childThreads = $childThreads;
						sortFirstHalfThread.start();
						sortSecondHalfThread.start();

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
			} catch (InterruptedException e) {

				synchronized ($childThreads) {
					for (Thread $t : $childThreads) {
						$t.interrupt();
					}
					$childThreads.clear();
				}

				state = 0;
			}
		}

	}

	public static void mergeSortThread() {
		int state = 1;
		final Set<Thread> $childThreads = new HashSet<Thread>();
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.subProcessThread($childThreads, 1);

					state = 2;
					break;
				case 2 :

					state = 0;
					break;
			}
		}

	}

	public static void timeoutThread(Thread mergeSortThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :

					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 2;
					break;
				case 2 :
					mergeSortThread.interrupt();

					state = 3;
					break;
				case 3 :

					state = 0;
					break;
			}
		}

	}

	public static void mergeSort(int $initialState) {
		int state = $initialState;
		Thread mergeSortThread = null;
		Thread timeoutThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

					timeoutThread = new Main.HelperClass$timeoutThread();

					mergeSortThread = new Main.HelperClass$mergeSortThread();

					((Main.HelperClass$timeoutThread) timeoutThread).mergeSortThread = mergeSortThread;
					timeoutThread.start();
					mergeSortThread.start();

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
					Main.mergeSort(1);

					state = 0;
					break;
			}
		}

	}

	public static class HelperClass$mergeSortThread extends Thread {

		public void run() {
			Main.mergeSortThread();
		}
	}

	public static class HelperClass$sortSecondHalfThread extends Thread {
		public Thread sortFirstHalfThread;
		public Set<Thread> $childThreads;

		public void run() {
			Main.sortSecondHalfThread(sortFirstHalfThread, $childThreads);
		}
	}

	public static class HelperClass$mergeSort extends Thread {
		public int $initialState;

		public void run() {
			Main.mergeSort($initialState);
		}
	}

	public static class HelperClass$sortFirstHalfThread extends Thread {
		public Set<Thread> $childThreads;

		public void run() {
			Main.sortFirstHalfThread($childThreads);
		}
	}

	public static class HelperClass$timeoutThread extends Thread {
		public Thread mergeSortThread;

		public void run() {
			Main.timeoutThread(mergeSortThread);
		}
	}

}
