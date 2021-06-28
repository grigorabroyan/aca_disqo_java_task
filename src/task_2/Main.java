package task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cinema> cinemas = new ArrayList<>();

        Movie movie1 = new Movie("The Shawshank Redemption", generateRandomRating());
        Movie movie2 = new Movie("The Godfather", generateRandomRating());
        Movie movie3 = new Movie("The Dark Knight", generateRandomRating());
        Movie movie4 = new Movie("Schindler's List", generateRandomRating());
        Movie movie5 = new Movie("Pulp Fiction", generateRandomRating());
        Cartoon cartoon1 = new Cartoon("Toy Story", generateRandomRating());
        Cartoon cartoon2 = new Cartoon("Rick and Morty", generateRandomRating());
        Cartoon cartoon3 = new Cartoon("Avatar: The Last Airbender", generateRandomRating());
        Cartoon cartoon4 = new Cartoon("Batman: The Animated Series", generateRandomRating());
        Cartoon cartoon5 = new Cartoon("South Park", generateRandomRating());
        Cartoon cartoon6 = new Cartoon("Archer", generateRandomRating());

        cinemas.add(movie1);
        cinemas.add(movie2);
        cinemas.add(movie3);
        cinemas.add(movie4);
        cinemas.add(movie5);
        cinemas.add(cartoon1);
        cinemas.add(cartoon2);
        cinemas.add(cartoon3);
        cinemas.add(cartoon4);
        cinemas.add(cartoon5);
        cinemas.add(cartoon6);

        for (Cinema cinema : cinemas) {
            if (cinema.getClass() == Cartoon.class) {
                continue;
            }
            if (cinema.rating > 5) {
                System.out.println(cinema);
            }

        }

    }

    public static int generateRandomRating() {
        return (int) (Math.random() * (10 + 1));
    }
}