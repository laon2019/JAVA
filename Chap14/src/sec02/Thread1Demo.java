package sec02;

public class Thread1Demo {
	public static void main(String[] args) {
//		Thread t = new Thread(new MyRunnable());
//		t.start();

//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 50; i++) {
//					System.out.println("잘가.");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//
//					}
//				}
//			}
//			
//		}).start();
		new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("잘가.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}
		}).start();

		for (int i = 0; i < 50; i++) {
			System.out.println("안녕.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
