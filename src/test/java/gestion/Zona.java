package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>(1);
	private ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo){
		
		this.nombre = nombre;
		this.zoo.add(zoo);
		
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
		
		return this.zoo.get(0);
	}
	
	
	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return this.animales;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales(Animal animal){
		
		this.getAnimales().add(animal);
		
	}
	
	public int cantidadAnimales() {
		
		return this.getAnimales().size();
		
	}

}
