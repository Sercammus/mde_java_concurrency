package mergeSort;

import java.util.*;

public class Main {

	public static void split(Object list, Object secondHalf, Object firstHalf) throws InterruptedException {
		synchronized (list) {
			synchronized (secondHalf) {
				synchronized (firstHalf) {
					//TODO stub
				}
			}
		}
	}

	public static void sortSecondHalfThread(Object list, Object secondHalf, Thread sortFirstHalfThread,
			Object firstHalf, final Set<Thread> $childThreads) {
		int state = 1;
		while (state > 0) {
			try {
				switch (state) {
					case 1 :
						Main.subProcessThread(list, secondHalf, firstHalf, $childThreads, 2);

						state = 2;
						break;
					case 2 :

						sortFirstHalfThread.join();

						state = 3;
						break;
					case 3 :
						Main.subProcessThread(list, secondHalf, firstHalf, $childThreads, 4);

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

	public static void sortFirstHalfThread(Object list, Object secondHalf, Object firstHalf,
			final Set<Thread> $childThreads) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.subProcessThread(list, secondHalf, firstHalf, $childThreads, 2);

					state = 0;
					break;
			}
		}

	}

	public static void merge(Object list, Object secondHalf, Object firstHalf) throws InterruptedException {
		synchronized (list) {
			synchronized (secondHalf) {
				synchronized (firstHalf) {
					//TODO stub
				}
			}
		}
	}

	public static void subProcessThread(Object list, Object secondHalf, Object firstHalf,
			final Set<Thread> $childThreads, int $initialState) {
		int state = $initialState;
		Thread sortSecondHalfThread = null;
		Thread sortFirstHalfThread = null;
		while (state > 0) {
			try {
				switch (state) {
					case 1 :

						if (true /*TODO "[size() > 1]"*/)
							state = 2;
						else
							state = 5;
						break;
					case 2 :
						Main.split(list, secondHalf, firstHalf);

						state = 3;
						break;
					case 3 :

						sortFirstHalfThread = new Main.HelperClass$sortFirstHalfThread();

						synchronized ($childThreads) {
							$childThreads.add(sortFirstHalfThread);
						}

						sortSecondHalfThread = new Main.HelperClass$sortSecondHalfThread();

						synchronized ($childThreads) {
							$childThreads.add(sortSecondHalfThread);
						}

						((Main.HelperClass$sortFirstHalfThread) sortFirstHalfThread).list = list;
						((Main.HelperClass$sortFirstHalfThread) sortFirstHalfThread).secondHalf = secondHalf;
						((Main.HelperClass$sortFirstHalfThread) sortFirstHalfThread).firstHalf = firstHalf;
						((Main.HelperClass$sortFirstHalfThread) sortFirstHalfThread).$childThreads = $childThreads;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).list = list;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).secondHalf = secondHalf;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).sortFirstHalfThread = sortFirstHalfThread;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).firstHalf = firstHalf;
						((Main.HelperClass$sortSecondHalfThread) sortSecondHalfThread).$childThreads = $childThreads;
						sortFirstHalfThread.start();
						sortSecondHalfThread.start();

						state = 0;
						break;
					case 4 :
						Main.merge(list, secondHalf, firstHalf);

						state = 5;
						break;
					case 5 :

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

	public static void printResult() {
		//TODO stub
	}

	public static void mergeSortThread(Object list, Object secondHalf, Object firstHalf) {
		int state = 1;
		final Set<Thread> $childThreads = new HashSet<Thread>();
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.subProcessThread(list, secondHalf, firstHalf, $childThreads, 2);

					state = 2;
					break;
				case 2 :
					Main.printResult();

					state = 5;
					break;
				case 3 :

					state = 0;
					break;
			}
		}

	}

	public static void mergeSort(Object list, Object secondHalf, Object firstHalf, int $initialState) {
		int state = $initialState;
		Thread timeoutThread = null;
		Thread mergeSortThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

					timeoutThread = new Main.HelperClass$timeoutThread();

					mergeSortThread = new Main.HelperClass$mergeSortThread();

					((Main.HelperClass$timeoutThread) timeoutThread).mergeSortThread = mergeSortThread;
					((Main.HelperClass$mergeSortThread) mergeSortThread).list = list;
					((Main.HelperClass$mergeSortThread) mergeSortThread).secondHalf = secondHalf;
					((Main.HelperClass$mergeSortThread) mergeSortThread).firstHalf = firstHalf;
					timeoutThread.start();
					mergeSortThread.start();

					state = 0;
					break;
			}
		}

	}

	public static void main(String[] args) {
		int state = 1;
		Object list = null;
		Object firstHalf = null;
		Object secondHalf = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.mergeSort(list, secondHalf, firstHalf, 1);

					state = 0;
					break;
			}
		}

	}

	public static class HelperClass$timeoutThread extends Thread {
		public Thread mergeSortThread;

		public void run() {
			Main.timeoutThread(mergeSortThread);
		}
	}

	public static class HelperClass$mergeSort extends Thread {
		public Object list;
		public Object secondHalf;
		public Object firstHalf;
		public int $initialState;

		public void run() {
			Main.mergeSort(list, secondHalf, firstHalf, $initialState);
		}
	}

	public static class HelperClass$sortSecondHalfThread extends Thread {
		public Object list;
		public Object secondHalf;
		public Thread sortFirstHalfThread;
		public Object firstHalf;
		public Set<Thread> $childThreads;

		public void run() {
			Main.sortSecondHalfThread(list, secondHalf, sortFirstHalfThread, firstHalf, $childThreads);
		}
	}

	public static class HelperClass$sortFirstHalfThread extends Thread {
		public Object list;
		public Object secondHalf;
		public Object firstHalf;
		public Set<Thread> $childThreads;

		public void run() {
			Main.sortFirstHalfThread(list, secondHalf, firstHalf, $childThreads);
		}
	}

	public static class HelperClass$mergeSortThread extends Thread {
		public Object list;
		public Object secondHalf;
		public Object firstHalf;

		public void run() {
			Main.mergeSortThread(list, secondHalf, firstHalf);
		}
	}

}
