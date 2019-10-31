import java.util.Scanner;
import java.io.File;
public class RandomMovie {


    public static String title;
    public static int wordCount;
    RandomMovie() throws Exception{

    int index=0;
       String line ;


        // read the file
        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);
        //create array  for movie titles form the file
        String[] titleArray = new String[100];


        //save in array each movie title
        while (fileScanner.hasNextLine()) {
           line = fileScanner.nextLine();


            titleArray[index]=line;
            index++;

       }
        // create  random number to chose the title
        int randomNumber= (int)(Math.random()*index);


          title=titleArray[randomNumber];

         wordCount=title.split(" ").length;
            }

}

