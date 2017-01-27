package chatServer;

public class Main {

	public static void chatServer(GUI gui, Client c, Server s, Object clientList, Object bla, int $initialState) {
		int state = $initialState;
		Thread guiThread = null;
		Thread serverThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

					guiThread = new Main.HelperClass$guiThread();

					serverThread = new Main.HelperClass$serverThread();

					((Main.HelperClass$guiThread) guiThread).gui = gui;
					((Main.HelperClass$guiThread) guiThread).c = c;
					((Main.HelperClass$guiThread) guiThread).s = s;
					((Main.HelperClass$guiThread) guiThread).clientList = clientList;
					((Main.HelperClass$guiThread) guiThread).bla = bla;
					((Main.HelperClass$guiThread) guiThread).serverThread = serverThread;
					((Main.HelperClass$serverThread) serverThread).s = s;
					((Main.HelperClass$serverThread) serverThread).c = c;
					((Main.HelperClass$serverThread) serverThread).clientList = clientList;
					((Main.HelperClass$serverThread) serverThread).bla = bla;
					guiThread.start();
					serverThread.start();

					state = 0;
					break;
			}
		}

	}

	public static void main(String[] args) {
		int state = 1;
		Object clientList = null;
		Object bla = null;
		GUI gui = null;
		Client c = null;
		Server s = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.chatServer(gui, c, s, clientList, bla, 1);

					state = 0;
					break;
			}
		}

	}

	public static class HelperClass$chatServer extends Thread {
		public GUI gui;
		public Client c;
		public Server s;
		public Object clientList;
		public Object bla;
		public int $initialState;

		public void run() {
			Main.chatServer(gui, c, s, clientList, bla, $initialState);
		}
	}

	public static class HelperClass$guiThread extends Thread {
		public Client c;
		public Server s;
		public Object clientList;
		public Object bla;
		public Thread serverThread;

		public GUI gui;
		public void run() {
			gui.guiThread(c, s, clientList, bla, serverThread);
		}
	}

	public static class HelperClass$serverThread extends Thread {
		public Client c;
		public Object clientList;
		public Object bla;

		public Server s;
		public void run() {
			s.serverThread(c, clientList, bla);
		}
	}

}
