import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KidsPopularName {

    //Initializes the variable, and creates teh array
    String fileName;
    String[] kidsNames;
    int count = 0;

    //Creating teh KidsPopularName constructor
    KidsPopularName(String fileName){
        this.fileName = fileName;
    }

    //Method to count the number of name in the file
    public int getNumNames() throws FileNotFoundException {

        int numbers = 0;
        //Scans and reads through the file
        File f = new File(fileName);
        Scanner inputFile = new Scanner(f);

        //Counts the number of names if there is a next line
        while(inputFile.hasNext()){
            String str = inputFile.nextLine();
            numbers++;
        }
        //Closes the file
        inputFile.close();
        //Returns the number of names
        return numbers;
    }

    //Method to add names into an array
    public void fillNames() throws FileNotFoundException {
        //Storing the number of lines into a varibale
        count = getNumNames();

        //Creates an array with the count
        kidsNames = new String[count];

        //Using scanner to read from the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        //Using a for loop to read the names from the file and store in an array
        for (int i = 0; i < count; i++){
            kidsNames[i] = inputFile.nextLine();
        }
        //Closes the file
        inputFile.close();
    }

    public boolean isPopularName(String name) throws FileNotFoundException {
        //Runs the method to add to the array
        fillNames();

        //The res is set to false initially
        boolean res = false;

        //For loop to scan through the array
        for (int i = 0; i < count; i++){
            //Checks if the name matches. If it does, it sets res to true and breaks immediately
            if (name.equalsIgnoreCase(kidsNames[i])){
                res =  true;
                break;
            }
        }
        //Returns either true or false
        return res;
    }
}
