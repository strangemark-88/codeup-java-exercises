
package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        //    Give the user a list of options for viewing all the movies or viewing movies by category.
//        Input input = new Input();

        Movie[] movieArr = MoviesArray.findAll();


        boolean repeat = true;

        do switch (displayMenu()) {
            case 0:
                System.out.println("goodbye");
                repeat = false;
                break;
            case 1:
//                all movies
                for (Movie movie : movieArr) {
                    System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                }
                break;
            case 2:
//              animated category
                for (Movie movie : movieArr) {
                    if (movie.getMovieCategory().equals("animated")) {
                        System.out.println(movie.getMovieName());
                    }
                }
                break;
            case 3:
//              drama category
                for (Movie movie : movieArr) {
                    if (movie.getMovieCategory().equals("drama")) {
                        System.out.println(movie.getMovieName());
                    }
                }
                break;
            case 4:
//              horror category
                for (Movie movie : movieArr) {
                    if (movie.getMovieCategory().equals("horror")) {
                        System.out.println(movie.getMovieName());
                    }
                }
                break;
            case 5:
//              scifi category
                for (Movie movie : movieArr) {
                    if (movie.getMovieCategory().equals("scifi")) {
                        System.out.println(movie.getMovieName());
                    }
                }
                break;
            default:
                displayMenu();
                break;
        } while(repeat);
    }

    public static int displayMenu(){
        Input input = new Input();

        System.out.println("\n ----What would you like to do?----\n" +
                "\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "0 - exit\n" +
                "\n");

        return input.getInt(0,5);
    }

}
