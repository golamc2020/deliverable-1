package deli1;
import java.util.Scanner;
public class Deli1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What kind of trip would you like to go on, Musical, Tropical, or Adventurous?");
		
		String vacationType;
		vacationType = scan.nextLine();
		
        System.out.println("How many are in your group?");
		
		int groupSize;
		groupSize=scan.nextInt();
		

        String result;

        if ((groupSize==1) | (groupSize==2)) {

        	result = "First Class";

        } else if ((groupSize==3) | (groupSize==4) | (groupSize==5)) {

        	result = "Helicopter";

        } else {

        	result = "Charter Flight";

        }

        switch (vacationType) {

        case "Musical":

            System.out.println("Since you're a group of " + groupSize + " going on a "+ vacationType+" vacation" + " you should take a "+ result+ " to New Orleans.");

            break;
        case "Tropical":

            System.out.println("Since you're a group of " + groupSize + " going on a "+vacationType+" vacation" + " you should take a "+ result+ " to Beach Vacation in Mexico.");
            
            break;
            
            
        case "Adventurous":

            System.out.println("Since you're a group of " + groupSize + " going on a "+vacationType+" vacation" + " you should take a "+result+" to Whitewater Rafting the Grand Canyon.");

            break;
    
            
            
	}

	}
}
