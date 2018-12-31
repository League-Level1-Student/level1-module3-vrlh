
public class NetflixRunner {
	public static void main(String[] args) {
		Movie duck = new Movie("Duck 1", 5);
		Movie crab = new Movie("Crab", 4);
		Movie duck2 = new Movie("Duck 2", 3);
		Movie duck3 = new Movie("Duck 3", 2);
		Movie duck4 = new Movie("Duck 4", 1);

		NetflixQueue net = new NetflixQueue();

		duck.getTicketPrice();

		net.addMovie(duck);
		net.addMovie(crab);
		net.addMovie(duck2);
		net.addMovie(duck3);
		net.addMovie(duck4);

		net.printMovies();

		System.out.println("the best movie is " + net.getBestMovie());
		System.out.println("the second best movie is " + net.getMovie(2));

	}
}
