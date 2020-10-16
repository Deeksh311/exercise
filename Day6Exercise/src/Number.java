public class Number implements Runnable {

	int multipler;

	public Number(int multipler) {
		this.multipler = multipler;
	}

	public void run() {

		System.out.println("begin:" + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {

			System.out.println(multipler + " * " + i + " :" + multipler * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ended:" + Thread.currentThread().getName());
	}

}




