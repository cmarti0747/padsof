package interfaces;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class VistaHomeProfesor {
	
	private JFrame ventana;
	private Container contenedor;
	private JButton desconectar;
	private JLabel nombre,icono,academia;
	private JComboBox<String> asignaturas,alumnos;
	JTable matriculas;
	private JPanel HomeField;
	ControladorVistaHomeProfesor controlador;

	public VistaHomeProfesor() {
		
		ventana = new JFrame("Academia");
		// obtener contenedor, asignar layout
		contenedor = ventana.getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		HomeField = new JPanel();
		asignaturas = new JComboBox<String>();
		asignaturas.addItem("Padsof");
		HomeField.add(asignaturas);
		
		desconectar = new JButton("Desconectar");
		contenedor.add(HomeField,BorderLayout.CENTER);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(1020, 850);
		ventana.setVisible(true);
	}
	
	
	
	public void setControlador(ControladorVistaHomeProfesor controlador){
		this.controlador=controlador;
		
	}
	
	
	

}
