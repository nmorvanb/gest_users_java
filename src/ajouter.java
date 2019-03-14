import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class ajouter extends JFrame implements ActionListener{
	 private JPanel pan = new JPanel();
	 private JButton retour = new JButton("Retour");
	 private JLabel lbId = new JLabel("ID : ");
	 private JTextField txtId = new JTextField();
	 private JLabel lbNom = new JLabel("NOM : ");
	 private JTextField txtNom = new JTextField();
	 private JLabel lbPrenom = new JLabel("PRENOM : ");
	 private JTextField txtPrenom = new JTextField();
	 private JLabel lbLogin = new JLabel("LOGIN : ");
	 private JTextField txtLogin = new JTextField();
	 private JLabel lbMdp = new JLabel("MOT DE PASSE : ");
	 private JTextField txtMdp = new JTextField();
	 private JLabel lbAdresse = new JLabel("ADRESSE : ");
	 private JTextField txtAdresse = new JTextField();
	 private JLabel lbCp = new JLabel("CODE POSTAL : ");
	 private JTextField txtCp = new JTextField();
	 private JLabel lbVille = new JLabel("VILLE : ");
	 private JTextField txtVille = new JTextField();
	 private JLabel lbDateEmbauche = new JLabel("DATE EMBAUCHE : ");
	 private JTextField txtDateEmbauche = new JTextField();
	 private JLabel lbMetier = new JLabel("METIER : ");
	 private JTextField txtMetier = new JTextField();
	 private JButton ajouter = new JButton("Ajouter un utilisateur");
	 private Font comic = new Font("Comic sans MS",Font.BOLD,18);
	 private Color couleurFond = new Color(119,170,221);
	 
	 public ajouter()
	 {
		 this.setTitle("Gestion utilisateur");
         this.setSize(800,800);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         pan.setLayout(null);
         
         pan.setBackground(couleurFond);
         
         retour.setFont(comic);
         retour.setBounds(0,0,150,50);
         retour.addActionListener(this);
         
         lbId.setFont(comic);
         lbId.setBounds(320,60,100,50);
         txtId.setBounds(370,60,150,50);
         lbNom.setFont(comic);
         lbNom.setBounds(0,120,100,50);
         txtNom.setBounds(100,120,150,50);
         lbPrenom.setFont(comic);
         lbPrenom.setBounds(0,180,100,50);
         txtPrenom.setBounds(100,180,150,50);
         lbLogin.setFont(comic);
         lbLogin.setBounds(0,240,100,50);
         txtLogin.setBounds(100,240,150,50);
         lbMdp.setFont(comic);
         lbMdp.setBounds(0,300,100,50);
         txtMdp.setBounds(100,300,150,50);
         lbAdresse.setFont(comic);
         lbAdresse.setBounds(0,360,100,50);
         txtAdresse.setBounds(100,360,150,50);
         lbCp.setFont(comic);
         lbCp.setBounds(0,420,100,50);
         txtCp.setBounds(100,420,150,50);
         lbVille.setFont(comic);
         lbVille.setBounds(0,480,100,50);
         txtVille.setBounds(100,480,150,50);
         lbDateEmbauche.setFont(comic);
         lbDateEmbauche.setBounds(0,540,100,50);
         txtDateEmbauche.setBounds(100,540,150,50);
         lbMetier.setFont(comic);
         lbMetier.setBounds(0,600,100,50);
         txtMetier.setBounds(100,600,150,50);
         
         ajouter.setFont(comic);
         ajouter.setBounds(0,660, 300, 50);
         ajouter.addActionListener(this);
         
         pan.add(retour);
         pan.add(lbId);
         pan.add(txtId);
         pan.add(lbNom);
         pan.add(txtNom);
         pan.add(lbPrenom);
         pan.add(txtPrenom);
         pan.add(lbLogin);
         pan.add(txtLogin);
         pan.add(lbMdp);
         pan.add(txtMdp);
         pan.add(lbAdresse);
         pan.add(txtAdresse);
         pan.add(lbCp);
         pan.add(txtCp);
         pan.add(lbVille);
         pan.add(txtVille);
         pan.add(lbDateEmbauche);
         pan.add(txtDateEmbauche);
         pan.add(lbMetier);
         pan.add(txtMetier);
         pan.add(ajouter);
         
         
         
         this.setContentPane(pan);
         this.setVisible(true);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource()== retour)
		 {
         		this.setVisible(false);
                 gest f1 = new gest();
		
		 }
	}

}
