import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args)
    {
        Movie movie1 = new Movie("Star Wars, épisode IV : Un nouvel espoir", 1977, 4, 87458, 450215);

        Acteur actor1 = new Acteur("Mark","Hamill");
        Acteur actor2 = new Acteur("Carrie","Fisher");
        Acteur actor3 = new Acteur("Harrison","Ford");
        Acteur actor4 = new Acteur("Peter","Cushing");
        Acteur actor5 = new Acteur("Alec","Guinness");

        Perso perso1 = new Perso("Luke","Skywalker");
        Perso perso2 = new Perso("Leia","Organa");
        Perso perso3 = new Perso("Han","Solo");
        Perso perso4 = new Perso("Wilhuff","Tarkin");
        Perso perso5 = new Perso("Obi-Wan","Kenobi");

        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.addActor(actor3);
        movie1.addActor(actor4);
        movie1.addActor(actor5);

        actor1.addPerso(perso1);
        actor2.addPerso(perso2);
        actor3.addPerso(perso3);
        actor4.addPerso(perso4);
        actor5.addPerso(perso5);

        movie1.addPersoActor(perso1, actor1);
        movie1.addPersoActor(perso2, actor2);
        movie1.addPersoActor(perso3, actor3);
        movie1.addPersoActor(perso4, actor4);
        movie1.addPersoActor(perso5, actor5);

        
        // System.out.println(movie1.toString());
        // System.out.println(movie1.getActors());
        // System.out.println(movie1.getPersoActeur());

        // // CREATION DE FILM DEPUIS LE SCANNER // // 
        // Scanner in = new Scanner(System.in); 

        // System.out.println("Quel est le nom du film ?");
        // String myTitle = in.nextLine(); 
        // System.out.println("En quelle année ?");
        // int myYearOut = in.nextInt(); 
        // System.out.println("Quel épisode ?");
        // int myEpisode = in.nextInt(); 
        // System.out.println("Quel est son cout ?");
        // int myCost = in.nextInt(); 
        // System.out.println("Quelle est sa recette ?");
        // int myIncome = in.nextInt(); 
        // System.out.println("Combien d'acteurs ?");
        // int nbActors = in.nextInt(); 
        // in.nextLine();

        // Movie movie2 = new Movie(myTitle, myYearOut, myEpisode, myCost, myIncome);

        // int x = 1;
        // while(x != (nbActors + 1))
        // {
        //     System.out.println("Quel est le nom de l'acteur " + x + " ?");
        //     String lastname = in.nextLine(); 
        //     System.out.println("Quel est le prenom de l'acteur " + x + " ?");
        //     String firstname = in.nextLine(); 
        //     Acteur actor = new Acteur(lastname, firstname);
        //     movie2.addActor(actor);
        //     x++;
        // }

        // in.close();
        // System.out.println(movie2.toString());
        // System.out.println(movie2.getActors());

        Acteur actor6 = new Acteur("Eddy", "Murphy"); 
        Acteur actor7 = new Acteur("AJamal", "Mixon");
        Perso perso6 = new Perso("Buddy","Love");
        Perso perso7 = new Perso("Papa","Klump");
        Perso perso8 = new Perso("Norbit","Rice");
        Perso perso9 = new Perso("Ernie","Klump Jr.");

        actor6.addPerso(perso6);
        actor6.addPerso(perso7);
        actor6.addPerso(perso8);
        actor7.addPerso(perso9);
        
        Movie movieTest = new Movie("The Nutty Professor", 1996, 1, 125000, 273961019);
        Movie movieTest2 = new Movie("Norbit", 2007, 1, 545435, 159000000);

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(movieTest);
        movies.add(movieTest2);

        movieTest.addActor(actor6);
        movieTest.addActor(actor7);
        movieTest.addPersoActor(perso6, actor6);
        movieTest.addPersoActor(perso7, actor6);
        movieTest.addPersoActor(perso9, actor7);


        movieTest2.addActor(actor6);
        movieTest2.addPersoActor(perso8, actor6);

        System.out.println(movieTest.nbPersonnages());
        System.out.println(movieTest.tri());
        
        Movie.makeBackup(movies);

    }

}
