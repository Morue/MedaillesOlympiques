package org.tutorial.beans;

public class Palmares
{
	private EMedaille medaille = null;
	private EDiscipline discipline = null;
	
	public Palmares(EMedaille medaille, EDiscipline discipline) {
		super();
		this.medaille = medaille;
		this.discipline = discipline;
	}

	public EMedaille getMedaille() {
		return medaille;
	}

	public EDiscipline getDiscipline() {
		return discipline;
	}

	
	
}
