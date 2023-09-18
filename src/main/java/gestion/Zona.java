package gestion;

import java.util.ArrayList;

import java.util.List;

import zooAnimales.*;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo){
		
		this.nombre = nombre;
		this.zoo = zoo;
		
	}
	
	public Zona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return this.zoo;
	}
	
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public List<Animal> getAnimales() {
		return this.animales;
	}
	
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales(Animal animal){
		
		this.animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		
		return this.animales.size();
		
	}

}
