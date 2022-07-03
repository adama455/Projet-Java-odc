package models;

public class User extends Personne{
    private String login;
    private String password;


    // Constructeur#######
    
    public User(int id, String prenom, String nom, String role, int etat, String login, String password) {
        super(id, prenom, nom, role, etat);
        this.login = login;
        this.password = password;
    }
    //Les Getters and Setters########
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
