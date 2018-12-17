package org.tutorial.appli;


import org.tutorial.beans.Athlete;
import org.tutorial.beans.Palmares;
import org.tutorial.beans.EDiscipline;
import org.tutorial.beans.EMedaille;

public class Appli
{

	public static void main(String[] args)
	{
		Athlete jamesBond = new Athlete("James Bond");
		jamesBond.addPalmares(new Palmares(EMedaille.ARGENT, EDiscipline.SAUT_PERCHE));
		System.out.println(jamesBond.toString());
		
		Athlete speedman = new Athlete("Speedman");
		speedman.addPalmares(new Palmares(EMedaille.OR, EDiscipline.COURSE_100M));
		speedman.addPalmares(new Palmares(EMedaille.OR, EDiscipline.SAUT_PERCHE));
		System.out.println(speedman.toString());
		
		
	}
}
