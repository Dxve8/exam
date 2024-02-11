package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class practice {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice window = new practice();
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
	public practice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("male");
		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (b1.isSelected()){
					JOptionPane.showMessageDialog(null,"male is selecred ");
					
				}
			}
		});
		b1.setBounds(35, 56, 103, 21);
		frame.getContentPane().add(b1);
		
		JRadioButton b2 = new JRadioButton("femlale");
		b2.setBounds(179, 56, 103, 21);
		frame.getContentPane().add(b2);
		
		JRadioButton b3 = new JRadioButton("others");
		b3.setBounds(300, 56, 103, 21);
		frame.getContentPane().add(b3);
		
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (b2.isSelected()) {
					JOptionPane.showMessageDialog(null,"felame is selected ");
				}
				if (b3.isSelected()){
	                JOptionPane.showMessageDialog(null,"others is selected ");
	        	}
			}
		});
		submit.setAction(action);
		submit.setBounds(103, 228, 145, 45);
		frame.getContentPane().add(submit);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
