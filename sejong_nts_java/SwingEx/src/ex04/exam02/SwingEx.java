package ex04.exam02;

import java.awt.*;
import javax.swing.*;

public class SwingEx {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 x 버튼
			setTitle("GUI Window - FlowLayout");
			
			// 이 아래 컨트롤 코딩
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("button1");
			JButton btn2 = new JButton("button2");
			JButton btn3 = new JButton("button3");
			JButton btn4 = new JButton("button4");
			btn1.setPreferredSize(new Dimension(180, 30));
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btn4);
			
			setSize(640, 480);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

}
