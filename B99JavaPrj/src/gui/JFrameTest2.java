package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);

		frame.setSize(new Dimension(500, 350));
		frame.setLocation(new Point(200, 100));
		frame.setTitle("Window Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JButton btn = new JButton();
		btn.setText("Login Button");
		btn.setBackground(Color.cyan);
		frame.add(btn, BorderLayout.EAST);

		JButton btncancel = new JButton();
		btncancel.setText("Login Button");
		btncancel.setBackground(Color.cyan);
		frame.add(btncancel, BorderLayout.WEST);

		JTextField txtname = new JTextField();
		txtname.setText("Admin User");
		txtname.setColumns(10);
		txtname.setForeground(Color.RED);
		frame.add(txtname, BorderLayout.NORTH);
		
		JButton btnok = new JButton();
		btnok.setText("Login Button");
		btnok.setBackground(Color.red);
		frame.add(btnok, BorderLayout.SOUTH);
		
		JButton btnclick = new JButton();
		btnclick.setText("Login Button");
		btnclick.setBackground(Color.pink);
		frame.add(btnclick, BorderLayout.CENTER);
		
		frame.setIconImage(new ImageIcon("src/gui/mindfulness.png").getImage());
		
	}

}
