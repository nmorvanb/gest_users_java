import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gest extends JFrame implements ActionListener{

	private JPanel pan = new JPanel();
	private ImageIcon image = new ImageIcon("images/gsblogo.png");
	private ImageIcon imagef = new ImageIcon("images/fond.png");
	private JLabel logo = new JLabel(image,JLabel.CENTER);
	private JLabel fond = new JLabel(imagef, JLabel.CENTER);
	private JButton deconnexion = new JButton("Deconnexion");
	private JButton modifier = new JButton("Modifier");
	private JButton consulter = new JButton("Consulter");
	private JButton ajouter = new JButton("Ajouter");
	private Font comic = new Font("Comic sans MS",Font.BOLD,18);
	
	public gest() {
		this.setTitle("Gestion utilisateur");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan.setLayout(null);
		
		fond.setBounds(0,0,800,800);
		
		logo.setBounds(0, 0, 318, 213);
		
		deconnexion.setFont(comic);
		deconnexion.setBounds(700, 0, 100, 50);
		
		pan.add(logo);
		pan.add(deconnexion);
		pan.add(fond);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}


	
}
