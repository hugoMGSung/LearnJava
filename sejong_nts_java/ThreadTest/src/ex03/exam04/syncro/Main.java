package ex03.exam04.syncro;

public class Main {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "엄마1");
		Thread son = new Thread(atm, "아들1");
		
		mom.start();
		son.start();
	}

}
