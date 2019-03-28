import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

public class modeleJTableModifier extends AbstractTableModel {

	
	private static final long serialVersionUID = 1L;
	private String[] nomColonnes;
	private Vector<String []> lignes;
	private static Connection connect = null;
	private static String url = "jdbc:mysql://localhost/gsb_frais";
	private static String user = "ts1";
	private static String mdp = "ts1";

	public modeleJTableModifier () {
		nomColonnes = new String[] {
				"Id",
				"Prénom",
				"Nom"
		};
		lignes = new Vector<String []>() ;
		try {
			connect =  DriverManager.getConnection(url, user, mdp);
		} catch (SQLException e) {
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
	}
	
	/**
	 * @ return nombre de colonnes dans l'objet JTable
	 */
	public int getColumnCount() {
		
		return nomColonnes.length;
	}

	/**
	 * @ return nombre de lignes dans l'objet JTable
	 */
	public int getRowCount() {
		
		return lignes.size();
	}

	/**
	 * @param rowIndex : n°ligne
	 * @param columnIndex : n°colonne
	 * @return la valeur qui se trouve au n°ligne et au n°colonne
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return lignes.get(rowIndex)[columnIndex];
	}
	
	/**
	 * @param column : numéro de la colonne dans l'objet JTable
	 * @return le nom de la colonne
	 */
	public String getColumnName(int column) {
		
		return nomColonnes[column];
	}
	
	public void consultUtil(){
		try {
			PreparedStatement util = connect.prepareStatement("select id,nom,prenom from visiteur" );
			ResultSet res = util.executeQuery();
			lignes = new Vector<String[]>();
			while(res.next()){
				lignes.add(new String[]{res.getString("id"),res.getString("nom"),res.getString("prenom")});
			}
			fireTableDataChanged();
		} 
		catch (SQLException e) 
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
	}
	public void consultUtil(String search){
		try {
			PreparedStatement util = connect.prepareStatement("select id,nom,prenom from visiteur" );
			ResultSet res = util.executeQuery();
			lignes = new Vector<String[]>();
			while(res.next())
			{
				if (res.getString("id").contains(search) == true){
					lignes.add(new String[]{res.getString("id"),res.getString("nom"),res.getString("prenom")});
				}
				else if (res.getString("nom").contains(search) == true){
					lignes.add(new String[]{res.getString("id"),res.getString("nom"),res.getString("prenom")});
				}
				else if (res.getString("prenom").contains(search) == true){
					lignes.add(new String[]{res.getString("id"),res.getString("nom"),res.getString("prenom")});
				}
			}
			fireTableDataChanged();                              
		}
		catch (SQLException e) 
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
	}
	public static void modifUtil(String id, String login, String mdp, String adresse ,String cp, String ville){
		try {
			Statement req = connect.createStatement();
			if (!login.equals(""))
			{
				req.execute("UPDATE visiteur SET login = ('" + login +"') WHERE id = '"+id+"'");
			}
			if (!mdp.equals(""))
			{
				req.execute("UPDATE visiteur SET mdp = ('" + mdp +"') WHERE id = '"+id+"'");
			}
			if (!adresse.equals(""))
			{
				req.execute("UPDATE visiteur SET adresse = ('" + adresse +"') WHERE id = '"+id+"'");
			}
			if (!cp.equals(""))
			{
				req.execute("UPDATE visiteur SET cp = ('" + cp +"') WHERE id = '"+id+"'");
			}
			if (!ville.equals(""))
			{
				req.execute("UPDATE visiteur SET ville = ('" + ville +"') WHERE id = '"+id+"'");
			}		
		}
		catch (SQLException e) 
		{
			// TODO Bloc catch généré automatiquement
			e.printStackTrace();
		}
	}
}