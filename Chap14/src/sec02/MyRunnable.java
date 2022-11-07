package sec02;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("잘가.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}

}
