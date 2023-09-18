package gestion;

import java.util.ArrayList;

import.java.util.List;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	
	public Zoologico() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Zona> getZona() {
		return zonas;
	}

	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}

	public int cantidadTotalAnimales() {
		
		int cont = 0;
		
		for(int i = 0; i < this.zonas.size(); i += 1 ) {
			
			Zona K = this.zonas.get(i);
			int cant = K.getAnimales().size();
			cont += cant;
		}
		
		return cont;
	}

	public void agregarZonas(Zona zona) {
		
		this.zonas.add(zona);
	}
	

}
