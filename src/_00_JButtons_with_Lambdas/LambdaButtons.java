package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		tellAJoke.addActionListener((joke)->{
			JOptionPane.showMessageDialog(null, "a joke");
		});
		addNumbers.addActionListener((joke)->{
			String one=JOptionPane.showInputDialog("first number");
			String two=JOptionPane.showInputDialog("2nd number");
			int i=Integer.parseInt(one);
			int j=Integer.parseInt(two);
			JOptionPane.showMessageDialog(null, i+j);
		});
		randNumber.addActionListener((ra)->{
			Random rand = new Random();
			
			JOptionPane.showMessageDialog(null, rand.nextInt(Integer.MAX_VALUE));
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
