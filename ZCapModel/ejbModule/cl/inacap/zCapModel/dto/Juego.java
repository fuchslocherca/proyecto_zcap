package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {
	private String nombre;
	private String descripcion;
	private boolean aptoNiņos;
	private int precio;
	private LocalDate fechaLanzamiento;
	private Consola consola;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isAptoNiņos() {
		return aptoNiņos;
	}
	public void setAptoNiņos(boolean aptoNiņos) {
		this.aptoNiņos = aptoNiņos;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public Consola getConsola() {
		return consola;
	}
	public void setConsola(Consola consola) {
		this.consola = consola;
	}

}
