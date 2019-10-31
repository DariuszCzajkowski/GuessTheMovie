public class ChangeLetter {


    //fields
int index;
String holder;
String lined;

    //methods

  String   ChangeLetter(int index, String holder, String lined) {

        char[] tempChar = lined.toCharArray();
        char s = holder.charAt(0);
        tempChar[index] = s;
        lined = String.valueOf(tempChar);
        return lined;



}}