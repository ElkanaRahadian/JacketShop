import java.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Vector<String> VecJacketCode = new Vector<>();
		Vector<String> VecJacketName = new Vector<>();
		Vector<String> VecJacketCategory = new Vector<>();
		Vector<String> VecReleaseDate = new Vector<>();
		Vector<String> VecJacketPrice = new Vector<>();
		
		String Code = "";
		String NamaJaket = "";
		String CategoryJaket = "";
		String DateJaket = "";
		int PriceJaket = 0;
		int inputanMenu = 0;
		
		do {
			do {
				System.out.println("Jacket Shop");
				System.out.println("=========");
				System.out.println("1. View Jackets");
				System.out.println("2. Add Jacket");
				System.out.println("3. Delete Jacket");
				System.out.println("4. Exit");
				
				inputanMenu = scan.nextInt(); scan.nextLine();
			}while(inputanMenu < 1 || inputanMenu > 4);
			switch(inputanMenu) {
			
			case 1 :
				if(VecJacketName.size() == 0) {
					System.out.println("No jackets available..");
				}else {
					
					System.out.println("---------------------------------------------------------------------------------------------");
					System.out.println("|No. |Jacket Code |Jacket Name         |Category         |Release Date         |Price       |");
					System.out.println("---------------------------------------------------------------------------------------------");
//					System.out.println("|1.  |JT739       |my jacket           |Leather          |17-12-2018           |Rp.17000    |");
//					System.out.println("|2.  |JT152       |fire jacket         |Varsity          |12-11-2015           |Rp.10000    |");
					for(int i = 0; i < VecJacketName.size(); i++) {
						System.out.println(i + 1 + (". | ") + VecJacketCode.get(i) + ("  |  ") + VecJacketName.get(i) 
						+ ("  |  ") + VecJacketCategory.get(i) + ("  |  ") + VecReleaseDate.get(i) + ("  |  ") + VecJacketPrice.get(i) 
						+ ("  |  "));
						System.out.println("---------------------------------------------------------------------------------------------");
						System.out.println("Press enter to continue..");
						scan.nextLine();
					}
				}
					
					break ;
					
			 case 2 :
				 do {
					 System.out.println("Input jacket's name[name ends with ' jacket']: ");
					 NamaJaket = scan.nextLine();
				 }while(!(NamaJaket.endsWith("jacket")));
				 do {
					 System.out.println("Input jacket's category[Bomber | Leather | Varsity] (case sensitive): ");
					 CategoryJaket = scan.nextLine();
				 }while(!(CategoryJaket.equals("Bomber") || CategoryJaket.equals("Leather") || CategoryJaket.equals("Varsity")));
				 do {
					 System.out.println("Input jacket's release date[dd-mm-yyyy]: ");
					 DateJaket = scan.nextLine();
				 }while(!(DateJaket.matches("([0-9]{2})-([0-9]{2})-([0-9]{4})")));
				 do {
					 System.out.println("Input jacket's price[more than or equals to 10000]: ");
					 PriceJaket = scan.nextInt(); scan.nextLine();
				 }while(PriceJaket < 10000);
				 
				 Random rand = new Random();
				 Code = "JT" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);
				 
				 VecJacketCode.add(Code);
				 VecJacketName.add(NamaJaket);
				 VecJacketCategory.add(CategoryJaket);
				 VecReleaseDate.add(DateJaket);
				 VecJacketPrice.add(PriceJaket);
				 System.out.println("Jacket added!");
				 System.out.println("Press enter to continue...");
				 scan.nextLine();
				 
				 break ;
				 
			 case 3 :
				 if (VecJacketName.size() == 0 ) {
					 System.out.println("No jackets avalaible..");
				 } else {
					 System.out.println("---------------------------------------------------------------------------------------------");
						System.out.println("|No. |Jacket Code |Jacket Name         |Category         |Release Date         |Price       |");
						System.out.println("---------------------------------------------------------------------------------------------");
						for (int i = 0; i < VecJacketName.size(); i++);
						System.out.println(i + 1 + (". | ") + VecJacketCode.get(i) + ("  |  ") + VecJacketName.get(i) 
						+ ("  |  ") + VecJacketCategory.get(i) + ("  |  ") + VecReleaseDate.get(i) + ("  |  ") + VecJacketPrice.get(i) 
						+ ("  |  "));
						System.out.println("---------------------------------------------------------------------------------------------");
						System.out.println("Choose jacket's number to delete[1 - " + VecJacketName.size() + +"]");
						HapusIndex = scan.nextInt(); scan.nextLine();
						VecJacketName.remove(HapusIndex - 1);
						System.out.println("Jacket removed!");
						System.out.println("To continue press Enter");
						scan.nextLine();
				 }
				 }
				 break;
				
			
			} while(inputanMenu != 4);
			System.out.println("Thank you for using this application!");
		}
}