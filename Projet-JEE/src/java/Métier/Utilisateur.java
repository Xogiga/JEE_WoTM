package Métier;

/**
 *
 * @author p1623107
 */
public class Utilisateur {
    private String email;
    private String pwd;
    private String nom;

    public Utilisateur(){
        
    }
    
    public void setEmail(String email) {
	this.email = email;
    }
    public String getEmail() {
	return email;
    }

    public void setMotDePasse(String pwd) {
	this.pwd = pwd;
    }
    public String getMotDePasse() {
	return pwd;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }
    public String getNom() {
	return nom;
    }
}

