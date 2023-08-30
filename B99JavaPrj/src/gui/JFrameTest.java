package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setSize(new Dimension(500, 350));
		frame.setLocation(new Point(500, 200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setTitle("Login Form");
		frame.setLayout(new FlowLayout());

		JButton bnt = new JButton();
		bnt.setText("Click Me");
		bnt.setSize(new Dimension(500, 200));
		bnt.setBackground(Color.black);
		bnt.setForeground(Color.CYAN);
		frame.add(bnt);

		JLabel lbl = new JLabel();
		lbl.setText("Enter Your Name");
		lbl.setForeground(Color.red);
		frame.add(lbl);

		JTextField txt = new JTextField();
		txt.setText("Su Su");
		txt.setColumns(13);
		frame.add(txt);

		JButton bnt2 = new JButton();
		bnt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txt.getText();
				JOptionPane.showMessageDialog(null, name + " is login successfully");
			}

		});
		bnt2.setText("Login");
		bnt2.setForeground(Color.green);
		frame.add(bnt2);

	}

}
