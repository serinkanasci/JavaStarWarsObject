import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {

    private String title;
    private int yearOut;
    private int numEpisode;
    private int cost;
    private int income;
    private ArrayList<Acteur> actors = new ArrayList<Acteur>();
    private Map<Perso, Acteur> relationPersoActeur = new HashMap<>();

    public Movie(String title, int yearOut, int numEpisode, int cost, int income) {
        this.title = title;
        this.yearOut = yearOut;
        this.numEpisode = numEpisode;
        this.cost = cost;
        this.income = income;
    }

    public String toString() {
        return "Titre : " + title + " Année de sortie : " + yearOut + " Numéro d'épisode : " + numEpisode + " Cout : "
                + cost + " Recette : " + income;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOut() {
        return yearOut;
    }

    public int getNumEpisode() {
        return numEpisode;
    }

    public int getCost() {
        return cost;
    }

    public int getIncome() {
        return income;
    }

    public Map<Perso, Acteur> getPersoActeur() {
        return relationPersoActeur;
    }

    public ArrayList<Acteur> getActors() {
        return actors;
    }

    public void setTitle(String myTitle) {
        this.title = myTitle;
    }

    public void setYearOut(int myYearOut) {
        this.yearOut = myYearOut;
    }

    public void setNumEpisode(int myNumEpisode) {
        this.numEpisode = myNumEpisode;
    }

    public void setCost(int myCost) {
        this.cost = myCost;
    }

    public void setIncome(int myIncome) {
        this.income = myIncome;
    }

    public void addActor(Acteur actor) {
        actors.add(actor);
    }

    public void addPersoActor(Perso perso, Acteur actor) {
        relationPersoActeur.put(perso, actor);
    }

    public int nbActeurs() {
        int nbActeur = 0;

        for (Acteur x : actors) {
            nbActeur++;
        }
        return nbActeur;
    }

    public int nbPersonnages() {
        return relationPersoActeur.size();
    }

    public Map<Integer, Boolean> calculBénéfice() {
        int Benef = income - cost;
        Map<Integer, Boolean> Benefice = new HashMap<Integer, Boolean>();
        if (Benef > 0) {
            Benefice.put(Benef, true);
        } else {
            Benefice.put(Benef, false);
        }
        return Benefice;
    }

    public Boolean isBefore(int year) {
        if (year < yearOut) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Acteur> tri() {
        // // System.out.println();
        Collections.sort(this.actors, new SortByName()); 
        return this.actors;

    }

    public static void makeBackup(ArrayList<Movie> movies) {
        List<String> movieBackup = new ArrayList<String>();
        // ArrayList<Integer, String, Integer> movieBackup = new ArrayList<>();
        for (int counter = 0; counter < movies.size(); counter++) { 
            // System.out.println(movies.size());
            Integer an = movies.get(counter).getYearOut();		      
            String title = movies.get(counter).getTitle();		      
            Map<Integer, Boolean> Benef = movies.get(counter).calculBénéfice();
            Integer benefice = (Integer) Benef.keySet().toArray()[0];

            String annee = String.valueOf(an); 
            String myBenefice = String.valueOf(benefice);
            String value = annee + " - " + title + " - " + myBenefice;
            movieBackup.add(value);	
        }
        System.out.println(movieBackup);
    }
}

