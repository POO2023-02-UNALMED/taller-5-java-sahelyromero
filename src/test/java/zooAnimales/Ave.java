package zooAnimales;

import java.util.ArrayList;
import java.util.List;

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
	
	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static ArrayList<Ave> getListado() {
		return Ave.listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static Ave crearHalcon(String nombre, int edad, String genero) {
		
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones += 1;
		Ave.listado.add(halcon);
		return halcon;
		
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas += 1;
		Ave.listado.add(aguila);
		return aguila;
		
	}
	
	public String movimiento() {
		
		return ("volar");
	}
}
