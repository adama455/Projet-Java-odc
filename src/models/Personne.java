package models;

public abstract class Personne {
    protected int id;
    protected String prenom;
    protected String nom;
    protected String role;
    protected boolean etat=true;


    //Constructeur..................
    public Personne() {

    }

    public int getId() {
        return id;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isEtat() {
        return etat;
    }
    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
