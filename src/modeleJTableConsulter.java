import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class modeleJTableConsulter extends AbstractTableModel {

	
	private static final long serialVersionUID = 1L;
	private String[] nomColonnes;
	private Vector<String []> lignes;
	private static Connection connect = null;
	private static String url = "jdbc:mysql://localhost/gsb_frais";
	private static String user = "ts1";
	private static String mdp = "ts1";

	public modeleJTableConsulter () {
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
				if (res.getString("id").toLowerCase().contains(search) == true){
					lignes.add(new String[]{res.getString("id"),res.getString("nom"),res.getString("prenom")});
				}
				else if (res.getString("nom").toLowerCase().contains(search) == true){
					lignes.add(new String[]{res.getString("id"),res.getString("nom"),res.getString("prenom")});
				}
				else if (res.getString("prenom").toLowerCase().contains(search) == true){
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
}