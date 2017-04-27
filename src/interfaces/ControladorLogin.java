package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import academia.AcademiaLopez;
import academia.Usuario;

public class ControladorLogin {
	
	private VistaLogin vista;
	private AcademiaLopez academia;
	
	public ControladorLogin(VistaLogin vista,AcademiaLopez academia){
		
		this.vista = vista;
		this.academia= academia;
		
	}
	
	public void entrar() throws FileNotFoundException, ClassNotFoundException, IOException{
		char [] pas = vista.getPassword();
		String nie = vista.getNia2();
		if(pas.length!=0 && nie.isEmpty()==false){
		String pass = new String(pas);
		int nia = Integer.parseInt(nie);
		
		if(academia.loggin(nia,pass)== null){
			JOptionPane.showMessageDialog(null,"Ese usuario no existe");
		}
		}else{
			JOptionPane.showMessageDialog(null,"Introduce un nia y una contrasenia");
		}
	}
	
	public void salir() throws FileNotFoundException, IOException{
		academia.desconectar();
		System.exit(0);
	}

	

}
