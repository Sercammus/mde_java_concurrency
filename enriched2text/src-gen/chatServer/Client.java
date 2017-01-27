package chatServer;

import java.util.*;

public class Client {

	public void sendMsg(Object clientList, Object bla) {
		synchronized (clientList) {
			synchronized (bla) {
				//TODO stub
			}
		}
	}

	public void clientThread(Server s, Object clientList, Object bla, final Set<Thread> $childThreads) {
		int state = 1;
		while (state > 0) {
			try {
				switch (state) {
					case 1 :

						if (true /*TODO "[no msg]"*/)
							state = 2;
						else if (true /*TODO "[disconnect]"*/)
							state = 4;
						else
							state = 3;
						break;
					case 2 :

						Thread.sleep(1);

						state = 1;
						break;
					case 3 :
						s.broadcastMsg(this, clientList, bla);

						state = 1;
						break;
					case 4 :
						s.removeClient(clientList, bla);

						state = 5;
						break;
					case 5 :

						state = 0;
						break;
				}
			} catch (InterruptedException e) {

				if ($childThreads != null) {
					synchronized ($childThreads) {
						for (Thread $t : $childThreads) {
							$t.interrupt();
						}
						$childThreads.clear();
					}
				}

				state = 0;
			}
		}

	}

}
