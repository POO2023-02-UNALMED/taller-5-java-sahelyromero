package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
		
	}
	
	public Pez() {
		
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
		
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.salmones += 1;
		Pez.listado.add(salmon);
		
	}
	
	public void crearBcalao(String nombre, int edad, String genero) {
		
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.bacalaos += 1;
		Pez.listado.add(bacalao);
		
	}
	
	public static ArrayList<Pez> getListado() {
		
		return Pez.listado;
		
	}

}
