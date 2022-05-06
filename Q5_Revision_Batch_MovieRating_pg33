import java.util.Scanner;

public class MovieMagic {

		int year;
		String title;
		float rating;
		
		MovieMagic()
		{
			year = 0;
			title = "";
			float rating = 0.0F;
		}
		
		void accept()
		{
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

			
			year = sc.nextInt();
			title = sc2.nextLine();
			rating = sc.nextFloat();
		}
		
		void display()
		{
			System.out.println("Title of the Movie is " + title);
			System.out.println("Year in which this movie is released is " + year);
			System.out.println("Rating of the movie is " + rating);
			
			if(rating>=0.0F && rating<=2.0)
				System.out.println("Flop");
			else if(rating>=2.1F && rating<=3.4F)
				System.out.println("Semi-hit");
			else if(rating>=3.5F && rating<=4.5)
				System.out.println("Hit");
			else if(rating>=4.6F && rating<=5.0)
				System.out.println("Super-hit");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MovieMagic movie = new MovieMagic();
			movie.accept();
			movie.display();
		}
		

}
