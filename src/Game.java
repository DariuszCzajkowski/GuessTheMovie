

import java.util.Scanner;

public class Game {


public static void main(String [] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    int letterCheck = 0;
    int index = 10;
// call the title lottery
    RandomMovie chosen = new RandomMovie();


    String title = RandomMovie.title;
    // count how many char are there
    int titleSize= RandomMovie.title.length();
    System.out.println(RandomMovie.title);


    System.out.println();




    for (int i = 0; i <= 10; i++) {
        System.out.println("you have " + index + " chance left");
        // take the char from the user
       String  holder= scanner.nextLine();

        letterCheck = title.indexOf(holder);
        // check char if it match to the title
      if (letterCheck>=0){

            System.out.println( );

      }

       System.out.println(letterCheck);


        index--;
    }


}}