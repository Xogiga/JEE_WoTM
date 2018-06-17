package Métier;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author p1623107
 */
public final class InscriptionForm {
    private static final String mail  = "email";
    private static final String pwd   = "password";
    private static final String name    = "nom";
    private static final String confirmPwd   = "confirmPswd";
    private String resultat;
    private Map<String,String> erreur = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreur;
    }

    /**
    * Renvoie la valeur du champ passé en paramètre sans les espaces de début et de fin (trim())
    * @param request La requete HTTP
    * @param nomChamp
    * @return la valeur du champ passé en paramètre
    */
    private static String getChamp(HttpServletRequest request, String nomChamp) {
        String valeur = request.getParameter(nomChamp);
        if (valeur == null || valeur.trim().length() == 0) {
            return null;
        } else {
            return valeur.trim();
        }
    }
    
     /**
     * Vérifie la validité de l'adresse mail saisie
     * @param email le mail saisie
     * @throws Exception 
     */
    private void validationEmail(String email) throws Exception {
        if (email != null){
            //Source de la regex: OpenClassroom
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new Exception("Adresse E-Mail non valide");
            }
        } else {
            throw new Exception("Adresse E-mail obligatoire.");
        }
    }
    
    /**
     * Vérifie si:
     * -Il y  a un mot de passe
     * -Il y a un mot de passe de "confirmation"
     * -Ces mots de passe sont identiques
     * -Ces mots de passe font plus de 5 caractères
     * @param pswd
     * @param confirmPswd
     * @throws Exception 
     */
    private void validationPwd(String pswd, String confirmPswd) throws Exception {
        if (pswd != null && confirmPswd != null) {
            if (!pswd.equals(confirmPswd)) {
                throw new Exception("Les mots de passe ne correspondent pas.");
            } else if (pswd.length() < 5) {
                throw new Exception("Le mot de passe est plus court que 5 caractères. Merci d'en changer");
            }
        } else {
            throw new Exception("Merci de  remplir les champs mot de passe");
        }
    }

    /**
     * Vérification de la longueur d'username
     * @param nom
     * @throws Exception 
     */
    private void validationNom(String nom) throws Exception {
        if (nom != null && nom.length() < 3) {
            throw new Exception("Le nom d'user doit contenir au moins 3 caractères.");
        }
    }
    
    /**
     * Ajoute un utilisateur si tout les champs sont valides, sinon affiche une erreur
     * @param request
     * @return L'utilisateur créé
     */
    public Utilisateur inscrireUtilisateur(HttpServletRequest request) {
        String email = getChamp(request, mail);
        String pswd = getChamp(request, pwd);
        String nom = getChamp(request, name);
        String confirmPswd = getChamp(request, confirmPwd);

        Utilisateur user = new Utilisateur();

        try {
            validationEmail(email);
        } catch (Exception e) {
            setErreur(mail, e.getMessage());
        }
        user.setEmail(email);

        try {
            validationPwd(pswd, confirmPswd);
        } catch (Exception e) {
            setErreur(pwd, e.getMessage());
            setErreur(confirmPwd, null);
        }
        user.setMotDePasse(pswd);

        try {
            validationNom(nom);
        } catch (Exception e) {
            setErreur(name, e.getMessage());
        }
        user.setNom(nom);

        if (erreur.isEmpty()) {
            resultat = "Inscription réussie";
        } else {
            resultat = "Erreur dans les champs, veuillez réessayer";
        }

        return user;
    }


    /**
     * Ajoute le message d'erreur à la Map erreur
     * @param champ Nom du champ concerné
     * @param message Message associé
     */
    private void setErreur(String champ, String message) {
        erreur.put(champ, message);
    }
}

