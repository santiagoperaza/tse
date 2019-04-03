package com.tse.practico.ejb;

import java.util.List;

import javax.ejb.Local;

@Local
public interface NoticiasEJBLocal {

	void agregarNoticia(Noticia noticia);
	List listarNoticias();
	
}
