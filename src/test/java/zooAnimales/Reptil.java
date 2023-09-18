package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
		
	}
	
	public Reptil() {
		
	}
	
	public Reptil crearIguana(String nombre, int edad, String genero){
		
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.iguanas += 1;
		Reptil.listado.add(iguana);
		return iguana;
		
	}
	
	public Reptil crearSerpiente(String nombre, int edad, String genero){
		
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.serpientes += 1;
		Reptil.listado.add(serpiente);
		return serpiente;
		
	}
	
	public static ArrayList<Reptil> getListado() {
		
		return Reptil.listado;
		
	}
	
	public String movimiento() {
		
		return ("reptar");
	}

}
