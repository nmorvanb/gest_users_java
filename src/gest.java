import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class gest extends JFrame implements ActionListener{

        private JPanel pan = new JPanel();
        private ImageIcon image = new ImageIcon("images/gsblogo.png");
        private JLabel logo = new JLabel(image,JLabel.CENTER);
        private JButton deconnexion = new JButton("Deconnexion");
        private JButton modifier = new JButton("Modifier");
        private JButton consulter = new JButton("Consulter");
        private JButton ajouter = new JButton("Ajouter");
        private Font comic = new Font("Comic sans MS",Font.BOLD,18);
        private Color couleurFond = new Color(119,170,221);
        
        public gest() {
                this.setTitle("Gestion utilisateur");
                this.setSize(800,800);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                pan.setLayout(null);
                
                logo.setBounds(0, 0, 318, 213);
                
                deconnexion.setFont(comic);
                deconnexion.setBounds(635, 0, 150, 50);
                deconnexion.addActionListener(this);
                
                modifier.setFont(comic);
                modifier.setBounds(300, 300, 200, 50);
                modifier.addActionListener(this);
                
                consulter.setFont(comic);
                consulter.setBounds(300, 400, 200, 50);
                consulter.addActionListener(this);
                
                ajouter.setFont(comic);
                ajouter.setBounds(300, 500, 200, 50);
                ajouter.addActionListener(this);
                
                pan.add(logo);
                pan.add(deconnexion);
                pan.add(modifier);
                pan.add(consulter);
                pan.add(ajouter);
                pan.setBackground(couleurFond);
                
                this.setContentPane(pan);
                this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource()== deconnexion)
                {
                        this.setVisible(false);
                        accueil f1 = new accueil();
                }
                else if(e.getSource()== ajouter)
                {
                		this.setVisible(false);
                		ajouter a1= new ajouter();
                }
                else if(e.getSource()== consulter)
                {
                	this.setVisible(false);
            		consulter c1= new consulter();
                }
        }
}