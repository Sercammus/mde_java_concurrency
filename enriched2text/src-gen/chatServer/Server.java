package chatServer;

import java.util.*;

public class Server {

	public void logMsg() {
		//TODO stub
	}

	public void broadcastMsg(Client c, Object bla, Object clientList) {
		int state = 1;
		synchronized (bla) {
			synchronized (clientList) {
				while (state > 0) {
					switch (state) {
						case 1 :
							this.logMsg();

							state = 2;
							break;
						case 2 :
							c.sendMsg(bla, clientList);

							state = 3;
							break;
						case 3 :

							state = 0;
							break;
					}
				}

			}
		}
	}

	public void listenForClient() {
		//TODO stub
	}

	public void addClient(Object bla, Object clientList) {
		synchronized (bla) {
			synchronized (clientList) {
				//TODO stub
			}
		}
	}

	public void removeClient(Object bla, Object clientList) {
		synchronized (bla) {
			synchronized (clientList) {
				//TODO stub
			}
		}
	}

	public void serverThread(Object bla, Client c, Object clientList) {
		int state = 1;
		Thread clientThread = null;
		while (state > 0) {
			switch (state) {
				case 1 :
					this.listenForClient();

					state = 2;
					break;
				case 2 :
					this.addClient(bla, clientList);

					state = 3;
					break;
				case 3 :

				{
					final Object bla$final = bla;
					final Object clientList$final = clientList;
					final Server s$final = this;
					final Client c$final = c;

					clientThread = new Thread(new Runnable() {
						public void run() {
							c$final.clientThread(bla$final, clientList$final, s$final);
						}
					});
					clientThread.start();
				}

					state = 1;
					break;
				case 4 :
					if (clientThread != null) {
						clientThread.interrupt();
					}
					state = 5;
					break;
				case 5 :

					state = 0;
					break;
			}
		}

	}

}
