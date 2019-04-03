package com.practico.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tse.practico.ejb.NewsData;
import com.tse.practico.ejb.Noticia;
import com.tse.practico.ejb.NoticiasEJBRemote;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "My First Servlet", urlPatterns = { "/FirstServlet" , "/FirstServlet.do"}, initParams = {@WebInitParam(name="id",value="1"),@WebInitParam(name="name",value="pankaj")})
public class FirstServlet extends HttpServlet {
	
	@EJB
	private NewsData newsData;
	@EJB
	private NoticiasEJBRemote noticiasEJBRemote;
	private static final long serialVersionUID = 1L;
	public static final String HTML_START="<html><body>";
	public static final String HTML_END="</body></html>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int visitas = newsData.getNumberOfSessions();
		out.println(HTML_START + "<h2>Prueba</h2><br/><h3>Visitas="+ visitas +"</h3>"+HTML_END);
		Noticia noticia = new Noticia(1, "Primer noticia", "descripcion");
		noticiasEJBRemote.agregarNoticia(noticia);
		out.println(HTML_START + "<h2>Lista de noticias</h2><br/><h3>1 - titulo: "+ noticiasEJBRemote.listarNoticias().toString() +"</h3>"+HTML_END);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
