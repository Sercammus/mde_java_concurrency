
public class Client {

	public void sendMsg(Object clientList, Object bla) {

		synchronized (clientList) {

			synchronized (bla) {

			}

		}

	}

	public void clientThread(Server s, Object clientList, Object bla) {

		int state = 1;

		while (state > 0) {
			switch (state) {

				case 1 :

					if (eval("[no msg]"))
						state = 2;
					else if (eval("[disconnect]"))
						state = 4;
					else
						state = 4;

					break;

				case 2 :

					Thread.sleep(1);

					state = 1;

					break;

				case 3 :

					broadcastMsg(); //TODO parameters!

					state = 1;

					break;

				case 4 :

					removeClient(); //TODO parameters!

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
