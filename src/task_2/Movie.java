package task_2;

public class Movie extends Cinema {
    public Movie(String title, int rating) {
        super(title, rating);
    }

    @Override
    public String toString() {
        return "Movie: " +
                title + ", rating: " + rating;
    }
}
