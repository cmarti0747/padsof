package interfaces;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		contenedor.setLayout(new FlowLayout());
		// crear componentes
		JButton boton = new JButton("Entrar");
		
		JTextField niaField = new JTextField("<nia>", 10);
		JPasswordField passField = new JPasswordField("<password>",10);
		
		SpringLayout layout = new SpringLayout();
		String nia =niaField.getText();
		char[] password = passField.getPassword();
		
		JLabel label = new JLabel("NIA:");
		JLabel label2 = new JLabel("PASSWORD:");

		JPanel NiaPasswordField = new JPanel();
		NiaPasswordField.setLayout(layout);
		// La izquierda (WEST) de label estará a 5 pixels de la izquierda del contenedor 
		layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, NiaPasswordField);
		// El norte (NORTH) de label estará a 5 pixels del norte del contenedor 
		layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, NiaPasswordField);
		// La izquierda de field estará a 5 pixels desde el borde derecho (EAST) de label
		layout.putConstraint(SpringLayout.WEST, niaField, 5, SpringLayout.EAST, label);
		// El norte de field estará a 5 pixels desde el norte del contenedor
		layout.putConstraint(SpringLayout.NORTH, niaField, 5, SpringLayout.NORTH, NiaPasswordField);
		// La izquierda de label2 estará a 0 pixels (alineada) del borde izquierdo de label
		layout.putConstraint(SpringLayout.WEST, label2, 0, SpringLayout.WEST, label);
		// El norte de label2 estará a 5 pixels del borde inferior (SOUTH) de label
		layout.putConstraint(SpringLayout.NORTH, label2, 8, SpringLayout.SOUTH, label);
		// La izquierda de field2 alienada con la izquierda de field
		layout.putConstraint(SpringLayout.WEST, passField, 0, SpringLayout.WEST, passField);
		// El norte de field2, 5 pixels más abajo de field
		layout.putConstraint(SpringLayout.NORTH, passField, 5, SpringLayout.SOUTH, passField);

		NiaPasswordField.add(label); 
		NiaPasswordField.add(niaField);
		NiaPasswordField.add(label2);
		NiaPasswordField.add(passField);
		NiaPasswordField.add(boton);
		NiaPasswordField.setPreferredSize(new Dimension(250,50));
		NiaPasswordField.setVisible(true);
		// asociar acciones a componentes
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, niaField.getText());
			}
		});
		// añadir componentes al contenedor
		contenedor.add(NiaPasswordField);
		contenedor.add(boton);
		// mostrar ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500, 500);
		ventana.setVisible(true);
	}
}
