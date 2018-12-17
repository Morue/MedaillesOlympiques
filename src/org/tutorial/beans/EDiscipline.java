package org.tutorial.beans;

public enum EDiscipline
{
	COURSE_100M ("Course du 100 mètres"),
	SAUT_PERCHE ("Saut à la perche");
	
	private String label = null;

	private EDiscipline(String label)
	{
		this.label = label;
	}

	public String getLabel()
	{
		return label;
	}
	
}
