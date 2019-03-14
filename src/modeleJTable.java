import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class modeleJTable extends AbstractTableModel {

	
	private static final long serialVersionUID = 1L;
	private String[] nomColonnes;
	private Vector<String []> lignes;

	public modeleJTable () {
		nomColonnes = new String[] {
				"Id",
				"Prénom",
				"Nom"
		};
		lignes = new Vector<String []>() ;
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
	

}