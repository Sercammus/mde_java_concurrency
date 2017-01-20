package chatServer;

public class GUI {

	public void getUserInput() {
		//TODO stub
	}

	public void guiThread(Thread serverThread, Object bla, Client c, Object clientList, Server s) {
		int state = 1;
		while (state > 0) {
			switch (state) {
				case 1 :
					this.getUserInput();

					state = 2;
					break;
				case 2 :

					if (true /*TODO "[message]"*/)
						state = 3;
					else
						state = 4;
					break;
				case 3 :
					s.broadcastMsg(c, bla, clientList);

					state = 1;
					break;
				case 4 :
					serverThread.interrupt();

					state = 5;
					break;
				case 5 :

					state = 0;
					break;
			}

		}

	}

}
