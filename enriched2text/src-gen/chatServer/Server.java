package chatServer;

import java.util.*;

public class Server {

	public void logMsg() {
		//TODO stub
	}

	public void broadcastMsg(Client c, Object clientList, Object bla) {
		int state = 1;
		synchronized (clientList) {
			synchronized (bla) {
				while (state > 0) {
					switch (state) {
						case 1 :
							this.logMsg();

							state = 2;
							break;
						case 2 :
							c.sendMsg(clientList, bla);

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

	public void addClient(Object clientList, Object bla) throws InterruptedException {
		synchronized (clientList) {
			synchronized (bla) {
				//TODO stub
			}
		}
	}

	public void removeClient(Object clientList, Object bla) {
		synchronized (clientList) {
			synchronized (bla) {
				//TODO stub
			}
		}
	}

	public void serverThread(Client c, Object clientList, Object bla) {
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
						this.addClient(clientList, bla);

						state = 3;
						break;
					case 3 :

						clientThread = new Server.HelperClass$clientThread();

						synchronized ($childThreads) {
							$childThreads.add(clientThread);
						}

						((Server.HelperClass$clientThread) clientThread).c = c;
						((Server.HelperClass$clientThread) clientThread).s = this;
						((Server.HelperClass$clientThread) clientThread).clientList = clientList;
						((Server.HelperClass$clientThread) clientThread).bla = bla;
						((Server.HelperClass$clientThread) clientThread).$childThreads = $childThreads;
						clientThread.start();

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

	public static class HelperClass$clientThread extends Thread {
		public Server s;
		public Object clientList;
		public Object bla;
		public Set<Thread> $childThreads;

		public Client c;
		public void run() {
			c.clientThread(s, clientList, bla, $childThreads);
		}
	}

}
