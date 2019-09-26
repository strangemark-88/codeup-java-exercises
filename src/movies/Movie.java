package movies;

public class Movie {

    //    Create a class named Movie. It should have private fields for name and category,
    //    and a constructor that sets both of these.

    private String name;
    private String category;

    Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    //    Create methods to access these properties and change them (getters and setters).
//  //    hit control + enter to open the generate menu to make constructor and getters/setters


    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }

    public void setMovieName(String name){
        this.name = name;
    }

    public void setMovieCategory(String category){
        this.category = category;
    }
}
