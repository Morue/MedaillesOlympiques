package org.tutorial.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tutorial.beans.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginOK")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		User u = new User("admin","password");
		
		
		
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		
		if (login.equals(u.getLogin()) && pwd.equals(u.getPassword())) {
			
			HttpSession session = request.getSession();
			session.setAttribute("login",login);
			
			response.sendRedirect("Accueil/AccueilUser.jsp");
			
		}else {
			
			response.sendRedirect("Erreur/erreur.jsp");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
