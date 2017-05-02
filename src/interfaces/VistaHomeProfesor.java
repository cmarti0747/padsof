package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;

public class VistaHomeProfesor {
	private SpringLayout layout;
	private JFrame ventana;
	private Container contenedor;
	private JButton desconectar;
	private JLabel nombre,icono,academia;
	private JComboBox<String> asignaturas,alumnos;
	JTable matriculas;
	private JPanel HomeField,ExitField;
	ControladorVistaHomeProfesor controlador;

	public VistaHomeProfesor() {
		
		ventana = new JFrame("Academia");
		// obtener contenedor, asignar layout
		contenedor = ventana.getContentPane();
		contenedor.setLayout(new BorderLayout());
		desconectar = new JButton("Desconectar");
		
		HomeField = new JPanel();
		layout = new SpringLayout();
		HomeField.setLayout(layout);
		asignaturas = new JComboBox<String>();
		alumnos = new JComboBox<String>();
		layout.putConstraint("HorizontalCenter", asignaturas, 200, "HorizontalCenter",HomeField);
		layout.putConstraint("VerticalCenter", asignaturas, 0, "VerticalCenter", HomeField);
		HomeField.add(asignaturas);
		HomeField.add(alumnos);
		HomeField.add(asignaturas);
		HomeField.setVisible(true);
		HomeField.setBackground(new Color(0,255,255));
		
		
		ExitField = new JPanel();
		ExitField.setLayout(new BorderLayout());
		icono = new JLabel();
		academia= new JLabel("Academia Lopez");
		academia.setFont(new Font("Arial",Font.PLAIN,90));
		icono.setIcon(new ImageIcon("src/imagenes/descarga.png"));
		ExitField.setBackground(new Color(255,255,255));
		ExitField.add(icono,BorderLayout.WEST);
		ExitField.add(academia,BorderLayout.CENTER);
		ExitField.add(desconectar,BorderLayout.EAST);
		
		
		contenedor.add(ExitField,BorderLayout.NORTH);
		
		contenedor.add(HomeField,BorderLayout.CENTER);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(1020, 850);
		ventana.setVisible(true);
	}
	
	
	
	public void setControlador(ControladorVistaHomeProfesor controlador){
		this.controlador=controlador;
		
	}
	
	
	

}
