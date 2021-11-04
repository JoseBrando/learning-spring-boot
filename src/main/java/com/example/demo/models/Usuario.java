package com.example.demo.models;



public class Usuario {

	private String nombre;
	private String apellido;
	
	public Usuario() {
		this.nombre = "";
		this.apellido = "";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
