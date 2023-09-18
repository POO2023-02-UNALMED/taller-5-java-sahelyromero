package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
		
	}
	
	public Ave() {
		
	}
	
	public Ave crearHalcon(String nombre, int edad, String genero) {
		
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones += 1;
		Ave.listado.add(halcon);
		return halcon;
		
	}
	
	public Ave crearAguila(String nombre, int edad, String genero) {
		
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas += 1;
		Ave.listado.add(aguila);
		return aguila;
		
	}
	
	public static ArrayList<Ave> getListado() {
		
		return Ave.listado;
		
	}
	
	public String movimiento() {
		
		return ("volar");
	}
}
