public class Mean extends Perso{
    private Boolean darkSide;

    public Mean(String lastname, String firstname, Boolean darkSide)
    {
        super(lastname, firstname);
        this.darkSide = darkSide;
    }

    public String toString() {
        return "Force : " + darkSide;
    }

    public Boolean getDrakSide()
    {
        return darkSide;
    }

    public void setDarkSide(Boolean myDarkSide)
    {
        this.darkSide = myDarkSide;
    }

}
