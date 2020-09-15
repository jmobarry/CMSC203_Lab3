import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);	
	char prompt;
	
	do {
		
		Movie movie = new Movie();
		
		System.out.println("Enter the title of a movie"); //prompt the user to enter title of movie
		String movieTitle = keyboard.nextLine();
		movie.setTitle(movieTitle);
		
		System.out.println("Enter the rating of the movie"); //prompt the user to enter the movie rating
		String movieRating = keyboard.nextLine();
		movie.setRating(movieRating);
		
		System.out.println("Enter the number of tickets solf for this movie");
		int soldTickets = keyboard.nextInt();
		movie.setSoldTickets(soldTickets);
		
		System.out.println(movie.toString());
		
		System.out.println("Do you want to enter another? (y or no)");
		prompt = keyboard.next().toLowerCase().charAt(0);
		keyboard.nextLine();
		
	} while (prompt != 'n');
	System.out.println("Goodbye");
	
	keyboard.close();
	}

}
