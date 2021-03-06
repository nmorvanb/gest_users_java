import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;

import javax.swing.*;

public class formulaireconsulter extends JFrame implements ActionListener{
	
		private static Connection connect = null;
		private static String url = "jdbc:mysql://localhost/gsb_frais";
		private static String user = "ts1";
		private static String mdp = "ts1";
		
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
		 private JLabel indicDate = new JLabel("Format de la date requis : aaaa-MM-jj");
		 private Font comic = new Font("Comic sans MS",Font.BOLD,18);
		 private Color couleurFond = new Color(119,170,221);
		 private String id;
		 
		 private JLabel cara1 = new JLabel("4 caract�res maximum");
		 private JLabel cara2 = new JLabel("30 caract�res maximum");
		 private JLabel cara3 = new JLabel("30 caract�res maximum");
		 private JLabel cara4 = new JLabel("20 caract�res maximum");
		 private JLabel cara5 = new JLabel("20 caract�res maximum");
		 private JLabel cara6 = new JLabel("30 caract�res maximum");
		 private JLabel cara7 = new JLabel("5 caract�res maximum");
		 private JLabel cara8 = new JLabel("30 caract�res maximum");
		 private JLabel cara9 = new JLabel("30 caract�res maximum");

		 @SuppressWarnings("deprecation")
		public formulaireconsulter(String id)
		 {
			PreparedStatement util;
			try {
				connect =  DriverManager.getConnection(url, user, mdp);
				util = connect.prepareStatement("select * from visiteur where id = '"+id+"'");
				ResultSet res = util.executeQuery();
				while(res.next()){
					txtId.setText(res.getString("id"));
					txtNom.setText(res.getString("nom"));
					txtPrenom.setText(res.getString("prenom"));
					txtLogin.setText(res.getString("login"));
					txtMdp.setText(res.getString("mdp"));
					txtAdresse.setText(res.getString("adresse"));
					txtCp.setText(res.getString("cp"));
					txtVille.setText(res.getString("ville"));
					txtDateEmbauche.setText(res.getString("dateEmbauche"));
					txtMetier.setText(res.getString("metier"));
				}
			} catch (SQLException e) {
				// TODO Bloc catch g�n�r� automatiquement
				e.printStackTrace();
			}
			
			 
			 this.setTitle("Gestion utilisateur");
	         this.setSize(800,800);
	         this.setLocationRelativeTo(null);
	         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         this.setResizable(false);
	         
	         this.id=id;
	         
	         pan.setLayout(null);
	         
	         pan.setBackground(couleurFond);
	         
	         retour.setFont(comic);
	         retour.setBounds(0,0,150,50);
	         retour.addActionListener(this);
	         
	         lbId.setFont(comic);
	         lbId.setBounds(155,60,50,50);
	         txtId.setBounds(210,70,50,30);
	         txtId.setEditable(false);
	         
	         lbNom.setFont(comic);
	         lbNom.setBounds(135,120,70,50);
	         txtNom.setBounds(210,130,380,30);
	         txtNom.setEditable(false);
	         
	         lbPrenom.setFont(comic);
	         lbPrenom.setBounds(102,180,120,50);
	         txtPrenom.setBounds(210,190,380,30);
	         txtPrenom.setEditable(false);
	         
	         lbLogin.setFont(comic);
	         lbLogin.setBounds(118,240,100,50);
	         txtLogin.setBounds(210,250,380,30);
	         txtLogin.setEditable(false);
	         
	         lbMdp.setFont(comic);
	         lbMdp.setBounds(38,300,170,50);
	         txtMdp.setBounds(210,310,380,30);
	         txtMdp.setEditable(false);
	         
	         lbAdresse.setFont(comic);
	         lbAdresse.setBounds(94,360,170,50);
	         txtAdresse.setBounds(210,370,380,30);
	         txtAdresse.setEditable(false);
	         
	         lbCp.setFont(comic);
	         lbCp.setBounds(49,420,170,50);
	         txtCp.setBounds(210,430,380,30);
	         txtCp.setEditable(false);
	         
	         lbVille.setFont(comic);
	         lbVille.setBounds(125,480,100,50);
	         txtVille.setBounds(210,490,380,30);
	         txtVille.setEditable(false);
	         
	         lbDateEmbauche.setFont(comic);
	         lbDateEmbauche.setBounds(20,540,190,50);
	         indicDate.setBounds(210,525,250,30);
	         txtDateEmbauche.setBounds(210,550,380,30);
	         txtDateEmbauche.setEditable(false);
	         
	         lbMetier.setFont(comic);
	         lbMetier.setBounds(105,600,100,50);
	         txtMetier.setBounds(210,610,380,30);
	         txtMetier.setEditable(false);
	         
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
	         pan.add(indicDate);
	         pan.add(txtDateEmbauche);
	         pan.add(lbMetier);
	         pan.add(txtMetier);
	         
	         pan.add(cara1);
	         cara1.setBounds(210,45,200,30);
	         pan.add(cara2);
	         cara2.setBounds(210,105,200,30);
	         pan.add(cara3);
	         cara3.setBounds(210,165,200,30);
	         pan.add(cara4);
	         cara4.setBounds(210,225,200,30);
	         pan.add(cara5);
	         cara5.setBounds(210,285,200,30);
	         pan.add(cara6);
	         cara6.setBounds(210,345,200,30);
	         pan.add(cara7);
	         cara7.setBounds(210,405,200,30);
	         pan.add(cara8);
	         cara8.setBounds(210,465,200,30);
	         pan.add(cara9);
	         cara9.setBounds(210,585,200,30);
	         
	         this.setContentPane(pan);
	         this.setVisible(true);
		 }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Stub de la m�thode g�n�r� automatiquement
			if(e.getSource()==retour)
			{
				this.setVisible(false);
				consulter cons = new consulter();
			}
		}
}