import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gest extends JFrame implements ActionListener{

	private JPanel pan = new JPanel();
	private ImageIcon image = new ImageIcon("images/gsblogo.png");
	private ImageIcon imagef = new ImageIcon("images/fond.png");
	private JLabel logo = new JLabel(image,JLabel.CENTER);
	private JLabel fond = new JLabel(imagef, JLabel.CENTER);
	
	public gest() {
		this.setTitle("Gestion utilisateur");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan.setLayout(null);
		
		fond.setBounds(0,0,800,800);
		
		logo.setBounds(0, 0, 318, 213);
		
		pan.add(logo);
		pan.add(fond);
		
		this.setContentPane(pan);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}


	
}
