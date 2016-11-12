import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class Test {

	public Test(){
		JFrame fenetre = new JFrame("Menu");
		JLabel consignetaille = new JLabel("Choisir la taille du plateau (10 minimum):");
		JLabel proportion = new JLabel("Entrez la propostion de rocher(en%):")
		fenetre.getContentPane().setLayout(new FlowLayout());
		fenetre.setPreferredSize(new Dimension(300,300));
		fenetre.setResizable(false);
		fenetre.pack();
		JTextField taille= new JTextField();
		taille.setPreferredSize( new Dimension(200,20));
		
		fenetre.add(consignetaille);
		fenetre.add(taille);
		
		JLabel label = new JLabel("Hello world");
	//	fenetre.add(label);

		
//		JDialog dialog = new JDialog(fenetre,"Dialog");
//		dialog.setModal(true);
//		dialog.setPreferredSize(new Dimension(150,50));
//		dialog.add(label);
//		dialog.pack();
//		dialog.setLocationRelativeTo(null);
//		dialog.setVisible(true);
		
	//	JButton[] tabBut = new JButton[]{new JButton("Nord"),new JButton("Ouest"),new JButton("Centre"),new JButton("Est"),new JButton("Sud")};
//		JPanel testpanel = new JPanel();
//		for(int i = 0 ; i<16;i++){
//			fenetre.add(new JButton("bouton"+i));
//		}
		//testpanel.setLayout(new BorderLayout());
//
//		fenetre.add(testpanel);
		
		
		
		fenetre.setVisible(true);
		fenetre.setLocationRelativeTo(null);
//		fenetre.setDefaultCloseOperation(fenetre.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new Test();
			}
			
		});
	}

}
