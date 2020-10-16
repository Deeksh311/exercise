import java.time.LocalTime;

public class gettime extends Thread {

	public void run() {

		for (int i = 0; i < 2; i++) {
			LocalTime localTime = LocalTime.now();
			System.out.println(localTime);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
