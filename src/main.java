import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.*;

public class main {

	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement

		Connection cnx;
		cnx = connexion.getInstance();
		boolean oui = connexion.verifUtil("pbentot","doyw1");
			
		
		accueil f1 = new accueil(); 
	}

}
