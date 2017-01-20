package chatServer;

public class Main {

	public static void chatServer(GUI gui, Object bla, Client c, Object clientList, Server s) {
		int state = 1;
		Thread serverThread = null;
		Thread guiThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

				{
					final Object bla2 = bla;
					final Client c2 = c;
					final Object clientList2 = clientList;
					final Server s2 = s;

					serverThread = new Thread(new Runnable() {
						public void run() {
							s2.serverThread(bla2, c2, clientList2);
						}
					});
					serverThread.start();
				}

				{
					final Thread serverThread2 = serverThread;
					final Object bla2 = bla;
					final Client c2 = c;
					final Object clientList2 = clientList;
					final Server s2 = s;
					final GUI gui2 = gui;

					guiThread = new Thread(new Runnable() {
						public void run() {
							gui2.guiThread(serverThread2, bla2, c2, clientList2, s2);
						}
					});
					guiThread.start();
				}

					state = 0;
					break;
			}
		}
	}

	public static void main(String[] args) {
		int state = 1;
		Object clientList = new Object();
		Object bla = new Object();
		GUI gui = new GUI();
		Client c = new Client();
		Server s = new Server();
		while (state > 0) {
			switch (state) {
				case 1 :
					Main.chatServer(gui, bla, c, clientList, s);
					state = 0;
					break;
			}
		}
	}

}
