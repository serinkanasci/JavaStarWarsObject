public class Perso {
    
    private String lastname;
    private String firstname;

    public Perso(String lastname, String firstname)
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

    public void setLastname(String myLastname)
    {
        this.lastname = myLastname;
    }

    public void setFirstname(String myFirstname)
    {
        this.firstname = myFirstname;
    }}
