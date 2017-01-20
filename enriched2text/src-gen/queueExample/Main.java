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

	public static void queueExample(Object queue) {
		int state = 1;
		Thread inputThread = null;
		Thread outputThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.doSetup();

					state = 2;
					break;
				case 2 :

				{
					outputThread = new Thread(new Runnable() {
						public void run() {
							Main.outputThread();
						}
					});
					outputThread.start();
				}

				{
					final Object queue2 = queue;

					inputThread = new Thread(new Runnable() {
						public void run() {
							Main.inputThread(queue2);
						}
					});
					inputThread.start();
				}

					state = 0;
					break;
			}
		}
	}

	public static void main(String[] args) {
		int state = 1;
		Object queue = new Object();
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.queueExample(queue);
					state = 0;
					break;
			}
		}
	}

}
