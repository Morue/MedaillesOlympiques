package org.tutorial.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class AddAthleteAndPalmaresServlet
 */
@WebServlet("/toto")
public class AddAthleteAndPalmaresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAthleteAndPalmaresServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Création et initialisation des variables, récupération des paramètres dans des variables
		Boolean isPalmaresExist=false;
		String nomAthlete = request.getParameter("athleteName");
		String epreuve = request.getParameter("discipline");
		String medaille = request.getParameter("medaille");
		String alerte=null;
		
		//Instanciation d'athléte
		Athlete a = new Athlete(nomAthlete);
		
		//ajout du palmares
		a.addPalmares(new Palmares(EMedaille.valueOf(medaille),EDiscipline.valueOf(epreuve)));
		
		//récupération de la liste des athlétes avec les palmarés
		List<Athlete> listtest = DBUtils.queryAthletes();
		
		//pour chaque athlete de la liste, on récupére le palmares
		for (Athlete athlete : listtest) {
			
			//pour chaque palmares, si la discipline et la médaille sont égales à ce qui a été récupéré en paramètre
			//alors isPalmaresExist devient vrai sinon, c'est faux
			for (Palmares palmares : athlete.getListePalmares()) {
				
				if(palmares.getDiscipline().equals(EDiscipline.valueOf(epreuve)) && palmares.getMedaille().equals(EMedaille.valueOf(medaille))) {
					
					isPalmaresExist = true;
					
				}
			}			
		}
		
		//si isPalmaresExist est faux alors l'ahlete est ajouté à la liste et le message palmarés enregistré est envoyé
		if(!isPalmaresExist) {
			
			DBUtils.addAthlete(a);
			alerte = "Palmarès enregistré";
			
		}else {
			
			alerte = "ce palmarès existe déjà";
			
		}
		
		//récupération de la liste et envoie du message et de la liste dans la jsp
		List<Athlete> list = DBUtils.queryAthletes();
		
		request.setAttribute("athletes", list);
		request.setAttribute("alerte", alerte);
		
		//envoie vers la jsp afficheListAthletes
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/athlete/afficheListAthletes.jsp");
		
		 dispatcher.forward(request, response);
		
	}

}
