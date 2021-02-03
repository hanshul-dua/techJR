package loops;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnotherGUI {
	
	public AnotherGUI() {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("If you click here you will get and ox on adopt me");
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,20));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		 new AnotherGUI();

	}

}
