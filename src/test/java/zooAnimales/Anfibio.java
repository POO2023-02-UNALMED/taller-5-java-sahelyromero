package zooAnimales;

import java.util.ArrayList;

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
	
	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static ArrayList<Anfibio> getListado() {
		return Anfibio.listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public Anfibio crearRana(String nombre, int edad, String genero) {
		
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas += 1;
		Anfibio.listado.add(rana);
		return rana;
		
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		
		Anfibio salamandra = new Anfibio(nombre, edad, "negro y amarillo", genero, "rojo", false);
		Anfibio.salamandras += 1;
		Anfibio.listado.add(salamandra);
		return salamandra;
		
	}
	
	public String movimiento() {
		
		return ("saltar");
	}

}
