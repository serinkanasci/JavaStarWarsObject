import java.util.Comparator;

class SortByName implements Comparator<Acteur> 
{ 

    public int compare(Acteur a, Acteur b) 
    { 
        return a.getLastname().compareTo(b.getLastname()); 
    } 
} 