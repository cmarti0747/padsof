package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import academia.AcademiaLopez;

public class ControladorLogin {

	private VistaLogin vista;
	private AcademiaLopez academia;

	public ControladorLogin(VistaLogin vista, AcademiaLopez academia) {

		this.vista = vista;
		this.academia = academia;
		

	}

	public void entrar() throws FileNotFoundException, ClassNotFoundException, IOException {
		char[] pas = vista.getPassword();
		String nie = vista.getNia2();
		if (pas.length != 0 && nie.isEmpty() == false) {
			String pass = new String(pas);
			int nia = Integer.parseInt(nie);
			System.out.println(pas);
			if ( academia.loggin(nia, pass) == null) {
				JOptionPane.showMessageDialog(null, "Ese usuario no existe");
			}else if(academia.getUsuarioOnline().equals(academia.getProfesor())){
				
				VistaHomeProfesor vista = new VistaHomeProfesor();
				ControladorVistaHomeProfesor controlador = new ControladorVistaHomeProfesor(vista,this.academia);
				
				vista.setControlador(controlador);
				this.vista.setVisibilidad(false);
			}else{
				/*****************Alumno*****************/
			}

		} else {
			JOptionPane.showMessageDialog(null, "Introduce un nia y una contrasenia");
		}
	}

	public void salir() throws FileNotFoundException, IOException {
		academia.desconectar();
		System.exit(0);
	}

}
