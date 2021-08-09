package ex04.exam11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingEx {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 x 버튼
			setTitle("GUI Window - Events");
			
			// 이 아래 컨트롤 코딩
			this.setLayout(new FlowLayout());
			
			ImageIcon img1 = new ImageIcon("image/java3.png");
			JButton btn1 = new JButton("button1", img1);
			// event
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					btn1.setBackground(Color.green);
					JOptionPane.showMessageDialog(null, "1번 버튼 눌렀네");
				}
			});
			this.add(btn1);
			
			setSize(640, 480);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

}
