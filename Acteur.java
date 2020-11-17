import java.util.ArrayList;

public class Acteur {

    private String lastname;
    private String firstname;
    private ArrayList<Perso> persos = new ArrayList<Perso>();


    public Acteur(String lastname, String firstname)
    {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String toString() {
        return "Nom : " + lastname + " Prenom : " + firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public String getFirstname()
    {
        return firstname;
    }
    
    public ArrayList<Perso> getPersos()
    {
        return persos;
    }

    public int nbPerso()
    {
        int nbPerso = 0;

        for(Perso x : persos){
            nbPerso++;
        }
        return nbPerso;
    }

    public void setLastname(String myLastname)
    {
        this.lastname = myLastname;
    }

    public void setFirstname(String myFirstname)
    {
        this.firstname = myFirstname;
    }

    public void addPerso(Perso perso)
    {
        persos.add(perso);
    }
}
