package chatServer;

import java.util.*;

public class Server {

	public void logMsg() {
		//TODO stub
	}

	public void broadcastMsg(Object bla, Client c, Object clientList) {
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

	public void listenForClient() throws InterruptedException {
		//TODO stub
	}

	public void addClient(Object bla, Object clientList) throws InterruptedException {
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
		final Set<Thread> $childThreads = new HashSet<Thread>();
		while (state > 0) {
			try {
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
						final Server s$final = this;
						final Object bla$final = bla;
						final Object clientList$final = clientList;
						final Client c$final = c;
						clientThread = new Thread(new Runnable() {
							public void run() {
								c$final.clientThread(s$final, bla$final, clientList$final, $childThreads);
							}
						});

						synchronized ($childThreads) {
							$childThreads.add(clientThread);
						}

						clientThread.start();
					}

						state = 1;
						break;
				}
			} catch (InterruptedException e) {

				synchronized ($childThreads) {
					for (Thread $t : $childThreads) {
						$t.interrupt();
					}
					$childThreads.clear();
				}

				state = 0;
			}
		}

	}

}
