public class Kind extends Perso{
    private Boolean force;

    public Kind(String lastname, String firstname, Boolean force)
    {
        super(lastname, firstname);
        this.force = force;
    }

    public String toString() {
        return "Force : " + force;
    }

    public Boolean getForce()
    {
        return force;
    }

    public void setForce(Boolean myForce)
    {
        this.force = myForce;
    }
}
