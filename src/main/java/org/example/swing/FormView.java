package org.example.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormView {
	private static final int X_WIDTH = 30;
	private static final int OPERATOR_WIDTH = 10;
	private static final int Y_WIDTH = 30;

	private int x;
	private int y;
	private int expectedResult;

	public FormView(int x, int y, int expectedResult) {
		this.x = x;
		this.y = y;
		this.expectedResult = expectedResult;
	}

	public void paint() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLocation(600, 400);

		JPanel panel = new JPanel(null);

		JLabel lblX = new JLabel("" + x);
		lblX.setBounds(65, 31, X_WIDTH, 14);
		panel.add(lblX);

		JLabel lblPlus = new JLabel("+");
		lblPlus.setBounds(65 + X_WIDTH + OPERATOR_WIDTH, 31, OPERATOR_WIDTH, 14);
		panel.add(lblPlus);

		JLabel lblY = new JLabel("" + y);
		lblY.setBounds(65 + X_WIDTH + OPERATOR_WIDTH + Y_WIDTH, 31, Y_WIDTH, 14);
		panel.add(lblY);

		JLabel lblEquals = new JLabel("=");
		lblEquals.setBounds(65 + X_WIDTH + OPERATOR_WIDTH + Y_WIDTH + OPERATOR_WIDTH + 10, 31, OPERATOR_WIDTH, 14);
		panel.add(lblEquals);

		final JTextField answerField = new JTextField();
		answerField.setBounds(65 + X_WIDTH + OPERATOR_WIDTH + Y_WIDTH + OPERATOR_WIDTH + 20, 31, 40, 20);
		answerField.setColumns(10);
		panel.add(answerField);

		JButton btnSubmit = new JButton("Pārbaudīt");
		//        btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setForeground(Color.ORANGE);
		btnSubmit.setBounds(65 + 30, 50, 89, 23);
		panel.add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (answerField.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Data Missing");
				else {
					JOptionPane.showMessageDialog(null, "Data Submitted");
				}

				int answer = Integer.parseInt(answerField.getText());
//				if (answer == this.) {
//
//				}
			}
		});

		frame.setContentPane(panel);

		//        frame.pack();
		frame.setVisible(true);
	}
}
