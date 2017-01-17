
public class Server {

	public void listenForClient() {

	}

	public void addClient(Object clientList, Object bla) {

		synchronized (clientList) {

			synchronized (bla) {

			}

		}

	}

	public void removeClient(Object clientList, Object bla) {

		synchronized (clientList) {

			synchronized (bla) {

			}

		}

	}

	public void serverThread(Object clientList, Object bla, Client c) {

		int state = 0;

		while (state > 0) {
			switch (state) {

				case 0 :

					listenForClient(); //TODO parameters!

					state = 0;

					break;

				case 0 :

					addClient(); //TODO parameters!

					state = 0;

					break;

				case 0 :

					//Fork states here

					state = 0;

					break;

			}
		}

	}

	public void logMsg() {

	}

	public void broadcastMsg(Object clientList, Object bla, Client c) {

		int state = 0;

		synchronized (clientList) {

			synchronized (bla) {

				while (state > 0) {
					switch (state) {

						case 0 :

							logMsg(); //TODO parameters!

							state = 0;

							break;

						case 0 :

							sendMsg(); //TODO parameters!

							state = 0;

							break;

						case 0 :

							state = 0;

							break;

					}
				}

			}

		}

	}

}
