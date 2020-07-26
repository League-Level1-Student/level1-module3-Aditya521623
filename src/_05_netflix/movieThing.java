package _05_netflix;

public class movieThing {

	public static void main(String[] args) {
		Movie movie1= new Movie("Toy Story", 3);
		Movie movie2= new Movie("Avengers Endgame", 4);
		Movie movie3= new Movie("Avengers Infinity War", 5);
		Movie movie4= new Movie("Emoji Movie", 1);
		Movie movie5= new Movie("Ralph Breaks The Internet", 4);
		
		System.out.println(movie4.getTicketPrice());
		NetflixQueue nq1= new NetflixQueue();	
		
		nq1.addMovie(movie1);
		nq1.addMovie(movie2);
		nq1.addMovie(movie3);
		nq1.addMovie(movie4);
		nq1.addMovie(movie5);
		
		nq1.printMovies();
		
		System.out.println("the best movie is: " + nq1.getBestMovie());
		System.out.println("the second best movie is: " + nq1.getSecondBestMovie());

	}

}
