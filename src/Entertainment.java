import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Entertainment {

    public static void main(String[] args) {
        int[] movieLength = {8, 2, 3, 6, 30, 12, 20};
        int flightLength = 20;
        System.out.print(systemHaveTwoMovies(flightLength, movieLength));
        System.out.println("");
        System.out.println(canTwoMoviesFillFlight(movieLength, flightLength));
    }

    private static boolean systemHaveTwoMovies(int flightLength, int[] movieLength) {
        for (int i = 0; i < movieLength.length; ++i) {
            for (int j = i + 1; j < movieLength.length; ++j) {
                if (((movieLength[i] + movieLength[j]) == flightLength)) {
                    System.out.println(movieLength[i] + "," + movieLength[j] + " :" + flightLength);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        // movie lengths we've seen so far
        Set<Integer> movieLengthsSeen = new HashSet<>();

        HashMap<String, String> chars = new HashMap<>();

        for (int firstMovieLength : movieLengths) {

            int matchingSecondMovieLength = flightLength - firstMovieLength;
            if (movieLengthsSeen.contains(matchingSecondMovieLength)) {
                return true;
            }

            movieLengthsSeen.add(firstMovieLength);
        }

        // we never found a match, so return false
        return false;
    }
}
