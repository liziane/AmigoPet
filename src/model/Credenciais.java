package model;

public class Credenciais {
  
	String username;
	String password;
	
	public Credenciais(String username, String password){
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		Credenciais inputtedCredentials = (Credenciais) obj;
		if(this.username.equals(inputtedCredentials.username) && (this.password.equals(inputtedCredentials.password)))
				return true;
		return false;
        }
	
	public String getUserName(){
		return this.username;
	}
	
	
}  

