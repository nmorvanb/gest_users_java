import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class accueil extends JFrame implements ActionListener {
	private JPanel pan = new JPanel();
	private ImageIcon image = new ImageIcon("images/gsblogo.png");
	private ImageIcon imagef = new ImageIcon("images/fond.png");
	private JLabel logo = new JLabel(image,JLabel.CENTER);
	private JLabel fond = new JLabel(imagef, JLabel.CENTER);
	private JLabel userLabel = new JLabel("Nom d'utilisateur");
	private JLabel mdpLabel = new JLabel("Mot de passe");
	private JTextArea user = new JTextArea();
	private JTextArea mdp = new JTextArea();
	private JButton connexion = new JButton("Connexion");
	private Font comic = new Font("Comic sans MS",Font.BOLD,18);
	private Font comic2 = new Font("Comic sans MS",Font.BOLD,15);
	
	public accueil() {
		this.setTitle("Accueil");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan.setLayout(null);
		
		fond.setBounds(0,0,800,800);
		logo.setBounds(230, 0, 318, 213);
		userLabel.setFont(comic);
		userLabel.setBounds(230, 300, 200, 150);
		user.setFont(comic2);
		user.setForeground(Color.red);
		user.setBounds(230,400,200,25);
		mdpLabel.setFont(comic);
		
		
		pan.add(logo);
		pan.add(userLabel);
		pan.add(user);
		pan.add(fond);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Stub de la méthode généré automatiquement
		
	}
}
