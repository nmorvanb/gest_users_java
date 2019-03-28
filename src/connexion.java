import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;

import javax.swing.JOptionPane;  
public class connexion {

	private static String url = "jdbc:mysql://localhost/gsb_frais";

	/**
	 * Nom du user
	 */
	private static String user = "ts1";

	/**
	 * Mot de passe du user
	 */
	private static String passwd = "ts1";

	/**
	 * Objet Connection
	 */
	private static Connection connect = null;
	
	/**
	 * Méthode qui va nous retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return un objet connection
	 */
	public static Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return connect;	
	}	
	
	/**
	 * Méthode qui met fin à la connexion
	 */
	public static void close() {
		 if (connect != null) {
             try {
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	}
	
	public static boolean verifUtil(String login, String mdp){

		try {
			PreparedStatement util = connect.prepareStatement("select login,mdp from visiteur where metier = 'administrateur'");
			ResultSet res = util.executeQuery();
			while(res.next()){
				if(res.getString("login").equals(login) && res.getString("mdp").equals(mdp)){
					System.out.println("ok");
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
		return false;
	}
	public static void ajoutUtile(String id, String nom, String prenom, String login, String mdp, String adresse, String cp, String ville, String date, String metier) throws ParseException
	{
		DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateValide = sourceFormat.parse(date);
		java.sql.Date sqlDate = new java.sql.Date(dateValide.getTime());
		
			Statement req;
			
			try {
				req = connect.createStatement();
				req.execute("INSERT INTO visiteur(id,nom,prenom,login,mdp,adresse,cp,ville,dateEmbauche,metier) VALUES('" + id +"','" + nom + "','" + prenom + "', '" + login + "' ,'" + mdp + "', '" + adresse + "','"+ cp + "', '" + ville + "', '" + sqlDate + "', '" + metier + "')");
				JOptionPane.showMessageDialog(null,"Ajout de l'utilisateur réussi");
			} catch (SQLException e) {
				// TODO Bloc catch généré automatiquement
				JOptionPane.showMessageDialog(null,"Erreur de saisie");
			}	
	}
	
}
