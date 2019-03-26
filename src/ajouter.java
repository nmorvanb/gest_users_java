import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;

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
	 private Connection cnx = connexion.getInstance();
	 
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
         lbId.setBounds(155,60,50,50);
         txtId.setBounds(210,70,50,30);
         lbNom.setFont(comic);
         lbNom.setBounds(135,120,70,50);
         txtNom.setBounds(210,130,380,30);
         lbPrenom.setFont(comic);
         lbPrenom.setBounds(102,180,120,50);
         txtPrenom.setBounds(210,190,380,30);
         lbLogin.setFont(comic);
         lbLogin.setBounds(118,240,100,50);
         txtLogin.setBounds(210,250,380,30);
         lbMdp.setFont(comic);
         lbMdp.setBounds(38,300,170,50);
         txtMdp.setBounds(210,310,380,30);
         lbAdresse.setFont(comic);
         lbAdresse.setBounds(94,360,170,50);
         txtAdresse.setBounds(210,370,380,30);
         lbCp.setFont(comic);
         lbCp.setBounds(49,420,170,50);
         txtCp.setBounds(210,430,380,30);
         lbVille.setFont(comic);
         lbVille.setBounds(125,480,100,50);
         txtVille.setBounds(210,490,380,30);
         lbDateEmbauche.setFont(comic);
         lbDateEmbauche.setBounds(20,540,190,50);
         txtDateEmbauche.setBounds(210,550,380,30);
         lbMetier.setFont(comic);
         lbMetier.setBounds(105,600,100,50);
         txtMetier.setBounds(210,610,380,30);
         
         ajouter.setFont(comic);
         ajouter.setBounds(240,660, 300, 50);
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
		 else if(e.getSource()== ajouter)
		 {
			 try {
				connexion.ajoutUtile(txtId.getText(),txtNom.getText(),txtPrenom.getText(),txtLogin.getText(),txtMdp.getText(),txtAdresse.getText(),txtCp.getText(),txtVille.getText(),txtDateEmbauche.getText(),txtMetier.getText());

			} catch (ParseException e1) {
				// TODO Bloc catch généré automatiquement
				e1.printStackTrace();
			}
			 
		 } 
	}

}
