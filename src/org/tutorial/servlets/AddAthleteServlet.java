package org.tutorial.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tutorial.beans.Athlete;
import org.tutorial.beans.EDiscipline;
import org.tutorial.beans.EMedaille;
import org.tutorial.beans.Palmares;
import org.tutorial.utils.DBUtils;

/**
 * Servlet implementation class AddAthleteServlet
 */
@WebServlet("/AddAthleteServlet")
public class AddAthleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAthleteServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//envoie des énumérations discipline et médaille dans l'attribut pour les récupérer dans la jsp
		EDiscipline[] valuesd = EDiscipline.values();
		request.setAttribute("disciplines", valuesd);
		EMedaille[] valuesm = EMedaille.values();
		request.setAttribute("medailles",valuesm );

		//envoie vers la jsp addAthlete
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/athlete/addAthlete.jsp");
		
		 dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
