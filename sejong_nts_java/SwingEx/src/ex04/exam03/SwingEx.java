package ex04.exam03;

import java.awt.*;
import javax.swing.*;

public class SwingEx {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 x 버튼
			setTitle("GUI Window - BorderLayout");
			
			// 이 아래 컨트롤 코딩
			this.setLayout(new BorderLayout(10, 10));
			
			JButton btn1 = new JButton("button1");
			JButton btn2 = new JButton("button2");
			JButton btn3 = new JButton("button3");
			JButton btn4 = new JButton("button4");
			JButton btn5 = new JButton("button5");
			
			this.add(btn1, BorderLayout.NORTH);
			this.add(btn2, BorderLayout.WEST);
			this.add(btn3, BorderLayout.CENTER);
			this.add(btn4, BorderLayout.EAST);
			this.add(btn5, BorderLayout.SOUTH);
			
			setSize(640, 480);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

}
