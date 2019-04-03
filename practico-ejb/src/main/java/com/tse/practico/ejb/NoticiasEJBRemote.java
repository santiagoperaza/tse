package com.tse.practico.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface NoticiasEJBRemote {

	void agregarNoticia(Noticia noticia);
	List listarNoticias();
	
}
