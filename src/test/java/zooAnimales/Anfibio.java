package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
		
	}
	
	public Anfibio() {
		
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas += 1;
		Anfibio.listado.add(rana);
		
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		
		Anfibio salamandra = new Anfibio(nombre, edad, "negro y amarillo", genero, "rojo", false);
		Anfibio.salamandras += 1;
		Anfibio.listado.add(salamandra);
		
	}
	
	public static ArrayList<Anfibio> getListado() {
		
		return Anfibio.listado;
		
	}

}
