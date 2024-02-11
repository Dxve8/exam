package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class practice2 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice2 window = new practice2();
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
	public practice2() {
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
		
		t1 = new JTextField();
		t1.setBounds(65, 46, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(65, 111, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btn1 = new JButton("add");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 int ans=0;
			 int a=Integer.parseInt(t1.getText());
			 int b=Integer.parseInt(t2.getText());
			 
			 ans=a+b;
			 total.setText(""+ans);			 
			 
			 
			}
		});
		btn1.setBounds(47, 192, 85, 21);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("sub");
		btn2.setBounds(168, 192, 85, 21);
		frame.getContentPane().add(btn2);
		
		total = new JTextField();
		total.setBounds(262, 80, 96, 19);
		frame.getContentPane().add(total);
		total.setColumns(10);
	}
}
