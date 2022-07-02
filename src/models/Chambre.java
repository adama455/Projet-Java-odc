package models;

public class Chambre {
    private int idChambre;
    private int numero;
    private String type;
    private int numeroEtage;
    private int etat;
    
    public Chambre(int idChambre, int numero, String type, int numeroEtage, int etat) {
        this.idChambre = idChambre;
        this.numero = numero;
        this.type = type;
        this.numeroEtage = numeroEtage;
        this.etat = etat;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public int getIdChambre() {
        return idChambre;
    }
    public void setIdChambre(int idChambre) {
        this.idChambre = idChambre;
    }
    @Override
    public String toString() {
        return "Chambre [etat=" + etat + ", idChambre=" + idChambre + ", numero=" + numero + ", numeroEtage="
            + numeroEtage + ", type=" + type + "]";
    }
}
