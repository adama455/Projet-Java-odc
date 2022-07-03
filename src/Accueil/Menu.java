package Accueil;

import java.util.Scanner;

import models.NonBourssier;
import models.BourssierLoge;
import models.BourssierNonLoge;
import models.Chambre;
// import models.Etudiant;
import models.Pavillon;
// import models.Personne;
// import models.TypeBoursse;
import services.IService;
import services.ServiceTableau;

public class Menu {

    private int choix;
    Scanner clavier = new Scanner(System.in);

    public void menu(){
        System.out.println("-*-*-*-*-*-*-*-*-*-* VEILLEZ ENTRER VOTRE CHOIX -*-*-*-*--*-*-*-*-*-");
        System.out.println("####################################################################");
        System.out.println("*******************1-  Ajouter Pavillon *********************");
        System.out.println("**********************2-  Ajouter Chambre  *********************");
        System.out.println("*************************3-  Ajouter Etudiant  *********************");
        System.out.println("####################################################################");
    }
      
    public void choix(){
        IService services = new ServiceTableau();
        choix = clavier.nextInt();
        switch (choix) {
            case 1:
                System.out.println("**** Entrer le nombre de Pavillon à Ajouter ****");
                int nbrePavillon = clavier.nextInt();
                for (int i = 0; i < nbrePavillon; i++) {
                    int id = (i+1); 
                    System.out.println("-----Veillez Saisir nobre d'Etage");
                    int nbreEtage = clavier.nextInt();
                    System.out.println("-----Veillez Saisir Numero de Pavillon");
                    int numPavillon = clavier.nextInt();
                    Pavillon pav = new Pavillon(id,numPavillon,nbreEtage);
                    services.addPavillon(pav);
                }
                services.listerPavillon();
                break;
            case 2:
                System.out.println("**** Entrer le nombre de Chambre à Ajouter: ****");
                int nbreChambre = clavier.nextInt();
                for (int i = 0; i < nbreChambre; i++){
                    int idChambre = (i+1);
                    System.out.println("---- Veillez Saisir numéro Chambre");
                    int numero = clavier.nextInt();
                    System.out.println("---- Veillez Saisir le numéro d'Etage");
                    int numeroEtage = clavier.nextInt();
                    System.out.println("---- Veillez Saisir le type de Chambre (DOUBLE ou INDIVIDUEL)");
                    String type = clavier.next();
                    int etat = 1;
                    Chambre ch = new Chambre(idChambre, numero, type, numeroEtage,etat);
                    services.addChambre(ch);
                }
                services.listChambre();
                break;
            case 3: 
                    System.out.println("**** Quel type d'Etudiant voulez vous ajouter ? ****");
                    System.out.println("*******************1-  Bourssier Logé *********************");
                    System.out.println("****************2-  Bourssier Non Logé  *********************");
                    System.out.println("*************3-  Non Bourssier  *********************");
                    choix = clavier.nextInt();
                    switch (choix) {
                        case 1:
                            System.out.println("**** Entrer le nombre de Etudiant à Ajouter: ****");
                            int nbreEtudiantBL = clavier.nextInt();
                            for (int i = 1; i <= nbreEtudiantBL; i++){
                                int id = (i+1);
                                System.out.println("---- Entrer Votre prénom");
                                String prenom = clavier.next();
                                System.out.println("-------- Entrer Votre nom");
                                String nom = clavier.next();
                                String role = "ROLE_ETUDIANT";
                                int etat = 1; 
                                String matricule = "ET000"+i;
                                System.out.println("---- Entrer Votre telephone");
                                String telephone = clavier.next();
                                BourssierLoge etudBL= new BourssierLoge(id,nom,prenom,role,etat,matricule,telephone);
                                services.addBourssierLoge(etudBL);
                                // Personne pers= new Personne(id,prenom,nom,role,etat);
                                // services.addPersonne(pers);
                            }
                            services.listBourssierLoge();
                            services.listEtudiant();
                            services.listPersonne();
                            break;
                        case 2:
                            System.out.println("**** Entrer le nombre de Etudiant à Ajouter: ****");
                            int nbreEtudiantBNL = clavier.nextInt();
                            for (int i = 1; i <= nbreEtudiantBNL; i++){
                                int id = (i+1);
                                System.out.println("---- Entrer Votre prénom");
                                String prenom = clavier.next();
                                System.out.println("-------- Entrer Votre nom");
                                String nom = clavier.next();
                                System.out.println("---- Entrer Votre adresse");
                                String adresse = clavier.next();
                                String role = "ROLE_ETUDIANT";
                                int etat = 1; 
                                String matricule = "ET000"+i;
                                System.out.println("---- Entrer Votre telephone");
                                String telephone = clavier.next();
                                BourssierNonLoge etudBNL= new BourssierNonLoge(id,nom,prenom,role,etat,matricule,telephone,adresse);
                                services.addBourssierNonLoge(etudBNL);
                                // Personne pers= new Personne(id,prenom,nom,role,etat);
                                // services.addPersonne(pers);
                            }
                            services.listBourssieNonrLoge();
                            services.listEtudiant();
                            services.listPersonne();
                            break;
                        case 3:
                        System.out.println("**** Entrer le nombre de Etudiant à Ajouter: ****");
                        int nbreEtudiantNB = clavier.nextInt();
                        for (int i = 1; i <= nbreEtudiantNB; i++){
                            int id = (i+1);
                            System.out.println("---- Entrer Votre prénom");
                            String prenom = clavier.next();
                            System.out.println("-------- Entrer Votre nom");
                            String nom = clavier.next();
                            String role = "ROLE_ETUDIANT";
                            int etat = 1; 
                            String matricule = "ET000"+i;
                            System.out.println("---- Entrer Votre telephone");
                            String telephone = clavier.next();
                            NonBourssier etudNB= new NonBourssier(id,nom,prenom,role,etat,matricule,telephone);
                            services.addNonBourssier(etudNB);
                            // services.addPersonne(pers);
                        }
                        services.listNonBourssier();
                        services.listEtudiant();
                        break;

                    default:
                        break;

                    }

                break;
            default:
                break;
        }
    }

    
}
