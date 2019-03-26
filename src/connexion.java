import java.sql.*;

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
	
}
