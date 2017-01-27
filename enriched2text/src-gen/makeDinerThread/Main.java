package makeDinerThread;

public class Main {

	public static void putMeatInPan() {
		//TODO stub
	}

	public static void waitForMeatThread(Thread turnMeatThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Thread.yield();

					state = 2;
					break;
				case 2 :

					if (true /*TODO "[meat is done]"*/)
						state = 3;
					else
						state = 1;
					break;
				case 3 :
					turnMeatThread.interrupt();

					state = 4;
					break;
				case 4 :

					state = 0;
					break;
			}
		}

	}

	public static void turnMeat() throws InterruptedException {
		//TODO stub
	}

	public static void turnMeatThread() {
		int state = 1;
		while (state > 0) {
			try {
				switch (state) {
					case 1 :

						Thread.sleep(10);

						state = 2;
						break;
					case 2 :
						Main.turnMeat();

						state = 1;
						break;
				}
			} catch (InterruptedException e) {

				state = 0;
			}
		}

	}

	public static void prepareMeatThread() {
		int state = 1;
		Thread waitForMeatThread = null;
		Thread turnMeatThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.putMeatInPan();

					state = 2;
					break;
				case 2 :

					turnMeatThread = new Main.HelperClass$turnMeatThread();

					waitForMeatThread = new Main.HelperClass$waitForMeatThread();

					((Main.HelperClass$waitForMeatThread) waitForMeatThread).turnMeatThread = turnMeatThread;
					turnMeatThread.start();
					waitForMeatThread.start();

					state = 0;
					break;
			}
		}

	}

	public static void meatThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.prepareMeatThread();

					state = 0;
					break;
			}
		}

	}

	public static void cutVegetables() {
		//TODO stub
	}

	public static void vegetablesThread(Thread meatThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.cutVegetables();

					state = 2;
					break;
				case 2 :
					try {
						meatThread.join();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 3;
					break;
				case 3 :
					Main.cookThread(2);

					state = 0;
					break;
			}
		}

	}

	public static void addVegetablesToMeat() {
		//TODO stub
	}

	public static void cookThread(int $initialState) {
		int state = $initialState;
		Thread meatThread = null;
		Thread vegetablesThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

					meatThread = new Main.HelperClass$meatThread();

					vegetablesThread = new Main.HelperClass$vegetablesThread();

					((Main.HelperClass$vegetablesThread) vegetablesThread).meatThread = meatThread;
					meatThread.start();
					vegetablesThread.start();

					state = 0;
					break;
				case 2 :
					Main.addVegetablesToMeat();

					state = 3;
					break;
				case 3 :
					Thread.yield();

					state = 4;
					break;
				case 4 :

					if (true /*TODO "[vegetables are done]"*/)
						state = 0;
					else
						state = 3;
					break;
			}
		}

	}

	public static void makeTable() {
		//TODO stub
	}

	public static void makeTableThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.makeTable();

					state = 2;
					break;
				case 2 :

					state = 0;
					break;
			}
		}

	}

	public static void cookWater() {
		//TODO stub
	}

	public static void putRiceInWater() {
		//TODO stub
	}

	public static void takeRiceFromWater() {
		//TODO stub
	}

	public static void riceThread(Thread cookThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.cookWater();

					state = 2;
					break;
				case 2 :

					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 3;
					break;
				case 3 :
					Main.putRiceInWater();

					state = 4;
					break;
				case 4 :

					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 5;
					break;
				case 5 :
					Main.takeRiceFromWater();

					state = 6;
					break;
				case 6 :
					try {
						cookThread.join();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 7;
					break;
				case 7 :
					Main.makeDinerThread(2);

					state = 0;
					break;
			}
		}

	}

	public static void addHerbs() {
		//TODO stub
	}

	public static void addHerbsThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.addHerbs();

					state = 0;
					break;
			}
		}

	}

	public static void addRice() {
		//TODO stub
	}

	public static void mix() {
		//TODO stub
	}

	public static void addRiceThread(Thread addHerbsThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.addRice();

					state = 2;
					break;
				case 2 :
					try {
						addHerbsThread.join();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 3;
					break;
				case 3 :
					Main.mix();

					state = 4;
					break;
				case 4 :

					state = 0;
					break;
			}
		}

	}

	public static void makeDinerThread(int $initialState) {
		int state = $initialState;
		Thread cookThread = null;
		Thread makeTableThread = null;
		Thread addHerbsThread = null;
		Thread riceThread = null;
		Thread addRiceThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

					riceThread = new Main.HelperClass$riceThread();

					makeTableThread = new Main.HelperClass$makeTableThread();

					cookThread = new Main.HelperClass$cookThread();

					((Main.HelperClass$riceThread) riceThread).cookThread = cookThread;
					((Main.HelperClass$cookThread) cookThread).$initialState = 1;
					riceThread.start();
					makeTableThread.start();
					cookThread.start();

					state = 0;
					break;
				case 2 :

					addHerbsThread = new Main.HelperClass$addHerbsThread();

					addRiceThread = new Main.HelperClass$addRiceThread();

					((Main.HelperClass$addRiceThread) addRiceThread).addHerbsThread = addHerbsThread;
					addHerbsThread.start();
					addRiceThread.start();

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
					Main.makeDinerThread(1);

					state = 0;
					break;
			}
		}

	}

	public static class HelperClass$waitForMeatThread extends Thread {
		public Thread turnMeatThread;

		public void run() {
			Main.waitForMeatThread(turnMeatThread);
		}
	}

	public static class HelperClass$makeDinerThread extends Thread {
		public int $initialState;

		public void run() {
			Main.makeDinerThread($initialState);
		}
	}

	public static class HelperClass$meatThread extends Thread {

		public void run() {
			Main.meatThread();
		}
	}

	public static class HelperClass$cookThread extends Thread {
		public int $initialState;

		public void run() {
			Main.cookThread($initialState);
		}
	}

	public static class HelperClass$turnMeatThread extends Thread {

		public void run() {
			Main.turnMeatThread();
		}
	}

	public static class HelperClass$vegetablesThread extends Thread {
		public Thread meatThread;

		public void run() {
			Main.vegetablesThread(meatThread);
		}
	}

	public static class HelperClass$makeTableThread extends Thread {

		public void run() {
			Main.makeTableThread();
		}
	}

	public static class HelperClass$addHerbsThread extends Thread {

		public void run() {
			Main.addHerbsThread();
		}
	}

	public static class HelperClass$riceThread extends Thread {
		public Thread cookThread;

		public void run() {
			Main.riceThread(cookThread);
		}
	}

	public static class HelperClass$addRiceThread extends Thread {
		public Thread addHerbsThread;

		public void run() {
			Main.addRiceThread(addHerbsThread);
		}
	}

}
