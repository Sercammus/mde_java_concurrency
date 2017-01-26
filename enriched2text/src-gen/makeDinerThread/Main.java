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

				{
					turnMeatThread = new Thread(new Runnable() {
						public void run() {
							Main.turnMeatThread();
						}
					});

					turnMeatThread.start();
				}

				{
					final Thread turnMeatThread$final = turnMeatThread;
					waitForMeatThread = new Thread(new Runnable() {
						public void run() {
							Main.waitForMeatThread(turnMeatThread$final);
						}
					});

					waitForMeatThread.start();
				}

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

	public static void meatThread(Thread meatThread, Thread cookThread) {
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

	public static void vegetablesThread(Thread meatThread, Thread cookThread) {
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
					Main.cookThread(cookThread, 2);

					state = 0;
					break;
			}
		}

	}

	public static void addVegetablesToMeat() {
		//TODO stub
	}

	public static void cookThread(Thread cookThread, int $initialState) {
		int state = $initialState;
		Thread meatThread = null;
		Thread vegetablesThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

				{
					final Thread meatThread$final = meatThread;
					final Thread cookThread$final = cookThread;
					meatThread = new Thread(new Runnable() {
						public void run() {
							Main.meatThread(meatThread$final, cookThread$final);
						}
					});

					meatThread.start();
				}

				{
					final Thread meatThread$final = meatThread;
					final Thread cookThread$final = cookThread;
					vegetablesThread = new Thread(new Runnable() {
						public void run() {
							Main.vegetablesThread(meatThread$final, cookThread$final);
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

	public static void makeDinerThread(int $initialState) {
		int state = $initialState;
		Thread riceThread = null;
		Thread makeTableThread = null;
		Thread addHerbsThread = null;
		Thread addRiceThread = null;
		Thread cookThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

				{
					final Thread cookThread$final = cookThread;
					cookThread = new Thread(new Runnable() {
						public void run() {
							Main.cookThread(cookThread$final, 1);
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
				case 2 :

				{
					final Thread addHerbsThread$final = addHerbsThread;
					addHerbsThread = new Thread(new Runnable() {
						public void run() {
							Main.addHerbsThread(addHerbsThread$final);
						}
					});

					addHerbsThread.start();
				}

				{
					final Thread addHerbsThread$final = addHerbsThread;
					addRiceThread = new Thread(new Runnable() {
						public void run() {
							Main.addRiceThread(addHerbsThread$final);
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
					Main.makeDinerThread(1);

					state = 0;
					break;
			}
		}

	}

}
