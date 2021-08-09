package ex03.exam03.multithread;

public class MultiThreadEx implements Runnable {

	int TestNum = 0;

	@Override
	/* synchronized 하나가 끝나야 실행됨 */
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("A")) {
				System.out.println("=======================");
				TestNum++;
			}
			System.out.println("ThreadName = " + Thread.currentThread().getName() + ", TestNum = " + TestNum);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}