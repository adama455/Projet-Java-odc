package models;

public class BourssierNonLoge extends Etudiant {
    private String adresse;

    
    public BourssierNonLoge(int id, String prenom, String nom, String role, int etat, String matricule,
            String telephone,String adresse) {
        super(id, prenom, nom, role, etat, matricule, telephone);
        this.adresse = adresse;

    }

    public String getAddresse() {
        return adresse;
    }
    public void setAddresse(String adresse) {
        this.adresse = adresse;
    }
    
}
