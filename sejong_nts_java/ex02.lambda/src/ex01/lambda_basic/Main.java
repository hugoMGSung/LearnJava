package ex01.lambda_basic;

public class Main extends Thread {
	public static void main(String[] args) {   
		new Thread(new Runnable() {     
			@Override
			public void run() {    
				System.out.println("Thread 생성...(람다식 사용하지 않음)");  
				}    
			}).start();    
		
		new Thread(()-> {      
			System.out.println("Thread 생성... (람다식 사용)");    
			}).start();  
		}
}
