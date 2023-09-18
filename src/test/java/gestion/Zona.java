package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo){
		
		this.nombre = nombre;
		this.zoo = zoo;
		
	}
	
	public Zona() {
		
	}
	
	public ArrayList getAnimales() {
		
		return this.animales;
	}
	
	public void agregarAnimales(Animal animal){
		
		this.animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		
		return this.animales.size();
		
	}

}
