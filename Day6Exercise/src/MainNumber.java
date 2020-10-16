
public class MainNumber {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Number(2));
		Thread thread2 = new Thread(new Number(5));
		Thread thread3 = new Thread(new Number(8));
		thread1.setName("2 * Multiplication");
		thread2.setName("5 * Multiplication");
		thread3.setName("8 * Multiplication");

		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
		thread3.start();

	}
	
}
