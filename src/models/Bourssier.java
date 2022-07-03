package models;

public class Bourssier extends Etudiant {
    private TypeChambre typeBourse;
    public Bourssier(int id, String prenom, String nom, String role, int etat, String matricule, String telephone) {
        super(id, prenom, nom, role, etat, matricule, telephone);
        //TODO Auto-generated constructor stub
    }


    public TypeChambre getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(TypeChambre typeBourse) {
        this.typeBourse = typeBourse;
    }

    
    
}
