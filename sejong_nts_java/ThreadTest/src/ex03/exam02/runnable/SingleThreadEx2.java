package ex03.exam02.runnable;

public class SingleThreadEx2 implements Runnable {

	private int[] temp;
	
	public SingleThreadEx2() {
		temp = new int[10];
		
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		for (int start = 0; start < temp.length; start++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("스레드명 : " + Thread.currentThread().getName());
			System.out.println("temp value : " + start);
		}
	}
	
	public static void main(String[] args) {
		SingleThreadEx2 sth = new SingleThreadEx2();
		Thread th = new Thread(sth, "첫번째");
		th.start();
	}

}
