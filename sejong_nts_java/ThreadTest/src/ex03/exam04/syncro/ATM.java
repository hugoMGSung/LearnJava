package ex03.exam04.syncro;

public class ATM implements Runnable {

	private long depositMoney = 10000;

	@Override
	public void run() {
		//synchronized (this) {
			for (int i = 0; i < 10; i++) {
				//notify();
				
				try {
					// wait();
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (getDepositMoney() <= 0) // !!
					break;

				withDraw(1000);
			}
		//}
	}

	private void withDraw(long money) {
		if (getDepositMoney() > 0) {
			depositMoney -= money;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액 : %,d 원  %n", getDepositMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("잔액부족");
		}
	}

	private long getDepositMoney() {
		return depositMoney;
	}

}
