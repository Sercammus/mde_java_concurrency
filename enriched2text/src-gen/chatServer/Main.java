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

				{
					final Thread serverThread$final = serverThread;
					final Object bla$final = bla;
					final Client c$final = c;
					final Object clientList$final = clientList;
					final Server s$final = s;
					final GUI gui$final = gui;

					guiThread = new Thread(new Runnable() {
						public void run() {
							gui$final.guiThread(serverThread$final, bla$final, c$final, clientList$final, s$final);
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
		Object clientList = null;
		Object bla = null;
		GUI gui = null;
		Client c = null;
		Server s = null;
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
