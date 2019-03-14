import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class consulter extends JFrame implements ActionListener, KeyListener {
	
	private JPanel pan = new JPanel();
    private ImageIcon image = new ImageIcon("images/gsblogo.png");
    private JLabel logo = new JLabel(image,JLabel.CENTER);
    private JButton deconnexion = new JButton("Deconnexion");
    private JButton retour = new JButton("Retour");
    private JButton rechercher = new JButton("Rechercher");
    private JTextField search = new JTextField();
    private Font comic = new Font("Comic sans MS",Font.BOLD,18);
    private Color couleurFond = new Color(119,170,221);
    private Font comic2 = new Font("Comic sans MS",Font.BOLD,15);
    private modeleJTable mod = new modeleJTable();
    private JTable jtable = new JTable(mod);
	private JScrollPane jscrollpane = new JScrollPane(jtable);
	private JPanel pan2 = new JPanel();
    
    public consulter()
	 {
		this.setTitle("Gestion utilisateur");
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pan.setLayout(null);
        pan.setBackground(couleurFond);
        
        pan2.setBounds(150,200,500,450);
        pan2.add(jscrollpane);
        
        retour.setFont(comic);
        retour.setBounds(150, 0, 150, 50);
        retour.addActionListener(this);
        
        deconnexion.setFont(comic);
        deconnexion.setBounds(500, 0, 150, 50);
        deconnexion.addActionListener(this);
        
        search.setFont(comic2);
        search.setBounds(150,150,350,25);
        search.addKeyListener(this);
        
        rechercher.setFont(comic2);
        rechercher.setBounds(500, 150, 150, 25);
        
        pan.add(retour);
        pan.add(deconnexion);
        pan.add(search);
        pan.add(rechercher);
        pan.add(pan2);
        
        
        this.setContentPane(pan);
        this.setVisible(true);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de la méthode généré automatiquement
		if (e.getSource()== deconnexion)
        {
                this.setVisible(false);
                accueil f1 = new accueil();
        }
		else if (e.getSource()== retour)
        {
            this.setVisible(false);
            gest g1 = new gest();
    }
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Stub de la méthode généré automatiquement
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Stub de la méthode généré automatiquement
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Stub de la méthode généré automatiquement
		
	}

}
