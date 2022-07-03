package services;

import models.BourssierLoge;
import models.BourssierNonLoge;
import models.Chambre;
import models.Etudiant;
import models.NonBourssier;
import models.Pavillon;
import models.Personne;

public class ServiceTableau implements IService{

    private final int TAILLE=10;
    private Pavillon[] tabPavillons= new Pavillon[TAILLE];
    private int indexPavillon=0;
    private Chambre[] tabChambres= new Chambre[TAILLE];
    private int indexChambre=0;
    private Etudiant[] tabEtudiants= new Etudiant[TAILLE];
    private int indexEtudiant;
    private Personne[] tabPersonnes= new Personne[TAILLE];
    private int indexPersonne;
    private BourssierLoge[] tabBourssierLoge = new BourssierLoge[TAILLE];
    private int indexBourssierLoge;
    private BourssierNonLoge[] tabBourssierNL = new BourssierNonLoge[TAILLE];
    private int indexBourssierNL;
    private NonBourssier[] tabNonBourssier = new NonBourssier[TAILLE];
    private int indexNBourssier;

    @Override
    public void addChambre(Chambre chambre) {
        if (indexChambre<TAILLE) {
            tabChambres[indexChambre] = chambre;
            indexChambre++;
            
        }else{
            System.out.println("le tableau est plein");
        }
    }
    public void addPersonne(Personne personne) {
        if (indexPersonne<TAILLE) {
            tabPersonnes[indexPersonne] = personne;
            indexPersonne++;
            
        }else{
            System.out.println("le tableau est plein");
        }
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        if (indexEtudiant<TAILLE) {
            tabEtudiants[indexEtudiant] = etudiant;
            indexEtudiant++;
        }else{
            System.out.println("le tableau est plein");
        }
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
    public void listChambre() {
        for (Chambre chambre : tabChambres) {
            if (chambre!=null) {
                System.out.println(chambre);
            }
        }
    }

    @Override
    public void listEtudiant() {
        for (Etudiant etudiant : tabEtudiants) {
            if (etudiant!=null) {
                System.out.println(etudiant);
            }
            
        }
        
    }

    @Override
    public void listPersonne() {
        for (Personne personne : tabPersonnes) {
            if (personne!=null) {
                System.out.println(personne);
            }
            
        }
        
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
    public void addBourssierLoge(BourssierLoge bourssierL) {
        if (indexBourssierLoge<TAILLE) {
            tabBourssierLoge[indexBourssierLoge] = bourssierL;
            indexBourssierLoge++;
            
        }else{
            System.out.println("le tableau est plein");
        }
    }

    @Override
    public void addBourssierNonLoge(BourssierNonLoge bourssierNL) {
        if (indexBourssierNL<TAILLE) {
            tabBourssierNL[indexBourssierNL] = bourssierNL;
            indexBourssierNL++;
            
        }else{
            System.out.println("le tableau est plein");
        }
        
    }

    @Override
    public void addNonBourssier(NonBourssier NBourssier) {
        if (indexNBourssier<TAILLE) {
            tabNonBourssier[indexNBourssier] = NBourssier;
            indexNBourssier++;
            
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
    public void listBourssieNonrLoge() {
        for (BourssierNonLoge bourssierNL :tabBourssierNL) {
            if (bourssierNL!=null) {
                System.out.println(bourssierNL); 
            }
        } 
    }

    @Override
    public void listBourssierLoge() {
        for (BourssierLoge bourssierL :tabBourssierLoge) {
            if (bourssierL!=null) {
                System.out.println(bourssierL); 
            }
        }
    }


    @Override
    public void listChambrePavillon() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listNonBourssier() {
        for (NonBourssier NBourssier :tabNonBourssier) {
            if (NBourssier!=null) {
                System.out.println(NBourssier); 
            }
        }
    }

    @Override
    public void listerEtudiantChambre() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeBourssierLoge(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeBourssierNonLoge(int id) {
        // TODO Auto-generated method stub
        
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
    public void removeNonBourssier(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removePavillon(int id) {
        // TODO Auto-generated method stub
        
    }

}