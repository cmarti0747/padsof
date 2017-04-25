package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
	public static void main(String[] args) {
		// crear ventana
		JFrame ventana = new JFrame("Mi GUI");
		// obtener contenedor, asignar layout
		Container contenedor = ventana.getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		JButton entrar = new JButton("Entrar");
		JButton salir = new JButton("Salir");
		
		JTextField niaField = new JTextField(10);
		JPasswordField passField = new JPasswordField(10);
		
		SpringLayout layout = new SpringLayout();
		
		char[] password = passField.getPassword();
		
		JLabel nia = new JLabel("NIA:");
		JLabel pass = new JLabel("PASSWORD:");
		
		JLabel icon = new JLabel("");
		icon.setIcon(new ImageIcon("src/imagenes/footer-logo.png"));
		JPanel NiaPasswordField = new JPanel();
		NiaPasswordField.setLayout(layout);
		
		layout.putConstraint("HorizontalCenter", nia, -100, "HorizontalCenter", NiaPasswordField);
		layout.putConstraint("VerticalCenter", nia, 0, "VerticalCenter", NiaPasswordField);
		
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.WEST, niaField, 5, SpringLayout.EAST, nia);
		// El norte de field estará a 5 pixels desde el norte del contenedor
		layout.putConstraint(SpringLayout.NORTH, niaField, 0, SpringLayout.NORTH, nia);
		
		// La izquierda de label2 estará a 0 pixels (alineada) del borde izquierdo de label
		layout.putConstraint(SpringLayout.WEST, pass, 0, SpringLayout.WEST, nia);
		
		// El norte de label2 estará a 5 pixels del borde inferior (SOUTH) de label
		layout.putConstraint(SpringLayout.NORTH, pass, 8, SpringLayout.SOUTH, nia);
		// La izquierda de field2 alienada con la izquierda de field
		layout.putConstraint(SpringLayout.WEST, passField, 0, SpringLayout.WEST, niaField);
		
		// El norte de field2, 5 pixels más abajo de field
		layout.putConstraint(SpringLayout.NORTH, passField, 5, SpringLayout.SOUTH, niaField);
		
		// El norte de field2, 5 pixels más abajo de field
		layout.putConstraint(SpringLayout.WEST, passField, 5, SpringLayout.EAST, pass);
		
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.EAST, icon, -250, SpringLayout.WEST, nia);
				
		NiaPasswordField.add(icon); 
		NiaPasswordField.add(nia); 
		NiaPasswordField.add(niaField);
		NiaPasswordField.add(pass);
		NiaPasswordField.add(passField);
		NiaPasswordField.setPreferredSize(new Dimension(500,500));
		NiaPasswordField.setVisible(true);
		NiaPasswordField.setBackground(new Color(153,255,153));
		JPanel BotonField = new JPanel();
		
		BotonField.setLayout(new FlowLayout());
		BotonField.add(entrar);
		BotonField.add(salir);
		
		
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
		contenedor.add(BotonField,BorderLayout.SOUTH);
		contenedor.add(NiaPasswordField,BorderLayout.CENTER);
		
		// mostrar ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500, 500);
		ventana.setVisible(true);
	}
}
