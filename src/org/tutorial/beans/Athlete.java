package org.tutorial.beans;
import java.util.ArrayList;

public class Athlete
{
	private String nom = null;
	private ArrayList<Palmares> listePalmares = null;
	
	public Athlete(String nom)
	{
		super();
		this.nom = nom;
		this.listePalmares = new ArrayList<Palmares>();
	}
		
	
	public String getNom() {
		return nom;
	}
	
	public void addPalmares(Palmares palmares)
	{
		listePalmares.add(palmares);
	}


	public String toString()
	{
		String result = nom + " :\r\n";
		
		for (Palmares epreuve : listePalmares) {
			result += "\t" + epreuve.getMedaille().getLabel() + " pour la discipline \"" + epreuve.getDiscipline().getLabel() + "\"\r\n"; 
		}
		
		return result;
	}
	
	
}
