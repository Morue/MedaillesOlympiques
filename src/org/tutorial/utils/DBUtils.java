package org.tutorial.utils;

import java.util.ArrayList;
import java.util.List;

import org.tutorial.beans.*;

public class DBUtils {

	private static final List<Athlete> athletes = new ArrayList<Athlete>();
	
	static {
		initData();
	}
	
	private static void initData() {
		
		Athlete jamesBond = new Athlete("James Bond");
		jamesBond.addPalmares(new Palmares(EMedaille.ARGENT, EDiscipline.SAUT_PERCHE));
		athletes.add(jamesBond);
		
		Athlete speedman = new Athlete("Speedman");
		speedman.addPalmares(new Palmares(EMedaille.OR, EDiscipline.COURSE_100M));
		speedman.addPalmares(new Palmares(EMedaille.OR, EDiscipline.SAUT_PERCHE));
		athletes.add(speedman);
		
	}
	
	public static void addAthlete(Athlete athlete) {
		
		athletes.add(athlete);
	}
	
	  public static List<Athlete> queryAthletes() {
	        return athletes;
	    }
	
}
