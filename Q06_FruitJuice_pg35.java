

import java.util.Scanner;

public class FruitJuice {
		
		int product_code;
		String flavour;
		String pack_type;
		int pack_size;
		int product_price;
		
		FruitJuice()
		{
			product_code = 0;
			flavour = "NA";
			pack_type = "NA";
			pack_size = 0;
			product_price = 0;
			
			System.out.println("Product Code is " + product_code);
			System.out.println("Flavour is " + flavour);
			System.out.println("Pack Type is " + pack_type);
			System.out.println("Pack Size is " + pack_size);
			System.out.println("Product Price is " + product_price);
		}
		
		void input()
		{
			System.out.println("Give Inputs");
			
			Scanner sc = new Scanner(System.in);
			
			product_code = sc.nextInt();
			pack_size = sc.nextInt();
			product_price = sc.nextInt();
			
			
			Scanner sc2 = new Scanner(System.in);
			flavour = sc2.nextLine();
			pack_type = sc2.nextLine();
			
			
		}
		
		void discount()
		{
			product_price = product_price-10;
		}
		
		void display()
		{
			System.out.println("Product Code is " + product_code);
			System.out.println("Flavour is " + flavour);
			System.out.println("Pack Type is " + pack_type);
			System.out.println("Pack Size is " + pack_size);
			System.out.println("Product Price is " + product_price);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			FruitJuice FJ = new FruitJuice();
			
			FJ.input();
			FJ.discount();
			FJ.display();
			
		}
		
	}

