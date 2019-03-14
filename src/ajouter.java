import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class ajouter extends JFrame implements ActionListener{
	 private JPanel pan = new JPanel();
	 private JButton ajouter = new JButton("Ajouter un utilisateur");
	 private Font comic = new Font("Comic sans MS",Font.BOLD,18);
	 private Color couleurFond = new Color(119,170,221);
	 
	 public ajouter()
	 {
		 this.setTitle("Gestion utilisateur");
         this.setSize(800,800);
         
         pan.setBackground(couleurFond);
         ajouter.setFont(comic);
         ajouter.setBounds(635, 0, 150, 50);
         ajouter.addActionListener(this);
         
         this.setContentPane(pan);
         this.setVisible(true);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de la méthode généré automatiquement
		
	}

}
