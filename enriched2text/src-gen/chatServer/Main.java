package chatServer;

public class Main {

	public static void chatServer(Server s, Object bla, GUI gui, Client c, Object clientList, int $initialState) {
		int state = $initialState;
		Thread guiThread = null;
		Thread serverThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :

				{
					final Thread serverThread$final = serverThread;
					final Server s$final = s;
					final Object bla$final = bla;
					final Client c$final = c;
					final Object clientList$final = clientList;
					final GUI gui$final = gui;
					guiThread = new Thread(new Runnable() {
						public void run() {
							gui$final.guiThread(serverThread$final, s$final, bla$final, c$final, clientList$final);
						}
					});

					guiThread.start();
				}

				{
					final Object bla$final = bla;
					final Client c$final = c;
					final Object clientList$final = clientList;
					final Server s$final = s;
					serverThread = new Thread(new Runnable() {
						public void run() {
							s$final.serverThread(bla$final, c$final, clientList$final);
						}
					});

					serverThread.start();
				}

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
					Main.chatServer(s, bla, gui, c, clientList, 1);

					state = 0;
					break;
			}
		}

	}

}
