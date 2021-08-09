package ex03.exam03.multithread;

public class Main {

	public static void main(String[] args) {
		MultiThreadEx threadex = new MultiThreadEx();
		MultiThreadEx threadex2 = new MultiThreadEx();
		Thread thread1 = new Thread(threadex, "A");
		Thread thread2 = new Thread(threadex2, "B");
			
		thread1.start();
		thread2.start();
			
		Thread.currentThread().getName();
	}

}
