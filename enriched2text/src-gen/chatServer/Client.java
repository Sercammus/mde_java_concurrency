package chatServer;

import java.util.*;

public class Client {

	public void sendMsg(Object bla, Object clientList) {
		synchronized (bla) {
			synchronized (clientList) {
				//TODO stub
			}
		}
	}

	public void clientThread(Server s, Object bla, Object clientList, final Set<Thread> $childThreads) {
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
						s.broadcastMsg(bla, this, clientList);

						state = 1;
						break;
					case 4 :
						s.removeClient(bla, clientList);

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
