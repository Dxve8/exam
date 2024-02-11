package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gender {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gender window = new gender();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gender() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("male\\");
		b1.setBounds(32, 31, 103, 21);
		frame.getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("female");
		b2.setBounds(167, 31, 103, 21);
		frame.getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("others");
		b3.setBounds(311, 31, 103, 21);
		frame.getContentPane().add(b3);
		
		JButton submit = new JButton("New button");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message="is selected";
				if( b1.isSelected()) {
					message=message+b1.getText();
					  t1.setText(message);
				}
			}
		});
		submit.setBounds(159, 94, 85, 21);
		frame.getContentPane().add(submit);
		
		t1 = new JTextField();
		t1.setBounds(148, 168, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
	}
}
