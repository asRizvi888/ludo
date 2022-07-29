package LUDO_BUILD;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameScreen {
	   public static void main(String[] args) {
	        JFrame jframe = new JFrame();
			jframe.setLayout(null);
			
			JFrame window = new JFrame();
		
			JLabel title = new JLabel("PLAY LUDO");
			JButton btn4 = new JButton("4 COINS");
			JButton btn6 = new JButton("6 COINS");
			
			jframe.setBounds(10,10,1000,600);
	        jframe.setTitle("LUDO");
	        jframe.setResizable(false);
			jframe.setVisible(true);
	        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			window.setBounds(10,10,1000,600);
	        window.setResizable(false);
			window.setResizable(false);
			window.getContentPane().setBackground(Color.WHITE);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			title.setFont(new Font("sherif", Font.BOLD, 40));

			title.setBounds(400, 50, 300, 100);			
			btn4.setBounds(400, 250, 250, 50);
			btn6.setBounds(400, 350, 250, 50);
	        
			jframe.add(title);
			jframe.add(btn4);
			jframe.add(btn6);
			
			btn4.addActionListener((ActionEvent e) -> {
				
				window.setVisible(true);
				window.setTitle("LUDO with 4 coins");
				
				GameMoves gm = new GameMoves();

				gm.setFocusable(true);
				gm.addKeyListener(gm);
				gm.addMouseListener(gm);
				window.add(gm);
				
				gm.setVisible(true);
				jframe.dispose();
			});
			
			btn6.addActionListener((ActionEvent e) -> {
				
				window.setVisible(true);
				window.setTitle("LUDO with 6 coins");
				
				GameMoveSix gs = new GameMoveSix();
				
				gs.setFocusable(true);
				gs.addKeyListener(gs);
				gs.addMouseListener(gs);
				window.add(gs);
				
				gs.setVisible(true);
				jframe.dispose();
			});	
	   }
}
