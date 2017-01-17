
public class Client {

	public void clientThread(Object clientList, Object bla, Server s) {

		int state = 0;

		while (state > 0) {
			switch (state) {

				case 0 :

					if (eval("[no msg]"))
						state = 0;
					else if (eval("[disconnect]"))
						state = 0;
					else
						state = 0;

					break;

				case 0 :

					Thread.sleep(1);

					state = 0;

					break;

				case 0 :

					broadcastMsg(); //TODO parameters!

					state = 0;

					break;

				case 0 :

					removeClient(); //TODO parameters!

					state = 0;

					break;

				case 0 :

					state = 0;

					break;

			}
		}

	}

	public void sendMsg(Object clientList, Object bla) {

		synchronized (clientList) {

			synchronized (bla) {

			}

		}

	}

}
