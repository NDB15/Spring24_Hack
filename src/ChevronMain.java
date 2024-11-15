import java.io.*;
import java.util.*;
public class ChevronMain {
    public static void main(String[] args) throws Exception {

        ArrayList <School> schoolList = new ArrayList<School>();
        ArrayList <Merchandise> swagList = new ArrayList<Merchandise>();

        BufferedReader inFile = new BufferedReader(new FileReader("//Users//nandihawkins//IdeaProjects//Chevron//src//Schools.csv"));
        String ln;



        //Read in the school data
        inFile.readLine();

        while((ln = inFile.readLine()) != null){ //Goes until no more data

            String [] data;

            data = ln.split(","); //Delimeter ',' character

            School school = new School();
            school.setName(data[0]);
            school.setPopulation(Integer.parseInt(data[1]));

            schoolList.add(school);

        }

        //Read in the swag data
        inFile = new BufferedReader(new FileReader("//Users//nandihawkins//IdeaProjects//Chevron//src//Swag.csv"));
        inFile.readLine();
        while((ln = inFile.readLine()) != null){ //Goes until no more data

            String [] data;

            data = ln.split(","); //Delimeter ',' character

            Merchandise swag = new Merchandise();
            swag.setName(data[0]);
            swag.setPrice(Double.parseDouble(data[1]));

            swagList.add(swag);

        }

        /*
        System.out.println(schoolList.get(0).toString());
        System.out.println(swagList.get(0).toString());
        */

    }//end main

    public static String printMenu() {
        return "Choose an Option:\nA. Search for Author\nB. Search for Year\nC. Search for Genre\nD.Quit Program\n";
    } //end printMenu
}//end class