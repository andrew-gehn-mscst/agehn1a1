package agehn1a1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JLabel grosspayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Gross Pay:");
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNewButton_actionPerformed(arg0);
			}
		});
		
		grosspayLabel = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(grosspayLabel, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(114, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(grosspayLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(100))
		);
		contentPane.setLayout(gl_contentPane);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		int hours = 40;
	      double grossPay, payRate = 25.0;
	      
	      grossPay = hours * payRate;
	      grosspayLabel.setText("Your gross pay is $" + grossPay);
	}
}
