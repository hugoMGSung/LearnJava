package ex04.exam08;

import java.awt.*;
import javax.swing.*;

public class SwingEx {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 x 버튼
			setTitle("GUI Window - ImageButton");
			
			// 이 아래 컨트롤 코딩
			this.setLayout(new FlowLayout());
			
			ImageIcon img1 = new ImageIcon("image/java1.png");
			ImageIcon img2 = new ImageIcon("image/java2.png");
			
			JButton btn1 = new JButton("button1", img1);
			this.add(btn1);

			JLabel lbl1 = new JLabel("Label1");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);
			
			setSize(640, 480);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}
