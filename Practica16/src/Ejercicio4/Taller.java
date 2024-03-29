package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Taller {

	private String nombre;
	private ArrayList<Vehiculo> coches;
	
	public Taller(String nombre) {
		this.nombre = nombre;
		this.coches = new ArrayList<>();
	}
	
	
	public void ingresarVehiculo(Vehiculo coche) {
		//Comprobar que ya esté el coche en el taller
		if (this.coches.indexOf(coche) < 0) {
			this.coches.add(coche);
		}
	}
	
	public void vehiculoReparado(Vehiculo coche) {
		//Buscar el coche en el ArrayList
		int posicion = this.coches.indexOf(coche);
		
		//Ponerlo a reparado
		this.coches.get(posicion).setReparado(true);
	}
	
	public void eliminarVehiculo(Vehiculo coche) {
		if (! this.coches.remove(coche)) {
			System.out.println("El coche no está en el taller");
		} else {
			System.out.println("Coche eliminado correctamente");
		}
	}
	
	public Vehiculo buscarVehiculo(String matricula) {
		
		//1. Ordenar la lista de forma ascendente
		Collections.sort(this.coches);
		
		//2. Hacer una búsqueda binaria
		int posicion = Collections.binarySearch(this.coches, new VehiculoElectrico(matricula, "", "", "", 0.0, 0,	false, 0));
		return this.coches.get(posicion);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taller [nombre=");
		builder.append(nombre);
		builder.append(", coches=");
		builder.append(coches);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}