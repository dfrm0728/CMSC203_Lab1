//package Lab1_MovieDriver;

import java.util.Scanner;

/**
 * Driver Class to test and use an Object of the Movie class.
 * @author David Rodriguez
 *
 */
public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Movie movie = new Movie();
		char ch = ' ';
		
		do {
			System.out.println("Enter movie name:");
			movie.setTitle(scan.nextLine());
			
			System.out.println("Enter movie rating:");
			movie.setRating(scan.nextLine());
			
			System.out.println("Enter the number of tickets sold:");
			movie.setSoldTickets(scan.nextInt());
			
			System.out.println("\nGreat! These are your movie details:\n"
								+movie.toString());
			
			//ask (y)es  or (n)o
			do {
				System.out.println("Do you want to enter another movie?(y/n)");
				ch = scan.next().charAt(0);
				scan.nextLine();
			}while(ch != 'y' && ch!='n');
		
		}while(ch == 'y');
		
		//when answer is no
		System.out.println("Awesome! Goodbye!");
		
	}
	
}
