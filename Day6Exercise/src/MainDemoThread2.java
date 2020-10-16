
public class MainDemoThread2 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new DemoThread1());
		Thread thread2 = new Thread(new DemoThread1());
		Thread thread3 = new Thread(new DemoThread1());
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
