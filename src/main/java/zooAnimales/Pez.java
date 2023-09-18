package zooAnimales;

import java.util.ArrayList;

import java.util.List;

import gestion.*;

public class Pez extends Animal{
	
	private static List<Pez> listado = new java.util.ArrayList<Pez>();
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
		
		super();
		Pez.listado.add(this);
		
	}
	
	public static int getSalmones() {
		return salmones;
	}

	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}

	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static ArrayList<Pez> getListado() {
		return Pez.listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public static Pez crearSalmon(String nombre, int edad, String genero) {
		
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.salmones += 1;
		return salmon;
		
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.bacalaos += 1;
		return bacalao;
		
	}
	
	public String movimiento() {
		
		return ("nadar");
	}

}
