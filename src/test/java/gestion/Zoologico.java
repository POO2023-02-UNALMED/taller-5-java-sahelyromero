package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(String nombre, String ubicacion) {
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	
	public Zoologico() {
		
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
