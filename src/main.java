import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class main {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost/gsb_frais","ts1","ts1");
			System.out.println("BDD fonctionnelle");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Erreur Driver");
		}
		catch(SQLException e)
		{
			System.out.println("Erreur  Database");
		}
			
		
		accueil f1 = new accueil(); 
	}

}
