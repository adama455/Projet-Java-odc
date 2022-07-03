package models;

public class Etudiant extends Personne {
    private String matricule;
    private String telephone;
   
    public Etudiant(int id, String prenom, String nom, String role, int etat, String matricule, String telephone) {
        super(id, prenom, nom, role, etat);
        this.matricule = matricule;
        this.telephone = telephone;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Etudiant [matricule=" + matricule + ", telephone=" + telephone +"]";
    }

}
