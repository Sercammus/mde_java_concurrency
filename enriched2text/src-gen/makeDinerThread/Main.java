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

	public static void turnMeat() {
		//TODO stub
	}

	public static void turnMeatThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 2;
					break;
				case 2 :
					Main.turnMeat();

					state = 1;
					break;
				case 3 :

					state = 0;
					break;
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

				{
					final Thread turnMeatThread2 = turnMeatThread;

					waitForMeatThread = new Thread(new Runnable() {
						public void run() {

							Main.waitForMeatThread(turnMeatThread2);

						}
					});
					waitForMeatThread.start();
				}

				{
					turnMeatThread = new Thread(new Runnable() {
						public void run() {

							Main.turnMeatThread();

						}
					});
					turnMeatThread.start();
				}

					state = 0;
					break;
			}

		}

	}

	public static void meatThread(Thread cookThread, Thread meatThread) {
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

	public static void vegetablesThread(Thread cookThread, Thread meatThread) {
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
					Main.cookThread(cookThread);

					state = 0;
					break;
			}

		}

	}

	public static void addVegetablesToMeat() {
		//TODO stub
	}

	public static void cookThread(Thread cookThread) {
		int state = 1;
		Thread meatThread = null;
		Thread vegetablesThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

				{
					final Thread cookThread2 = cookThread;
					final Thread meatThread2 = meatThread;

					meatThread = new Thread(new Runnable() {
						public void run() {

							Main.meatThread(cookThread2, meatThread2);

						}
					});
					meatThread.start();
				}

				{
					final Thread cookThread2 = cookThread;
					final Thread meatThread2 = meatThread;

					vegetablesThread = new Thread(new Runnable() {
						public void run() {

							Main.vegetablesThread(cookThread2, meatThread2);

						}
					});
					vegetablesThread.start();
				}

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
					Main.makeDinerThread();

					state = 0;
					break;
			}

		}

	}

	public static void addHerbs() {
		//TODO stub
	}

	public static void addHerbsThread(Thread addHerbsThread) {
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

	public static void makeDinerThread() {
		int state = 1;
		Thread cookThread = null;
		Thread makeTableThread = null;
		Thread riceThread = null;
		Thread addHerbsThread = null;
		Thread addRiceThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

				{
					makeTableThread = new Thread(new Runnable() {
						public void run() {

							Main.makeTableThread();

						}
					});
					makeTableThread.start();
				}

				{
					final Thread cookThread2 = cookThread;

					cookThread = new Thread(new Runnable() {
						public void run() {

							Main.cookThread(cookThread2);

						}
					});
					cookThread.start();
				}

				{
					final Thread cookThread2 = cookThread;

					riceThread = new Thread(new Runnable() {
						public void run() {

							Main.riceThread(cookThread2);

						}
					});
					riceThread.start();
				}

					state = 0;
					break;
				case 2 :

				{
					final Thread addHerbsThread2 = addHerbsThread;

					addHerbsThread = new Thread(new Runnable() {
						public void run() {

							Main.addHerbsThread(addHerbsThread2);

						}
					});
					addHerbsThread.start();
				}

				{
					final Thread addHerbsThread2 = addHerbsThread;

					addRiceThread = new Thread(new Runnable() {
						public void run() {

							Main.addRiceThread(addHerbsThread2);

						}
					});
					addRiceThread.start();
				}

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
					Main.makeDinerThread();

					state = 0;
					break;
			}

		}

	}

}
