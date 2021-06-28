package task_2;

public class Cartoon extends Cinema {
    public Cartoon(String title, int rating) {
        super(title, rating);
    }

    @Override
    public String toString() {
        return "Cartoon: " + title +
                ", rating: " + rating;
    }
}
