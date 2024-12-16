public class Movie {
    private String name;
    private String movieRating;
    private int releaseDate;
    private double runTime;
    private int numOfStars;

    // default constructors
    public Movie() {
        this.name = "";
        this.movieRating = "";
        this.releaseDate = 0;
        this.runTime = 0.0;
        this.numOfStars = 0;
    }

    // non-default constructors
    public Movie(String name, String movieRating, int releaseDate, double runTime, int numOfStars) {
        this.name = name;
        this.movieRating = movieRating;
        this.releaseDate = releaseDate;
        this.runTime = runTime;
        this.numOfStars = numOfStars;
    }

    // here is where i will place the getter methods
    public String getName() { return name; }
    public String getMovieRating() { return movieRating; }
    public int getReleaseDate() { return releaseDate; }
    public double getRunTime() { return runTime; }
    public int getNumOfStars() { return numOfStars; }

    // here will be the setter methods
    public void setName(String name) { this.name = name; }
    public void setMovieRating(String movieRating) { this.movieRating = movieRating; }
    public void setReleaseDate(int releaseDate) { this.releaseDate = releaseDate; }
    public void setRunTime(double runTime) { this.runTime = runTime; }
    public void setNumOfStars(int numOfStars) { this.numOfStars = numOfStars; }

    // using @override toString() method
    @Override
    public String toString() {
        return "Movie{title='" + name + "', rating='" + movieRating + "', releaseDate=" + releaseDate +
                ", runtime=" + runTime + ", review=" + numOfStars + "}";
    }

    // again using @override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return releaseDate == movie.releaseDate &&
                Double.compare(movie.runTime, runTime) == 0 &&
                numOfStars == movie.numOfStars &&
                name.equals(movie.name) &&
                movieRating.equals(movie.movieRating);
    }
}
