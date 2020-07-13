package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ComparaisonCodes;


@WebServlet("/Challenger")
public class Challenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Challenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ComparaisonCodes compCode = new ComparaisonCodes();
		
		request.setAttribute("compCode", compCode);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/challenger.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
