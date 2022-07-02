package Accueil;

import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import services.IService;
import services.ServiceTableau;

public class Menu {

    private int choix;
    Scanner clavier = new Scanner(System.in);

    public void menu(){
        System.out.println("Faite votre Choix");
        System.out.println("1-  Ajouter Pavillon");
        System.out.println("2-  Ajouter Chambre");
    }
     
    public void choix(){
        IService services = new ServiceTableau();
        choix = clavier.nextInt();
        switch (choix) {
            case 1:  
                System.out.println("Veillez Saisir l'id");
                int id = clavier.nextInt(); 
                System.out.println("Veillez Saisir nobre d'Etage");
                int nbreEtage = clavier.nextInt();
                System.out.println("Veillez Saisir Numero de Pavillon");
                int numPavillon = clavier.nextInt();
                Pavillon pav = new Pavillon(id,numPavillon,nbreEtage);
                services.addPavillon(pav);
                services.listerPavillon();
                break;
            case 2:
                System.out.println("Veillez Saisir l'id");
                int idChambre = clavier.nextInt();
                System.out.println("Veillez Saisir numéro Chambre");
                int numero = clavier.nextInt();
                // System.out.println("Veillez Donner le type de chambre");
                String type = "DOUBLE";
                System.out.println("Veillez Saisir le nombre d'Etage");
                int numeroEtage = clavier.nextInt();
                System.out.println("Veillez Saisir l'etat");
                int etat = clavier.nextInt();
                Chambre ch = new Chambre(idChambre, numero, type, numeroEtage,etat);
                services.addChambre(ch);
                services.listChambre();
                break;
            default:
                break;
        }
    }

    
}
