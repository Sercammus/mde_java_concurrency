package makeDinerThread;

import java.util.*;

public class Main {

	public static List<Thread> addHerbsThread = new LinkedList<Thread>();

	public static List<Thread> addRiceThread = new LinkedList<Thread>();

	public static Thread turnMeatThread = null;

	public static void putMeatInPan() {
		// TODO stub
	}

	public static void waitForMeatThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:
				Thread.yield();

				state = 2;
				break;
			case 2:

				if (true /* TODO "[meat is done]" */)
					state = 3;
				else
					state = 1;
				break;
			case 3:
				if (Main.turnMeatThread != null) {
					Main.turnMeatThread.interrupt();
				}
				state = 4;
				break;
			case 4:

				state = 0;
				break;
			}
		}

	}

	public static void turnMeat() {
		// TODO stub
	}

	public static void turnMeatThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				state = 2;
				break;
			case 2:
				Main.turnMeat();

				state = 1;
				break;
			case 3:

				state = 0;
				break;
			}
		}

	}

	public static void prepareMeatThread() {
		int state = 1;
		Thread waitForMeatThread = null;
		while (state > 0) {
			switch (state) {
			case 1:
				Main.putMeatInPan();

				state = 2;
				break;
			case 2:

			{
				waitForMeatThread = new Thread(new Runnable() {
					public void run() {
						Main.waitForMeatThread();
					}
				});
				waitForMeatThread.start();
			}

			{
				Main.turnMeatThread = new Thread(new Runnable() {
					public void run() {
						Main.turnMeatThread();
					}
				});

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
			case 1:
				Main.prepareMeatThread();

				state = 0;
				break;
			}
		}

	}

	public static void cutVegetables() {
		// TODO stub
	}

	public static void vegetablesThread(Thread cookThread, Thread meatThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:
				Main.cutVegetables();

				state = 2;
				break;
			case 2:
				try {
					meatThread.join();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				state = 3;
				break;
			case 3:
				Main.cookThread(cookThread);

				state = 0;
				break;
			}
		}

	}

	public static void addVegetablesToMeat() {
		// TODO stub
	}

	public static void cookThread(Thread cookThread) {
		int state = 1;
		Thread meatThread = null;
		Thread vegetablesThread = null;
		while (state > 0) {
			switch (state) {
			case 1:

			{
				final Thread cookThread$final = cookThread;
				final Thread meatThread$final = meatThread;

				meatThread = new Thread(new Runnable() {
					public void run() {
						Main.meatThread(cookThread$final, meatThread$final);
					}
				});
				meatThread.start();
			}

			{
				final Thread cookThread$final = cookThread;
				final Thread meatThread$final = meatThread;

				vegetablesThread = new Thread(new Runnable() {
					public void run() {
						Main.vegetablesThread(cookThread$final, meatThread$final);
					}
				});
				vegetablesThread.start();
			}

				state = 0;
				break;
			case 2:
				Main.addVegetablesToMeat();

				state = 3;
				break;
			case 3:
				Thread.yield();

				state = 4;
				break;
			case 4:

				if (true /* TODO "[vegetables are done]" */)
					state = 0;
				else
					state = 3;
				break;
			}
		}

	}

	public static void cookWater() {
		// TODO stub
	}

	public static void putRiceInWater() {
		// TODO stub
	}

	public static void takeRiceFromWater() {
		// TODO stub
	}

	public static void riceThread(Thread cookThread) {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:
				Main.cookWater();

				state = 2;
				break;
			case 2:

				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				state = 3;
				break;
			case 3:
				Main.putRiceInWater();

				state = 4;
				break;
			case 4:

				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				state = 5;
				break;
			case 5:
				Main.takeRiceFromWater();

				state = 6;
				break;
			case 6:
				try {
					cookThread.join();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				state = 7;
				break;
			case 7:
				Main.makeDinerThread();

				state = 0;
				break;
			}
		}

	}

	public static void makeTable() {
		// TODO stub
	}

	public static void makeTableThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:
				Main.makeTable();

				state = 2;
				break;
			case 2:

				state = 0;
				break;
			}
		}

	}

	public static void addHerbs() {
		// TODO stub
	}

	public static void addHerbsThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:
				Main.addHerbs();

				state = 0;
				break;
			}
		}

	}

	public static void addRice() {
		// TODO stub
	}

	public static void mix() {
		// TODO stub
	}

	public static void addRiceThread() {
		int state = 1;
		while (state > 0) {
			switch (state) {
			case 1:
				Main.addRice();

				state = 2;
				break;
			case 2:
				try {
					{
						Thread $t;
						synchronized (Main.addHerbsThread) {
							$t = Main.addHerbsThread.get(Main.addHerbsThread.size() - 1);
						}
						$t.join();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				state = 3;
				break;
			case 3:
				Main.mix();

				state = 4;
				break;
			case 4:

				state = 0;
				break;
			}
		}

	}

	public static void makeDinerThread() {
		int state = 1;
		Thread cookThread = null;
		Thread riceThread = null;
		Thread makeTableThread = null;
		while (state > 0) {
			switch (state) {
			case 1:

			{
				final Thread cookThread$final = cookThread;

				cookThread = new Thread(new Runnable() {
					public void run() {
						Main.cookThread(cookThread$final);
					}
				});
				cookThread.start();
			}

			{
				makeTableThread = new Thread(new Runnable() {
					public void run() {
						Main.makeTableThread();
					}
				});
				makeTableThread.start();
			}

			{
				final Thread cookThread$final = cookThread;

				riceThread = new Thread(new Runnable() {
					public void run() {
						Main.riceThread(cookThread$final);
					}
				});
				riceThread.start();
			}

				state = 0;
				break;
			case 2:

			{
				Thread $t = new Thread(new Runnable() {
					public void run() {
						Main.addHerbsThread();
					}
				});

				synchronized (Main.addHerbsThread) {
					Main.addHerbsThread.add($t);
				}

				$t.start();
			}

			{
				Thread $t = new Thread(new Runnable() {
					public void run() {
						Main.addRiceThread();
					}
				});

				synchronized (Main.addRiceThread) {
					Main.addRiceThread.add($t);
				}

				$t.start();
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
			case 1:
				Main.makeDinerThread();

				state = 0;
				break;
			}
		}

	}

}
