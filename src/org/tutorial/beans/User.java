package org.tutorial.beans;

public class User {

	private String login;
	private String pwd;
	
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.pwd = password;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return pwd;
	}


	public void setPassword(String password) {
		this.pwd = password;
	}
	
	
	
	
}
