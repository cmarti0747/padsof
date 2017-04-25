package interfaces;

import java.awt.Container;
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
		
		String nia =niaField.getText();
		char[] password = passField.getPassword();
		

		JPanel NiaPasswordField = new JPanel(new SpringLayout());
		NiaPasswordField.add(new JLabel("NIA:"));
		NiaPasswordField.add(niaField);
		NiaPasswordField.add(new JLabel("Password:"));
		NiaPasswordField.add(passField);

		NiaPasswordField.add(boton);
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
