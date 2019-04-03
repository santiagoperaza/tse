package com.tse.practico.ejb;

import java.io.Serializable;

public class Noticia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String titulo;
	private String descripcion;
	
	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Noticia(int id, String titulo, String descripcion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
