package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 350));
		frame.setLocation(new Point(200, 100));
		frame.setTitle("Grid layout Page");
		frame.setIconImage(new ImageIcon("src/gui/mindfulness.png").getImage());

		frame.setLayout(new GridLayout());

		JButton btnlogin = new JButton();
		btnlogin.setText("Login");
		btnlogin.setBackground(Color.red);
		frame.add(btnlogin);

		JButton btncancel = new JButton();
		btncancel.setText("Cancel");
		btncancel.setBackground(Color.green);
		frame.add(btncancel);

		JLabel lbl = new JLabel();
		lbl.setText("Hello World");
		lbl.setForeground(Color.red);
		frame.add(lbl);

		JButton btnok = new JButton();
		btnok.setText("Ok");
		btnok.setBackground(Color.blue);
		frame.add(btnok);

	}

}
