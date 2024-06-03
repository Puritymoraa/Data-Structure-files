public class ApplicationMovieList {
    private CustomArrayList movieList;

    //This constructor will initialize the movie list
    public ApplicationMovieList() {
        movieList = new CustomArrayList();
    }

    //This method adds a movie to the list
    public void addMovie(String movieTitle, int yearReleased, double movieRating) {
        //creates a new movie object
        Movies newMovie = new Movies(movieTitle, yearReleased, movieRating);
        //adds the movie to the list
        movieList.add(newMovie);
    }

    //This method displays all movies in the list and iterates over the list and prints each movie
    public void displayMovies() {
        System.out.println("Movie List");
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i));
        }
    }

    //This method calculates the average rating of all movies, returns 0 if the list is empty,
    //sums the ratings of all movies and returns the average rating
    public double calculateAverageRating() {
        if (movieList.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0.0;
        for (int i = 0; i < movieList.size(); i++) {
            Movies movie = (Movies) movieList.get(i);
            totalRating += movie.getMovieRating();
        }
        return totalRating / movieList.size();
    }

    //This method removes a movie by title, iterates over the list to find the movie
    // and exits once the movie is found and removed
    public void removeMovieByTitle(String movieTitle) {
        for (int i = 0; i < movieList.size(); i++) {
            Movies movie = (Movies) movieList.get(i);
            if (movie.getMovieTitle().equals(movieTitle)) {
                movieList.remove(i);
                return;
            }
        }
        System.out.println("Movie with title '" + movieTitle + "' not found.");
    }


    public static void main(String[] args) {
        ApplicationMovieList app = new ApplicationMovieList();

        //I will now test the functionality of the code by adding movies and calling the display
        //method to see if the movies are added correctly.
        app.addMovie("Bridgerton Sn3", 2024, 9);
        app.addMovie("Grey's Anatomy", 2005, 8.5);
        app.addMovie("New Begginigs", 2020, 7.0);
        app.addMovie("Curse by the Sea", 2010, 8.0);
        app.addMovie("Legacies", 2017, 7.2);
        app.addMovie("Bye", 2027, 5);
        app.displayMovies();

        //Now let's calculate the average rating of the movies.
        double averageRating = app.calculateAverageRating();
        System.out.println("Average Rating: " + averageRating);

        //Let's try removing a movie by title and display the arrayList containing
        // the rest of the movies
        app.removeMovieByTitle("Legacies");
        app.displayMovies();
    }
}

class Movies {
    //Instance variables of the movie
    private String movieTitle;
    private int yearReleased;
    private double movieRating;

    //constructors to initialize the instance variables
    public Movies(String movieTitle, int yearReleased, double movieRating) {
        this.movieTitle = movieTitle;
        this.yearReleased = yearReleased;
        this.movieRating = movieRating;
    }

    //This is the getter for the release year
    public int getYearReleased() {
        return yearReleased;
    }

    //This is the getter for the movie title
    public String getMovieTitle() {
        return movieTitle;
    }

    //This is the getter for the movie rating
    public double getMovieRating() {
        return movieRating;
    }

    //Overriding toString() method for meaningful output
    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", yearReleased=" + yearReleased +
                ", movieRating=" + movieRating +
                '}';
    }
}

