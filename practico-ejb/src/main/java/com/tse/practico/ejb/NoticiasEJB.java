package com.tse.practico.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NoticiasEJB
 */
@Stateless
@Remote(NoticiasEJBRemote.class)
@Local(NoticiasEJBLocal.class)
public class NoticiasEJB implements NoticiasEJBRemote, NoticiasEJBLocal {

    List<Noticia> noticias;    

    /**
     * Default constructor. 
     */
    public NoticiasEJB() {
    	noticias = new ArrayList<Noticia>();
    }

    public void agregarNoticia(Noticia noticia) {
       noticias.add(noticia);
    }    
  
    public List<Noticia> listarNoticias() {
       return noticias;
    }

}
