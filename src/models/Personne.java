package models;

public abstract class Personne {
    protected int id;
    protected String prenom;
    protected String nom;
    protected String role;
    protected int etat;


    //Constructeur..................
    

    public Personne(int id, String prenom, String nom, String role,int etat) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.role = role;
        this.etat = etat;
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
    public int isEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
}
