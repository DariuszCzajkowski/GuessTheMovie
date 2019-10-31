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
        boolean result;
        int letterCheck = 0;
        int index = 10;
        // call the title lottery
        RandomMovie chosen = new RandomMovie();
        int points=10;

        String title= RandomMovie.title;
        // count how many char are there
        
      

        String liner = lines(title);

        for(int i=0 ; i<title.length(); i++) {
            result = (title.charAt(i) + "").equals(" ");
            if (result) {
                liner = toChar(i, " ", liner);
            }
        }
            System.out.print("Guess what the title hides in underlines:   ");
        String holder = "";
        String wrongLetter=" ";
        System.out.print(liner+"\n");
        System.out.println(RandomMovie.wordCount+" words are in the title ");




       while(points>0) {
           holder = scanner.next();






            for(int i=0 ; i<title.length(); i++) {
                result = (title.charAt(i) + "").equals(holder);
                if (result) {
                    liner = toChar(i, holder, liner);
                }




            }   if (!title.contains(holder)){
                wrongLetter+=holder;
                points--;
           }

                System.out.println("you have " + points + " chance left");
           System.out.println("Guess another : "+liner );



              

               System.out.print("  Wrong letters : "+ wrongLetter);
               System.out.println("");
               if(liner.equals(title)){
                   System.out.println(" You won Congratulations!!!!");
               break;
               }
               if(points==0){
                   System.out.println("Sorry, You loose, maybe next time.  \n The title was: "+ title);
                   break;
               }


           }
       }
    }


