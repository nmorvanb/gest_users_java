import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;

import java.sql.*;

import java.awt.*;
import java.awt.event.*;

public class accueil extends JFrame implements ActionListener,KeyListener {
        
        private JPanel pan = new JPanel();
        private ImageIcon image = new ImageIcon("images/gsblogo.png");
        private JLabel logo = new JLabel(image,JLabel.CENTER);
        private JLabel userLabel = new JLabel("Nom d'utilisateur");
        private JLabel mdpLabel = new JLabel("Mot de passe");
        private JTextField user = new JTextField();
        private JPasswordField mdp = new JPasswordField();
        private JButton btconnexion = new JButton("Connexion");
        private Font comic = new Font("Comic sans MS",Font.BOLD,18);
        private Font comic2 = new Font("Comic sans MS",Font.BOLD,15);
        private Color couleurFond = new Color(119,170,221);
        private Connection cnx;
        
        public accueil() {
        		
        		cnx = connexion.getInstance();
        	
                this.setTitle("Accueil");
                this.setSize(800,800);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                pan.setLayout(null);
                
                logo.setBounds(230, 50, 318, 213);
                
                userLabel.setFont(comic);
                userLabel.setBounds(230, 300, 318, 150);
                
                user.setFont(comic2);
                user.setForeground(Color.red);
                user.setBounds(230,400,318,25);
                user.addKeyListener(this);
                
                mdpLabel.setFont(comic);
                mdpLabel.setBounds(230, 400, 318, 150);
                
                mdp.setFont(comic2);
                mdp.setForeground(Color.red);
                mdp.setBounds(230,500,318,25);
                mdp.addKeyListener(this);
                
                btconnexion.setFont(comic);
                btconnexion.setBounds(309, 600, 159, 50);
                btconnexion.addActionListener(this);
                btconnexion.addKeyListener(this);
                
                
                pan.add(logo);
                pan.add(userLabel);
                pan.add(user);
                pan.add(mdpLabel);
                pan.add(mdp);
                pan.add(btconnexion);
                pan.setBackground(couleurFond);
                
                this.setContentPane(pan);
                this.setVisible(true);
        }

        @SuppressWarnings("deprecation")
		@Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource()== btconnexion){
                	if(connexion.verifUtil(user.getText(), mdp.getText()) == true)
                	{
                		this.setVisible(false);
                        gest f1 = new gest();
                	}
                	else
                	{
                		user.setText("");
                		mdp.setText("");
                		JOptionPane.showMessageDialog(null,"Erreur");
                	}
                }
        }

		@SuppressWarnings("deprecation")
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Stub de la méthode généré automatiquement
			if(e.getKeyCode() == KeyEvent.VK_ENTER  ){
				if(connexion.verifUtil(user.getText(), mdp.getText()) == true)
            	{
            		this.setVisible(false);
                    gest f1 = new gest();
            	}
            	else
            	{
            		user.setText("");
            		mdp.setText("");
            		JOptionPane.showMessageDialog(null,"Erreur");
            	}
			}		
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Stub de la méthode généré automatiquement
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Stub de la méthode généré automatiquement
		}
}

