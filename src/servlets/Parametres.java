package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Options;


@WebServlet("/Parametres")
public class Parametres extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Parametres() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Options options = new Options();
		request.setAttribute("options", options);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/parametres.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

}
