import java.util.Scanner;

public class Game {

    // change the title to "_"
    public static String lines(String title) {
        String temp = "";
        for (int i = 0; i < title.length(); i++)
            temp = temp + "_";
        return temp;
    }

    public static String toChar(int index, String holder, String lined) {

        char[] tempChar = lined.toCharArray();
        char s = holder.charAt(0);
        tempChar[index] = s;
        lined = String.valueOf(tempChar);
        return lined;


    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int letterCheck = 0;
        int index = 10;
        // call the title lottery
        RandomMovie chosen = new RandomMovie();


        String title = RandomMovie.title;
        // count how many char are there
        int titleSize = RandomMovie.title.length();
      //  System.out.println(RandomMovie.title);

        String liner = lines(title);


        String holder = "";

        System.out.println(liner);
        for (int i = 0; i <= 50; i++) {
            System.out.println("you have " + i + " chance left");
            // take the char from the user
            holder = scanner.next();

            for(int j=0 ; j<title.length(); j++) {
                result = (title.charAt(j) + "").equals(holder);
                if (result) {
                    liner = toChar(j, holder, liner);

                    i++;
                }
            }
            System.out.println(liner);


        }


    }


}