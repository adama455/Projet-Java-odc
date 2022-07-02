package models;

public class Pavillon {
   private int id;
   private int numPavillon;
   private int nbreEtage;


    public Pavillon(int id, int numPavillon, int nbreEtage) {
    this.id = id;
    this.numPavillon = numPavillon;
    this.nbreEtage = nbreEtage;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPavillon() {
        return numPavillon;
    }

    public void setNumPavillon(int numPavillon) {
        this.numPavillon = numPavillon;
    }

    public int getNbreEtage() {
        return nbreEtage;
    }
    
    public void setNbreEtage(int nbreEtage) {
        this.nbreEtage = nbreEtage;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbreEtage=" + nbreEtage + ", numPavillon=" + numPavillon + "]";
    }

}
