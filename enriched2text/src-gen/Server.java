
public class Server {

	public void logMsg() {

	}

	public void broadcastMsg(Object clientList, Object bla, Client c) {

		int state = 1;

		synchronized (clientList) {

			synchronized (bla) {

				while (state > 0) {
					switch (state) {

						case 1 :

							logMsg(); //TODO parameters!

							state = 2;

							break;

						case 2 :

							sendMsg(); //TODO parameters!

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

		int state = 1;

		while (state > 0) {
			switch (state) {

				case 1 :

					listenForClient(); //TODO parameters!

					state = 2;

					break;

				case 2 :

					addClient(); //TODO parameters!

					state = 3;

					break;

				case 3 :

					//Fork states here

					state = 1;

					break;

				case 4 :

					clientThread.interrupt();

					state = 5;

					break;

				case 5 :

					state = 0;

					break;

			}
		}

	}

}
