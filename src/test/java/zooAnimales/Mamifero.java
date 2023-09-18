package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
		
	}
	
	public Mamifero() {
		
	}
	
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.caballos += 1;
		Mamifero.listado.add(caballo);
		return caballo;
			
	}
	
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones += 1;
		Mamifero.listado.add(leon);
		return leon;
			
	}
	
	public static ArrayList<Mamifero> getListado() {
		
		return Mamifero.listado;
		
	}

}
