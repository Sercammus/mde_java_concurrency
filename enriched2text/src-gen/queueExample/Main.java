package queueExample;

public class Main {

	public static void doSetup() {
		//TODO stub
	}

	public static void readInput() {
		//TODO stub
	}

	public static void enqueue(Object queue) {
		synchronized (queue) {
			//TODO stub
		}
	}

	public static void inputThread(Object queue) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.readInput();

					state = 2;
					break;
				case 2 :
					Main.enqueue(queue);

					state = 1;
					break;
			}
		}

	}

	public static void dequeue() {
		//TODO stub
	}

	public static void writeOutput() {
		//TODO stub
	}

	public static void outputThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.dequeue();

					state = 3;
					break;
				case 2 :

					if (true /*TODO "[output]"*/)
						state = 3;
					else
						state = 4;
					break;
				case 3 :
					Main.writeOutput();

					state = 1;
					break;
				case 4 :

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 0;
					break;
			}
		}

	}

	public static void queueExample(Object queue, int $initialState) {
		int state = $initialState;
		Thread inputThread = null;
		Thread outputThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.doSetup();

					state = 2;
					break;
				case 2 :

					inputThread = new Main.HelperClass$inputThread();

					outputThread = new Main.HelperClass$outputThread();

					((Main.HelperClass$inputThread) inputThread).queue = queue;
					inputThread.start();
					outputThread.start();

					state = 0;
					break;
			}
		}

	}

	public static void main(String[] args) {
		int state = 1;
		Object queue = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.queueExample(queue, 1);

					state = 0;
					break;
			}
		}

	}

	public static class HelperClass$queueExample extends Thread {
		public Object queue;
		public int $initialState;

		public void run() {
			Main.queueExample(queue, $initialState);
		}
	}

	public static class HelperClass$inputThread extends Thread {
		public Object queue;

		public void run() {
			Main.inputThread(queue);
		}
	}

	public static class HelperClass$outputThread extends Thread {

		public void run() {
			Main.outputThread();
		}
	}

}
