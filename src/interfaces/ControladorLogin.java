package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import academia.AcademiaLopez;
import academia.Usuario;

public class ControladorLogin {
	
	private VistaLogin vista;
	private AcademiaLopez academia;
	
	public ControladorLogin(VistaLogin vista,AcademiaLopez academia){
		
		this.vista = vista;
		this.academia= academia;
		
	}
	
	public Object entrar() throws FileNotFoundException, ClassNotFoundException, IOException{
		
		String pass = new String(vista.getPassword());
		int nia = Integer.parseInt(vista.getNia2());
		Usuario usuario;
		usuario = academia.loggin(nia,pass);
		if(usuario== null){
			return null;
		}
		return nia;
	}
	
	public void salir() throws FileNotFoundException, IOException{
		academia.desconectar();
		System.exit(0);
	}

	

}
