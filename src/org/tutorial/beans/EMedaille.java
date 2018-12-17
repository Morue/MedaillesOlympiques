package org.tutorial.beans;

public enum EMedaille
{
	OR("Médaille d'or"),
	ARGENT("Médaille d'argent"),
	BRONZE("Médaille de bronze");
	
	private String label = null;

	private EMedaille(String label)
	{
		this.label = label;
	}

	public String getLabel()
	{
		return label;
	}


	
	
	
}
