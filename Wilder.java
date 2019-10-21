
public class Wilder {
	
	//attributs
	private String firstname;
	private boolean aware;
	
	
	//constructeurs
	
	public Wilder(String firstname) {
		this.firstname = firstname;
		
	}
	
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	
	//méthode 
	public  String whoAmI() {
		String str = "Je m'appelle " + this.firstname + " et je";
		if(this.aware) {
			return str + " suis aware";
		}else {
			return str + " ne suis pas aware";
	    }
	}
	
	
	//mutateurs (setters)
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	//accesseurs (getters)
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public boolean isAware() {
		return this.aware;

	}
		
}
