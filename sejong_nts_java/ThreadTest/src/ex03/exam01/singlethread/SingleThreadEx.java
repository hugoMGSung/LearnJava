package ex03.exam01.singlethread;

public class SingleThreadEx extends Thread {

	private int[] temp;
	
	public SingleThreadEx(String thName) {
		super(thName);
		temp = new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
	}
	
	@Override
	public void run() {
		for (int start:temp) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("스레드명 = " + currentThread().getName());
			System.out.println("temp value = " + start);
		}
	}
	
	public static void main(String[] args) {
		SingleThreadEx sth = new SingleThreadEx("첫번째");
		//SingleThreadEx str = new SingleThreadEx("두번째");
		sth.start();
		//str.start();
	}

}
