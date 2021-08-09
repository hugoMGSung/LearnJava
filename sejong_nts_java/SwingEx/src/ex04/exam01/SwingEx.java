package ex04.exam01;

import javax.swing.JFrame;

public class SwingEx {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 x 버튼
			setTitle("GUI Window");
			
			// 이 아래 컨트롤 코딩
			
			setSize(640, 480);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

}
