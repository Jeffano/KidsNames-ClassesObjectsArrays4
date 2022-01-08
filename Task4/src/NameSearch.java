import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws FileNotFoundException {

        //Initializing the variable
        String kidName;

        //Creates the scanner object
        Scanner input = new Scanner(System.in);

        //Creating the KidsPopularName object which affects which file it opens
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");

        //Asks the user for a name and reads it
        System.out.println("Enter Name");
        kidName = input.nextLine();

        //Checks if the name inputted by the user is listed the boysNames array by using the isPopularName method. If not, it uses the same
        //method and scans through the girlNames array. If the name is not listed in either Boys or Girls array, then it prints
        // It is not one of the most popular kids names
        if (boyNames.isPopularName(kidName)){
            System.out.println(kidName + " is a one of the most popular Boys name");
        } else if (girlNames.isPopularName(kidName)){
            System.out.println(kidName + " is a one of the most popular Girls name");
        }
        else{
            System.out.println("It is not one of the most popular kids names");
        }
    }
}
