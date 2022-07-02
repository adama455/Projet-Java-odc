package services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau implements IService{
    private final int TAILLE=10;
        private Pavillon[] tabPavillons= new Pavillon[TAILLE];
        private Etudiant[] tabEtudiants= new Etudiant[TAILLE];
        private Chambre[] tabChambres= new Chambre[TAILLE];
        private int indexPavillon;
        private int indexEtudiant;
        private int indexChambre;
    @Override
    public void addChambre(Chambre chambre) {
        if (indexChambre<TAILLE) {
            tabChambres[indexChambre] = chambre;
            indexChambre++;
            
        }else{
            System.out.println("le tableau est plein");
        }
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addPavillon(Pavillon pavillon) {
        if(indexPavillon<TAILLE){
            tabPavillons[indexPavillon]=pavillon;
            indexPavillon++;
        }else{
            System.out.println("le tableau est plein");
        }

    }

    @Override
    public void affecterChambreEtudiant(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambrePavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listChambre() {
        for (Chambre chambre : tabChambres) {
            if (chambre!=null) {
                System.out.println(chambre);
            }
        }
    }

    @Override
    public void listChambrePavillon() {
        // TODO Auto-generated method stub
       
        
    }

    @Override
    public void listEtudiant() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerEtudiantChambre() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon :tabPavillons) {
            if (pavillon!=null) {
                System.out.println(pavillon); 
            }
        }
        
    }

    @Override
    public void removeChambre(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeEtudiant(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removePavillon(int id) {
        // TODO Auto-generated method stub
        
    }
}