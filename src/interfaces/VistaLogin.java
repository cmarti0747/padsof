package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class VistaLogin {
	private JFrame ventana;
	private Container contenedor;
	private JButton entrar,salir;
	private JLabel nia,pass,icon,icono,academia;
	private JTextField niaField;
	private JPasswordField passField;
	private SpringLayout layout;
	private JPanel NiaPasswordField,ExitField;
	char[] password;
	
	public VistaLogin() {
		// crear ventana
		ventana = new JFrame("Mi GUI");
		// obtener contenedor, asignar layout
		contenedor = ventana.getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		entrar = new JButton("Entrar");
		salir = new JButton("Salir");
		
		niaField = new JTextField(10);
		passField = new JPasswordField(10);
		
		layout = new SpringLayout();
		
		password = passField.getPassword();
		
		nia = new JLabel("NIA:");
		nia.setFont(new Font("Arial",0,25));
		pass = new JLabel("PASSWORD:");
		pass.setFont(new Font("Arial",0,25));
		
		icon = new JLabel("");
		icon.setIcon(new ImageIcon("src/imagenes/user.png"));
		
		NiaPasswordField = new JPanel();
		NiaPasswordField.setLayout(layout);
		
		layout.putConstraint("HorizontalCenter", nia, -100, "HorizontalCenter", NiaPasswordField);
		layout.putConstraint("VerticalCenter", nia, 0, "VerticalCenter", NiaPasswordField);
		
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.WEST, niaField, 117, SpringLayout.EAST, nia);
		// El norte de field estará a 5 pixels desde el norte del contenedor
		layout.putConstraint(SpringLayout.NORTH, niaField, 0, SpringLayout.NORTH, nia);
		
		// La izquierda de label2 estará a 0 pixels (alineada) del borde izquierdo de label
		layout.putConstraint(SpringLayout.WEST, pass, 0, SpringLayout.WEST, nia);
		
		// El norte de label2 estará a 5 pixels del borde inferior (SOUTH) de label
		layout.putConstraint(SpringLayout.NORTH, pass, 8, SpringLayout.SOUTH, nia);
		// La izquierda de field2 alienada con la izquierda de field
		layout.putConstraint(SpringLayout.WEST, passField, 0, SpringLayout.WEST, niaField);
		
		// El norte de field2, 5 pixels más abajo de field
		layout.putConstraint(SpringLayout.NORTH, passField, 21, SpringLayout.SOUTH, niaField);
		
		// El norte de field2, 5 pixels más abajo de field
		layout.putConstraint(SpringLayout.WEST, passField, 10, SpringLayout.EAST, pass);
		
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.EAST, icon, -150, SpringLayout.WEST, nia);
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.SOUTH, icon, 100, SpringLayout.NORTH, nia);
		
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.NORTH, entrar, 50, SpringLayout.SOUTH, passField);
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.WEST, entrar, 75, SpringLayout.WEST, pass);
		
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.NORTH, salir, 50, SpringLayout.SOUTH, passField);
				// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.WEST, salir, 10, SpringLayout.EAST, entrar);
		
		NiaPasswordField.add(icon); 
		NiaPasswordField.add(nia); 
		NiaPasswordField.add(niaField);
		NiaPasswordField.add(pass);
		NiaPasswordField.add(passField);
		NiaPasswordField.add(entrar);
		NiaPasswordField.add(salir);
		NiaPasswordField.setPreferredSize(new Dimension(500,500));
		NiaPasswordField.setVisible(true);
		NiaPasswordField.setBackground(new Color(0,255,255));
		
		
		ExitField = new JPanel();
		ExitField.setLayout(new BorderLayout());
		icono = new JLabel();
		academia= new JLabel("Academia Lopez");
		academia.setFont(new Font("Arial",Font.PLAIN,90));
		icono.setIcon(new ImageIcon("src/imagenes/descarga.png"));
		ExitField.setBackground(new Color(255,255,255));
		ExitField.add(icono,BorderLayout.WEST);
		ExitField.add(academia,BorderLayout.CENTER);
		
	
		
		// asociar acciones a componentes
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, niaField.getText());
			}
		});
		
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// añadir componentes al contenedor
		contenedor.add(ExitField,BorderLayout.NORTH);
		contenedor.add(NiaPasswordField,BorderLayout.CENTER);
		
		// mostrar ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(1020, 850);
		ventana.setVisible(true);
	}
}
