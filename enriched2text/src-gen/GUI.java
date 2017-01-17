
public class GUI {

	public void getUserInput() {

	}

	public void guiThread(Server s, Object clientList, Object bla, Client c, Thread serverThread) {

		int state = 1;

		while (state > 0) {
			switch (state) {

				case 1 :

					getUserInput(); //TODO parameters!

					state = 2;

					break;

				case 2 :

					if (eval("[message]"))
						state = 3;
					else
						state = 3;

					break;

				case 3 :

					broadcastMsg(); //TODO parameters!

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
