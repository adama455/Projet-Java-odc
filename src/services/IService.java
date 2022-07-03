package services;

import models.Chambre;
import models.Etudiant;
import models.BourssierLoge;
import models.BourssierNonLoge;
import models.NonBourssier;
import models.Pavillon;


public interface IService {
    public void addChambre(Chambre chambre);
    public void listChambre();
    public void removeChambre(int id);
    public void addPavillon( Pavillon pavillon);
    public void listerPavillon();
    public void listPersonne();
    public void removePavillon(int id);

    public void addEtudiant(Etudiant etudiant);
    public void listEtudiant();
    public void removeEtudiant(int id);

    public void addBourssierLoge(BourssierLoge etudiant);
    public void listBourssierLoge();
    public void removeBourssierLoge(int id);

    public void addBourssierNonLoge(BourssierNonLoge etudiant);
    public void listBourssieNonrLoge();
    public void removeBourssierNonLoge(int id);

    public void addNonBourssier(NonBourssier etudiant);
    public void listNonBourssier();
    public void removeNonBourssier(int id);
    public void affecterChambrePavillon(Pavillon pavillon);
    public void affecterChambreEtudiant(Chambre chambre);
    public void listChambrePavillon();
    public void listerEtudiantChambre();
   
}
