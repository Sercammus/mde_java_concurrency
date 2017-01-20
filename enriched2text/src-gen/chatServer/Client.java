package chatServer;

public class Client {

	public void sendMsg(Object bla, Object clientList) {
		synchronized (bla) {
			synchronized (clientList) {
				//TODO stub
			}
		}
	}

	public void clientThread(Object bla, Object clientList, Server s) {
		int state = 1;
		while (state > 0) {
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

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					state = 1;
					break;
				case 3 :
					s.broadcastMsg(this, bla, clientList);

					state = 1;
					break;
				case 4 :
					s.removeClient(bla, clientList);

					state = 5;
					break;
				case 5 :

					state = 0;
					break;
				case 6 :

					state = 0;
					break;
			}

		}

	}

}
