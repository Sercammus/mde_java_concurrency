
public class GUI {

	public void getUserInput() {

	}

	public void guiThread(Object clientList, Object bla, Server s, Thread serverThread, Client c) {

		int state = 0;

		while (state > 0) {
			switch (state) {

				case 0 :

					getUserInput(); //TODO parameters!

					state = 0;

					break;

				case 0 :

					if (eval("[message]"))
						state = 0;
					else
						state = 0;

					break;

				case 0 :

					broadcastMsg(); //TODO parameters!

					state = 0;

					break;

				case 0 :

					serverThread.interrupt();

					state = 0;

					break;

				case 0 :

					state = 0;

					break;

			}
		}

	}

}
